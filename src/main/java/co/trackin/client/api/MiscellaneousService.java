package co.trackin.client.api;

import co.trackin.client.ApiException;
import co.trackin.client.model.Country;
import co.trackin.client.model.Subscription;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MiscellaneousService {
    TrackinApi trackinApi;

    MiscellaneousService(TrackinApi trackinApi) {
        this.trackinApi = trackinApi;
    }


    public Subscription getOneSubscription(String api_key, Long sub_id) throws ApiException {

        // create path and map variables
        String path = "/service/api/json/1.1/subscriptions".replaceAll("\\{format\\}", "json");

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (Subscription) trackinApi.deserialize(response, "", Subscription.class);
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

    public List<Country> getAllCountries(String api_key, Long sub_id) throws ApiException {

        // create path and map variables
        String path = "/service/api/json/1.1/countries".replaceAll("\\{format\\}", "json");

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();


        try {
            String response = trackinApi.invokeAPI(path, "GET", queryParams, null, headerParams);
            if (response != null) {
                return (List<Country>) trackinApi.deserialize(response, "array", Country.class);
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
