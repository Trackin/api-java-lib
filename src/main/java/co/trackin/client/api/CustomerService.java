package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.Void;
import co.trackin.client.ApiInvoker;

import java.util.*;

import co.trackin.client.model.Customer;
import co.trackin.client.model.CustomerForm;

import java.util.Map;
import java.util.HashMap;

import static co.trackin.client.ApiInvoker.deserialize;
import static java.lang.String.valueOf;

public class CustomerService {
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
    
  public List<Customer> getAll (Long companyId, String query, Integer page, Integer per_page) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();


      if (!"null".equals(valueOf(query)))
          queryParams.put("query", valueOf(query));
      if (!"null".equals(valueOf(page)))
          queryParams.put("page", valueOf(page));
      if (!"null".equals(valueOf(per_page)))
          queryParams.put("per_page", valueOf(per_page));


      try {
          String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (List<Customer>) deserialize(response, "array", Customer.class);
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
  
    
  public Customer createCustomer (Long companyId, Customer body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "POST", queryParams, body, headerParams);
          if (response != null) {
              return (Customer) deserialize(response, "", Customer.class);
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
  
    
  public Customer getOneCustomer (Long companyId, Long customerId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers/{customerId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
              .replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (Customer) deserialize(response, "", Customer.class);
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
  
    
  public Customer updateCustomer (Long companyId, Long customerId, CustomerForm body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers/{customerId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
              .replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "PUT", queryParams, body, headerParams);
          if (response != null) {
              return (Customer) deserialize(response, "", Customer.class);
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
  
    
  public co.trackin.client.model.Void deleteCustomer (Long customerId, Long companyId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers/{customerId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString()))
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "DELETE", queryParams, null, headerParams);
          if (response != null) {
              return (Void) deserialize(response, "", Void.class);
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
