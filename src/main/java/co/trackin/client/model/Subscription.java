package co.trackin.client.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 *
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "")
public class Subscription {

    private Long id = null;
    private Long maxNumberOfDeliveriesPerMonth = null;
    private Double deliveryRate = null;
    private Long maxNumberOfDevices = null;
    private Double smsRate = null;


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
    @JsonProperty("maxNumberOfDeliveriesPerMonth")
    public Long getMaxNumberOfDeliveriesPerMonth() {
        return maxNumberOfDeliveriesPerMonth;
    }

    public void setMaxNumberOfDeliveriesPerMonth(Long maxNumberOfDeliveriesPerMonth) {
        this.maxNumberOfDeliveriesPerMonth = maxNumberOfDeliveriesPerMonth;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("deliveryRate")
    public Double getDeliveryRate() {
        return deliveryRate;
    }

    public void setDeliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("maxNumberOfDevices")
    public Long getMaxNumberOfDevices() {
        return maxNumberOfDevices;
    }

    public void setMaxNumberOfDevices(Long maxNumberOfDevices) {
        this.maxNumberOfDevices = maxNumberOfDevices;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("smsRate")
    public Double getSmsRate() {
        return smsRate;
    }

    public void setSmsRate(Double smsRate) {
        this.smsRate = smsRate;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionVM {\n");

        sb.append("  id: ").append(id).append("\n");
        sb.append("  maxNumberOfDeliveriesPerMonth: ").append(maxNumberOfDeliveriesPerMonth).append("\n");
        sb.append("  deliveryRate: ").append(deliveryRate).append("\n");
        sb.append("  maxNumberOfDevices: ").append(maxNumberOfDevices).append("\n");
        sb.append("  smsRate: ").append(smsRate).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
