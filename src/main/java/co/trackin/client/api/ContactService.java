package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.Void;
import co.trackin.client.ApiInvoker;
import co.trackin.client.model.Contact;

import java.util.HashMap;
import java.util.Map;

import static co.trackin.client.ApiInvoker.deserialize;

public class ContactService {
    ApiInvoker apiInvoker = ApiInvoker.getInstance();

    public ApiInvoker getInvoker() {
        return apiInvoker;
    }


    public Contact addContactToCompany(Long companyId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/contacts".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "POST", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) deserialize(response, "", Contact.class);
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


    public Contact updateContactOnCompany(Long companyId, Long contactId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
                .replaceAll("\\{" + "contactId" + "\\}", apiInvoker.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) deserialize(response, "", Contact.class);
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


    public co.trackin.client.model.Void deleteContactFromCompany(Long companyId, Long contactId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/companies/{companyId}/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()))
                .replaceAll("\\{" + "contactId" + "\\}", apiInvoker.escapeString(contactId.toString()));

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


    public Contact getOneContact(Long contactId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "contactId" + "\\}", apiInvoker.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (Contact) deserialize(response, "", Contact.class);
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


    public Contact updateContact(Long contactId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "contactId" + "\\}", apiInvoker.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) deserialize(response, "", Contact.class);
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


    public Void deleteContact(Long contactId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "contactId" + "\\}", apiInvoker.escapeString(contactId.toString()));

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

    public Contact addContactToCustomer(Long customerId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/customers/{customerId}/contacts".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "POST", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) deserialize(response, "", Contact.class);
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


    public Contact updateContactOnCustomer(Long customerId, Long contactId, Contact body) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/customers/{customerId}/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString()))
                .replaceAll("\\{" + "contactId" + "\\}", apiInvoker.escapeString(contactId.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = apiInvoker.invokeAPI(path, "PUT", queryParams, body, headerParams);
            if (response != null) {
                return (Contact) deserialize(response, "", Contact.class);
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


    public Void deleteContactFromCustomer(Long customerId, Long contactId) throws ApiException {


        // create path and map variables
        String path = "/service/api/json/1.1/customers/{customerId}/contacts/{contactId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString()))
                .replaceAll("\\{" + "contactId" + "\\}", apiInvoker.escapeString(contactId.toString()));

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
