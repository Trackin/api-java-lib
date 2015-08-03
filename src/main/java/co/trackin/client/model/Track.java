package co.trackin.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;


/**
 *
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "")
public class Track {

    private Double heading = null;
    private Double latitude = null;
    private Double accuracy = null;
    private Long id = null;
    private Double velocity = null;
    private Double longitude = null;
    private Timestamp timestamp = null;


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("heading")
    public Double getHeading() {
        return heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("accuracy")
    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("velocity")
    public Double getVelocity() {
        return velocity;
    }

    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("timestamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Track {\n");

        sb.append("  heading: ").append(heading).append("\n");
        sb.append("  latitude: ").append(latitude).append("\n");
        sb.append("  accuracy: ").append(accuracy).append("\n");
        sb.append("  id: ").append(id).append("\n");
        sb.append("  velocity: ").append(velocity).append("\n");
        sb.append("  longitude: ").append(longitude).append("\n");
        sb.append("  timestamp: ").append(timestamp).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
