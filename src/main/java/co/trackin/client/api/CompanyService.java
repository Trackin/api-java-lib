package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.Company;
import co.trackin.client.model.CompanyForm;
import co.trackin.client.model.CompanyFormUpdate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.valueOf;

public class CompanyService {
  TrackinApi trackinApi;

  CompanyService(TrackinApi trackinApi) {
      this.trackinApi = trackinApi;
  }

  public List<Company> getAll(String deliveryAddress, String mode) throws ApiException {

      // create path and map variables
      String path = "/service/api/json/1.1/companies".replaceAll("\\{format\\}", "json");

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();


      if (!"null".equals(valueOf(deliveryAddress)))
          queryParams.put("for", valueOf(deliveryAddress));
      if (!"null".equals(valueOf(mode)))
          queryParams.put("mode", valueOf(mode));


      try {
          String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (List<Company>) trackinApi.deserialize(response, "array", Company.class);
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
  
    
  public Company create(CompanyForm body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies".replaceAll("\\{format\\}", "json");

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = trackinApi.invokeAPI(path, "POST", queryParams, body, headerParams);
          if (response != null) {
              return (Company) trackinApi.deserialize(response, "", Company.class);
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
  
    
  public Company getOne(Long companyId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (Company) trackinApi.deserialize(response, "", Company.class);
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
  
    
  public Company update(Long companyId, CompanyFormUpdate body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = trackinApi.invokeAPI(path, "PUT", queryParams, body, headerParams);
          if (response != null) {
              return (Company) trackinApi.deserialize(response, "", Company.class);
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
  
    
  public void updateCompanyAccounts (Long companyId, Long accountId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/account/{accountId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
              .replaceAll("\\{" + "accountId" + "\\}", trackinApi.escapeString(accountId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();

      trackinApi.invokeAPI(path, "PUT", queryParams, null, headerParams);

  }
  
}
