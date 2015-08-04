package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.DeliveryZoneVM;

import java.util.HashMap;
import java.util.Map;

public class DeliveryZoneService {
    TrackinApi trackinApi;

    DeliveryZoneService(TrackinApi trackinApi) {
        this.trackinApi = trackinApi;
    }

    public DeliveryZoneVM create(Long companyId, DeliveryZoneVM body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/zones".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "POST", queryParams, body, headerParams);
            if (response != null) {
                return (DeliveryZoneVM) trackinApi.deserialize(response, "", DeliveryZoneVM.class);
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


    public DeliveryZoneVM getOne(Long companyId, Long zoneId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/zones/{zoneId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "zoneId" + "\\}", trackinApi.escapeString(zoneId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (DeliveryZoneVM) trackinApi.deserialize(response, "", DeliveryZoneVM.class);
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


    public DeliveryZoneVM update(Long companyId, Long zoneId, DeliveryZoneVM body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/zones/{zoneId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "zoneId" + "\\}", trackinApi.escapeString(zoneId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (DeliveryZoneVM) trackinApi.deserialize(response, "", DeliveryZoneVM.class);
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


    public void delete(Long companyId, Long zoneId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/zones/{zoneId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "zoneId" + "\\}", trackinApi.escapeString(zoneId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();

        trackinApi.invokeAPI(path, "DELETE", queryParams, null, headerParams);
    }

}
