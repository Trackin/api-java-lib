package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    TrackinApi trackinApi;

    ContactService(TrackinApi trackinApi) {

        this.trackinApi = trackinApi;
    }

    public Contact addToCompany(Long companyId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/contacts".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "POST", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) trackinApi.deserialize(response, "", Contact.class);
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


    public Contact updateOnCompany(Long companyId, Long contactId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "contactId" + "\\}", trackinApi.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) trackinApi.deserialize(response, "", Contact.class);
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


    public void deleteFromCompany(Long companyId, Long contactId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", trackinApi.escapeString(companyId.toString()))
                .replaceAll("\\{" + "contactId" + "\\}", trackinApi.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();

        String response = trackinApi.invokeAPI(path, "DELETE", queryParams, null, headerParams);
    }


    public Contact getOne(Long contactId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "contactId" + "\\}", trackinApi.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (Contact) trackinApi.deserialize(response, "", Contact.class);
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


    public Contact update(Long contactId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "contactId" + "\\}", trackinApi.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) trackinApi.deserialize(response, "", Contact.class);
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


    public void delete(Long contactId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "contactId" + "\\}", trackinApi.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();

        String response = trackinApi.invokeAPI(path, "DELETE", queryParams, null, headerParams);
    }

    public Contact addToCustomer(Long customerId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/customers/{customerId}/contacts".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "customerId" + "\\}", trackinApi.escapeString(customerId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "POST", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) trackinApi.deserialize(response, "", Contact.class);
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


    public Contact updateOnCustomer(Long customerId, Long contactId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/customers/{customerId}/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "customerId" + "\\}", trackinApi.escapeString(customerId.toString()))
                .replaceAll("\\{" + "contactId" + "\\}", trackinApi.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) trackinApi.deserialize(response, "", Contact.class);
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


    public void deleteFromCustomer(Long customerId, Long contactId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/customers/{customerId}/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "customerId" + "\\}", trackinApi.escapeString(customerId.toString()))
                .replaceAll("\\{" + "contactId" + "\\}", trackinApi.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();

        trackinApi.invokeAPI(path, "DELETE", queryParams, null, headerParams);
    }

}
