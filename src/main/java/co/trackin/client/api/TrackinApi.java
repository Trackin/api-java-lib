package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.JsonUtil;
import com.fasterxml.jackson.databind.JavaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.Response.Status.Family;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackinApi {
    public CompanyService companies;
    public ContactService contacts;
    public CustomerService customers;
    public DeliveryService deliveries;
    public DeliveryZoneService deliveryZones;
    public DeviceService devices;
    public MiscellaneousService miscellaneous;
    private String host = "https://backend.app.trackin.co/";
    private String ApiKey;
    private Long SubId;
    private Map<String, Client> hostMap = new HashMap<String, Client>();
    private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
    private boolean isDebug = false;

    public TrackinApi(String apiKey, Long subId) {
        this.ApiKey = apiKey;
        this.SubId = subId;
        this.companies = new CompanyService(this);
        this.contacts = new ContactService(this);
        this.customers = new CustomerService(this);
        this.deliveries = new DeliveryService(this);
        this.deliveryZones = new DeliveryZoneService(this);
        this.devices = new DeviceService(this);
        this.miscellaneous = new MiscellaneousService(this);
    }

    public TrackinApi(String apiKey, Long subId, String host) {
        this(apiKey, subId);
        this.host = host;
    }


    public String getApiKey() {
        return ApiKey;
    }

    public Long getSubId() {
        return SubId;
    }

    public void enableDebug() {
        isDebug = true;
    }

    public void addDefaultHeader(String key, String value) {
        defaultHeaderMap.put(key, value);
    }

    public String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    public Object deserialize(String json, String containerType, Class cls) throws ApiException {
        if (null != containerType) {
            containerType = containerType.toLowerCase();
        }
        try {
            if ("list".equals(containerType) || "array".equals(containerType)) {
                JavaType typeInfo = JsonUtil.getJsonMapper().getTypeFactory().constructCollectionType(List.class, cls);
                List response = (List<?>) JsonUtil.getJsonMapper().readValue(json, typeInfo);
                return response;
            } else if (String.class.equals(cls)) {
                if (json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1)
                    return json.substring(1, json.length() - 2);
                else
                    return json;
            } else {
                return JsonUtil.getJsonMapper().readValue(json, cls);
            }
        } catch (IOException e) {
            throw new ApiException(500, e.getMessage());
        }
    }

    public String serialize(Object obj) throws ApiException {
        try {
            if (obj != null)
                return JsonUtil.getJsonMapper().writeValueAsString(obj);
            else
                return null;
        } catch (Exception e) {
            throw new ApiException(500, e.getMessage());
        }
    }

    public String getHost() {
        return this.host;
    }


    public String invokeAPI(String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams) throws ApiException {
        Client client = getClient(host);
        String contentType = "application/json";

        StringBuilder b = new StringBuilder();

        for (String key : queryParams.keySet()) {
            String value = queryParams.get(key);
            if (value != null) {
                if (b.toString().length() == 0)
                    b.append("?");
                else
                    b.append("&");
                b.append(escapeString(key)).append("=").append(escapeString(value));
            }
        }
        String querystring = b.toString();

        Builder builder = client.resource(host + path + querystring).accept("application/json");

        if (ApiKey == null || ApiKey.isEmpty()) {
            throw new ApiException(1, "You must set an api key [using ApiInvoker.setApiKey()]");
        }
        if (SubId == null) {
            throw new ApiException(1, "You must set an api key [using ApiInvoker.setSubId()]");
        }
        headerParams.put("api_key", ApiKey);
        headerParams.put("sub_id", SubId.toString());

        for (String key : headerParams.keySet()) {
            builder = builder.header(key, headerParams.get(key));
        }

        for (String key : defaultHeaderMap.keySet()) {
            if (!headerParams.containsKey(key)) {
                builder = builder.header(key, defaultHeaderMap.get(key));
            }
        }
        ClientResponse response = null;

        if ("GET".equals(method)) {
            response = builder.get(ClientResponse.class);
        } else if ("POST".equals(method)) {
            if (body == null)
                response = builder.post(ClientResponse.class, null);
            else if (body instanceof FormDataMultiPart) {
                response = builder.type(contentType).post(ClientResponse.class, body);
            } else
                response = builder.type(contentType).post(ClientResponse.class, serialize(body));
        } else if ("PUT".equals(method)) {
            if (body == null)
                response = builder.put(ClientResponse.class, serialize(body));
            else {
                response = builder.type(contentType).put(ClientResponse.class, serialize(body));
            }
        } else if ("DELETE".equals(method)) {
            if (body == null)
                response = builder.delete(ClientResponse.class, serialize(null));
            else
                response = builder.type(contentType).delete(ClientResponse.class, serialize(body));
        } else {
            throw new ApiException(500, "unknown method type " + method);
        }
        if (response.getClientResponseStatus() == ClientResponse.Status.NO_CONTENT) {
            return null;
        } else if (response.getClientResponseStatus().getFamily() == Family.SUCCESSFUL) {
            return response.getEntity(String.class);
        } else {
            throw new ApiException(
                    response.getClientResponseStatus().getStatusCode(),
                    response.getEntity(String.class));
        }
    }

    private Client getClient(String host) {
        if (!hostMap.containsKey(host)) {
            Client client = Client.create();
            if (isDebug)
                client.addFilter(new LoggingFilter());
            hostMap.put(host, client);
        }
        return hostMap.get(host);
    }
}
