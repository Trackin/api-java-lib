package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.ApiInvoker;
import co.trackin.client.model.Device;

import java.util.*;

import java.util.Map;
import java.util.HashMap;

public class DeviceService {
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
    
  public List<Device> getAllDevices (Long companyId) throws ApiException {
      Object postBody = null;


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/devices".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "GET", queryParams, postBody, headerParams);
          if (response != null) {
              return (List<Device>) ApiInvoker.deserialize(response, "array", Device.class);
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
  
    
  public Device createDevice (Long companyId, Device body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/devices".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "POST", queryParams, body, headerParams);
          if (response != null) {
              return (Device) ApiInvoker.deserialize(response, "", Device.class);
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
  
    
  public Device getOneDevice (Long companyId, Long deviceId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/devices/{deviceId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
              .replaceAll("\\{" + "deviceId" + "\\}", apiInvoker.escapeString(deviceId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (Device) ApiInvoker.deserialize(response, "", Device.class);
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
