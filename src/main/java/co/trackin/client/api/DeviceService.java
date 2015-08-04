package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.Device;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceService {
    TrackinApi trackinApi;

    DeviceService(TrackinApi trackinApi) {
        this.trackinApi = trackinApi;
    }

    public List<Device> getAll(Long companyId) throws ApiException {
        Object postBody = null;


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/devices".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "GET", queryParams, postBody, headerParams);
            if (response != null) {
                return (List<Device>) trackinApi.deserialize(response, "array", Device.class);
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


    public Device create(Long companyId, Device body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/devices".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "POST", queryParams, body, headerParams);
            if (response != null) {
                return (Device) trackinApi.deserialize(response, "", Device.class);
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


    public Device getOne(Long companyId, Long deviceId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/devices/{deviceId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "deviceId" + "\\}", trackinApi.escapeString(deviceId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (Device) trackinApi.deserialize(response, "", Device.class);
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
