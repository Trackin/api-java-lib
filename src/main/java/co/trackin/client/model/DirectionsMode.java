package co.trackin.client.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by bruyer_k on 23/03/15.
 */
public enum DirectionsMode {

    DRIVING(0, "driving"),
    WALKING(1, "walking"),
    BICYCLING(2, "bicycling"),
    TRANSIT(3, "transit");


    private int id;
    private String value;

    DirectionsMode(int id, String value) {
        this.id = id;
        this.value = value;
    }

    @JsonValue
    public int toInt() { return id; }

    @Override
    public String toString() { return value; }
}