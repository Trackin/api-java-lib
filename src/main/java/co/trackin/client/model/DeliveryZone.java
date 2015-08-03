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
public class DeliveryZone {

    private Long id = null;
    private Long maxDeliveryTime = null;
    private Long maxDeliveryCost = null;
    private Double miniDeliveryAmount = null;
    private Double fee = null;
    private Long eta = null;


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
    @JsonProperty("maxDeliveryTime")
    public Long getMaxDeliveryTime() {
        return maxDeliveryTime;
    }

    public void setMaxDeliveryTime(Long maxDeliveryTime) {
        this.maxDeliveryTime = maxDeliveryTime;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("maxDeliveryCost")
    public Long getMaxDeliveryCost() {
        return maxDeliveryCost;
    }

    public void setMaxDeliveryCost(Long maxDeliveryCost) {
        this.maxDeliveryCost = maxDeliveryCost;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("miniDeliveryAmount")
    public Double getMiniDeliveryAmount() {
        return miniDeliveryAmount;
    }

    public void setMiniDeliveryAmount(Double miniDeliveryAmount) {
        this.miniDeliveryAmount = miniDeliveryAmount;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
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
    @JsonProperty("eta")
    public Long getEta() {
        return eta;
    }

    public void setEta(Long eta) {
        this.eta = eta;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryZone {\n");

        sb.append("  id: ").append(id).append("\n");
        sb.append("  maxDeliveryTime: ").append(maxDeliveryTime).append("\n");
        sb.append("  maxDeliveryCost: ").append(maxDeliveryCost).append("\n");
        sb.append("  miniDeliveryAmount: ").append(miniDeliveryAmount).append("\n");
        sb.append("  fee: ").append(fee).append("\n");
        sb.append("  eta: ").append(eta).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
