package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.Customer;
import co.trackin.client.model.CustomerForm;
import co.trackin.client.model.Void;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.valueOf;

public class CustomerService {
  TrackinApi trackinApi;

  CustomerService(TrackinApi trackinApi) {
      this.trackinApi = trackinApi;
  }

  public List<Customer> getAll (Long companyId, String query, Integer page, Integer per_page) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

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
          String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (List<Customer>) trackinApi.deserialize(response, "array", Customer.class);
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


  public Customer create(Long companyId, Customer body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = trackinApi.invokeAPI(path, "POST", queryParams, body, headerParams);
          if (response != null) {
              return (Customer) trackinApi.deserialize(response, "", Customer.class);
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


  public Customer getOne(Long companyId, Long customerId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers/{customerId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
              .replaceAll("\\{" + "customerId" + "\\}", trackinApi.escapeString(customerId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (Customer) trackinApi.deserialize(response, "", Customer.class);
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


  public Customer update(Long companyId, Long customerId, CustomerForm body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers/{customerId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
              .replaceAll("\\{" + "customerId" + "\\}", trackinApi.escapeString(customerId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = trackinApi.invokeAPI(path, "PUT", queryParams, body, headerParams);
          if (response != null) {
              return (Customer) trackinApi.deserialize(response, "", Customer.class);
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


  public co.trackin.client.model.Void delete(Long customerId, Long companyId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/customers/{customerId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "customerId" + "\\}", trackinApi.escapeString(customerId.toString()))
              .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = trackinApi.invokeAPI(path, "DELETE", queryParams, null, headerParams);
          if (response != null) {
              return (Void) trackinApi.deserialize(response, "", Void.class);
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
