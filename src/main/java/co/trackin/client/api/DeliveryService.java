package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.Delivery;
import co.trackin.client.model.DeliveryForm;
import co.trackin.client.model.DeliveryFormUpdate;
import co.trackin.client.model.Device;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.valueOf;

public class DeliveryService {
    TrackinApi trackinApi;

    DeliveryService(TrackinApi trackinApi) {
        this.trackinApi = trackinApi;
    }

    public List<Delivery> getAll(Long companyId, Long after, Long before, String status) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/orders".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        if (after != null && after > 0)
            queryParams.put("after", valueOf(after));
        if (before != null && before > 0)
            queryParams.put("before", valueOf(before));
        if (status != null && !status.isEmpty())
            queryParams.put("status", valueOf(status));


        try {
            String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (List<Delivery>) trackinApi.deserialize(response, "array", Delivery.class);
            } else {
                return null;
            }
        } catch (ApiException ex) {
            if (ex.getCode() == 404) {
                return null;
            } else {
                throw ex;
            }
        }
    }


    public Delivery create(Long companyId, DeliveryForm body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/orders".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "POST", queryParams, body, headerParams);
            if (response != null) {
                return (Delivery) trackinApi.deserialize(response, "", Delivery.class);
            } else {
                return null;
            }
        } catch (ApiException ex) {
            if (ex.getCode() == 404) {
                return null;
            } else {
                throw ex;
            }
        }
    }


    public Delivery update(Long deliveryId, DeliveryFormUpdate body, Long companyId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/orders/{deliveryId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "deliveryId" + "\\}", trackinApi.escapeString(deliveryId.toString()))
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (Delivery) trackinApi.deserialize(response, "", Delivery.class);
            } else {
                return null;
            }
        } catch (ApiException ex) {
            if (ex.getCode() == 404) {
                return null;
            } else {
                throw ex;
            }
        }
    }


    public Delivery cancel(String api_key, Long companyId, Long sub_id, Long idOrder) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/orders/{idOrder}/cancel".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "idOrder" + "\\}", trackinApi.escapeString(idOrder.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "PUT", queryParams, null, headerParams);
            if (response != null) {
                return (Delivery) trackinApi.deserialize(response, "", Delivery.class);
            } else {
                return null;
            }
        } catch (ApiException ex) {
            if (ex.getCode() == 404) {
                return null;
            } else {
                throw ex;
            }
        }
    }


    public Delivery dispatch(Long idOrder, Long companyId, Device body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/orders/{idOrder}/dispatch".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "idOrder" + "\\}", trackinApi.escapeString(idOrder.toString()))
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (Delivery) trackinApi.deserialize(response, "", Delivery.class);
            } else {
                return null;
            }
        } catch (ApiException ex) {
            if (ex.getCode() == 404) {
                return null;
            } else {
                throw ex;
            }
        }
    }


    public Delivery end(String api_key, Long companyId, Long sub_id, Long idOrder) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/orders/{idOrder}/end".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "idOrder" + "\\}", trackinApi.escapeString(idOrder.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "PUT", queryParams, null, headerParams);
            if (response != null) {
                return (Delivery) trackinApi.deserialize(response, "", Delivery.class);
            } else {
                return null;
            }
        } catch (ApiException ex) {
            if (ex.getCode() == 404) {
                return null;
            } else {
                throw ex;
            }
        }
    }


    public Delivery getOne(Long companyId, Long orderId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/orders/{orderId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "orderId" + "\\}", trackinApi.escapeString(orderId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (Delivery) trackinApi.deserialize(response, "", Delivery.class);
            } else {
                return null;
            }
        } catch (ApiException ex) {
            if (ex.getCode() == 404) {
                return null;
            } else {
                throw ex;
            }
        }
    }

}
