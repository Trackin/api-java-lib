package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.ApiInvoker;
import co.trackin.client.model.DeliveryFormUpdate;
import co.trackin.client.model.Delivery;
import co.trackin.client.model.Device;

import java.util.*;

import co.trackin.client.model.DeliveryForm;

import java.util.Map;
import java.util.HashMap;

import static java.lang.String.valueOf;

public class DeliveryService {
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

    
  public List<Delivery> getAllDeliveries (Long companyId, Long after, Long before, String status) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/orders".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();


      if (!"null".equals(valueOf(after)))
          queryParams.put("after", valueOf(after));
      if (!"null".equals(valueOf(before)))
          queryParams.put("before", valueOf(before));
      if (!"null".equals(valueOf(status)))
          queryParams.put("status", valueOf(status));


      try {
          String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (List<Delivery>) ApiInvoker.deserialize(response, "array", Delivery.class);
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
  
    
  public Delivery createDelivery (Long companyId, DeliveryForm body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/orders".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "POST", queryParams, body, headerParams);
          if (response != null) {
              return (Delivery) ApiInvoker.deserialize(response, "", Delivery.class);
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
  
    
  public Delivery updateDelivery (Long deliveryId, DeliveryFormUpdate body, Long companyId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/orders/{deliveryId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "deliveryId" + "\\}", apiInvoker.escapeString(deliveryId.toString()))
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "PUT", queryParams, body, headerParams);
          if (response != null) {
              return (Delivery) ApiInvoker.deserialize(response, "", Delivery.class);
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
  
    
  public Delivery cancelDelivery (String api_key, Long companyId, Long sub_id, Long idOrder) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/orders/{idOrder}/cancel".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
              .replaceAll("\\{" + "idOrder" + "\\}", apiInvoker.escapeString(idOrder.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "PUT", queryParams, null, headerParams);
          if (response != null) {
              return (Delivery) ApiInvoker.deserialize(response, "", Delivery.class);
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
  
    
  public Delivery dispatch (Long idOrder, Long companyId, Device body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/orders/{idOrder}/dispatch".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "idOrder" + "\\}", apiInvoker.escapeString(idOrder.toString()))
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "PUT", queryParams, body, headerParams);
          if (response != null) {
              return (Delivery) ApiInvoker.deserialize(response, "", Delivery.class);
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
  
    
  public Delivery endDelivery (String api_key, Long companyId, Long sub_id, Long idOrder) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/orders/{idOrder}/end".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
              .replaceAll("\\{" + "idOrder" + "\\}", apiInvoker.escapeString(idOrder.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "PUT", queryParams, null, headerParams);
          if (response != null) {
              return (Delivery) ApiInvoker.deserialize(response, "", Delivery.class);
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
  
    
  public Delivery getOneDelivery (Long companyId, Long orderId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/orders/{orderId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
              .replaceAll("\\{" + "orderId" + "\\}", apiInvoker.escapeString(orderId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (Delivery) ApiInvoker.deserialize(response, "", Delivery.class);
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
