package co.trackin.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


/**
 *
 **/
@ApiModel(description = "")
public class Device {

    private List<DeliveryForDevice> currentDeliveries = new ArrayList<DeliveryForDevice>();
    private String firstName = null;
    private String lastName = null;
    private String os = null;
    private Long pending = null;
    private Long processing = null;
    private String model = null;
    private Long id = null;
    private String msisdn = null;
    private String brand = null;
    private List<Track> tracks = new ArrayList<Track>();


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("currentDeliveries")
    public List<DeliveryForDevice> getCurrentDeliveries() {
        return currentDeliveries;
    }

    public void setCurrentDeliveries(List<DeliveryForDevice> currentDeliveries) {
        this.currentDeliveries = currentDeliveries;
    }


    /**
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("pending")
    public Long getPending() {
        return pending;
    }

    public void setPending(Long pending) {
        this.pending = pending;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("processing")
    public Long getProcessing() {
        return processing;
    }

    public void setProcessing(Long processing) {
        this.processing = processing;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
     * International phone number, ex: +33612345678, +1800555333...
     */
    @ApiModelProperty(required = false, value = "International phone number, ex: +33612345678, +1800555333...")
    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("tracks")
    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceVM {\n");

        sb.append("  currentDeliveries: ").append(currentDeliveries).append("\n");
        sb.append("  firstName: ").append(firstName).append("\n");
        sb.append("  lastName: ").append(lastName).append("\n");
        sb.append("  os: ").append(os).append("\n");
        sb.append("  pending: ").append(pending).append("\n");
        sb.append("  processing: ").append(processing).append("\n");
        sb.append("  model: ").append(model).append("\n");
        sb.append("  id: ").append(id).append("\n");
        sb.append("  msisdn: ").append(msisdn).append("\n");
        sb.append("  brand: ").append(brand).append("\n");
        sb.append("  tracks: ").append(tracks).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
