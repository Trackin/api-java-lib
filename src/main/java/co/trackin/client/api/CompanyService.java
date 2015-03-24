package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.ApiInvoker;

import java.util.*;

import co.trackin.client.model.Company;
import co.trackin.client.model.CompanyForm;
import co.trackin.client.model.CompanyFormUpdate;

import co.trackin.client.model.Void;

import java.util.Map;
import java.util.HashMap;

import static co.trackin.client.ApiInvoker.deserialize;
import static java.lang.String.valueOf;

public class CompanyService {
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
    
  public List<Company> getAllCompanies (String _for, String mode) throws ApiException {

      // create path and map variables
      String path = "/service/api/json/1.1/companies".replaceAll("\\{format\\}", "json");

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();


      if (!"null".equals(valueOf(_for)))
          queryParams.put("for", valueOf(_for));
      if (!"null".equals(valueOf(mode)))
          queryParams.put("mode", valueOf(mode));


      try {
          String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (List<Company>) deserialize(response, "array", Company.class);
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
  
    
  public Company createCompany (CompanyForm body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies".replaceAll("\\{format\\}", "json");

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "POST", queryParams, body, headerParams);
          if (response != null) {
              return (Company) deserialize(response, "", Company.class);
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
  
    
  public Company getOneCompany (Long companyId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
          if (response != null) {
              return (Company) deserialize(response, "", Company.class);
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
  
    
  public Company updateCompany (Long companyId, CompanyFormUpdate body) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "PUT", queryParams, body, headerParams);
          if (response != null) {
              return (Company) deserialize(response, "", Company.class);
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
  
    
  public Void updateCompanyAccounts (Long companyId, Long accountId) throws ApiException {


      // create path and map variables
      String path = "/service/api/json/1.1/companies/{companyId}/account/{accountId}".replaceAll("\\{format\\}", "json")
              .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
              .replaceAll("\\{" + "accountId" + "\\}", apiInvoker.escapeString(accountId.toString()));

      // query params
      Map<String, String> queryParams = new HashMap<String, String>();
      Map<String, String> headerParams = new HashMap<String, String>();



      try {
          String response = apiInvoker.invokeAPI(path, "PUT", queryParams, null, headerParams);
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
