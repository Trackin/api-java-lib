package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.ApiInvoker;
import co.trackin.client.model.Void;
import co.trackin.client.model.DeliveryZoneVM;

import java.util.HashMap;
import java.util.Map;

public class DeliveryZoneService {
    ApiInvoker apiInvoker = ApiInvoker.getInstance();

    public ApiInvoker getInvoker() {
        return apiInvoker;
    }

    public DeliveryZoneVM createDeliveryZone(Long companyId, DeliveryZoneVM body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/zones".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "POST", queryParams, body, headerParams);
            if (response != null) {
                return (DeliveryZoneVM) ApiInvoker.deserialize(response, "", DeliveryZoneVM.class);
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


    public DeliveryZoneVM getOneDeliveryZone(Long companyId, Long zoneId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/zones/{zoneId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
                .replaceAll("\\{" + "zoneId" + "\\}", apiInvoker.escapeString(zoneId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (DeliveryZoneVM) ApiInvoker.deserialize(response, "", DeliveryZoneVM.class);
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


    public DeliveryZoneVM updateDeliveryZone(Long companyId, Long zoneId, DeliveryZoneVM body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/zones/{zoneId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
                .replaceAll("\\{" + "zoneId" + "\\}", apiInvoker.escapeString(zoneId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (DeliveryZoneVM) ApiInvoker.deserialize(response, "", DeliveryZoneVM.class);
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


    public co.trackin.client.model.Void deleteDeliveryZone(Long companyId, Long zoneId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/zones/{zoneId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
                .replaceAll("\\{" + "zoneId" + "\\}", apiInvoker.escapeString(zoneId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "DELETE", queryParams, null, headerParams);
            if (response != null) {
                return (Void) ApiInvoker.deserialize(response, "", Void.class);
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
