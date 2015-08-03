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
public class DeliveryZoneVM {

    private Double miniDeliveryAmount = null;
    private Long eta = null;
    private Long maxDeliveryTime = null;
    private Double fee = null;
    private Long id = null;
    private Long maxDeliveryCost = null;


    /**
     * Minimum order amount allowed for a delivery
     */
    @ApiModelProperty(required = false, value = "Minimum order amount allowed for a delivery")
    @JsonProperty("miniDeliveryAmount")
    public Double getMiniDeliveryAmount() {
        return miniDeliveryAmount;
    }

    public void setMiniDeliveryAmount(Double miniDeliveryAmount) {
        this.miniDeliveryAmount = miniDeliveryAmount;
    }


    /**
     * Default ETA for deliveries in this zone
     */
    @ApiModelProperty(required = false, value = "Default ETA for deliveries in this zone")
    @JsonProperty("eta")
    public Long getEta() {
        return eta;
    }

    public void setEta(Long eta) {
        this.eta = eta;
    }


    /**
     * Maximum time in minute between your company's location and the client
     */
    @ApiModelProperty(required = false, value = "Maximum time in minute between your company's location and the client")
    @JsonProperty("maxDeliveryTime")
    public Long getMaxDeliveryTime() {
        return maxDeliveryTime;
    }

    public void setMaxDeliveryTime(Long maxDeliveryTime) {
        this.maxDeliveryTime = maxDeliveryTime;
    }


    /**
     * Delivery fee
     */
    @ApiModelProperty(required = false, value = "Delivery fee")
    @JsonProperty("fee")
    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
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
     * If cost are set, the maximum cost allowed for a delivery
     */
    @ApiModelProperty(required = false, value = "If cost are set, the maximum cost allowed for a delivery")
    @JsonProperty("maxDeliveryCost")
    public Long getMaxDeliveryCost() {
        return maxDeliveryCost;
    }

    public void setMaxDeliveryCost(Long maxDeliveryCost) {
        this.maxDeliveryCost = maxDeliveryCost;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryZoneVM {\n");

        sb.append("  miniDeliveryAmount: ").append(miniDeliveryAmount).append("\n");
        sb.append("  eta: ").append(eta).append("\n");
        sb.append("  maxDeliveryTime: ").append(maxDeliveryTime).append("\n");
        sb.append("  fee: ").append(fee).append("\n");
        sb.append("  id: ").append(id).append("\n");
        sb.append("  maxDeliveryCost: ").append(maxDeliveryCost).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
