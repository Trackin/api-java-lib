package co.trackin.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


/**
 *
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "")
public class DeliveryFormUpdate {

    private Boolean confirmationStatus = null;
    private List<Line> content = new ArrayList<Line>();
    private String instructions = null;
    private Boolean paid = null;

    private PaymentMethod paymentMethod = null;
    private String request = null;
    private Double taxes = null;
    private Double tip = null;
    private Double total = null;


    /**
     * Tell if the order was confirmed or not. Can be confirmed via an update or using the Trackin dashboard
     */
    @ApiModelProperty(required = false, value = "Tell if the order was confirmed or not. Can be confirmed via an update or using the Trackin dashboard")
    @JsonProperty("confirmationStatus")
    public Boolean getConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(Boolean confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }


    /**
     * Order content
     */
    @ApiModelProperty(required = false, value = "Order content")
    @JsonProperty("content")
    public List<Line> getContent() {
        return content;
    }

    public void setContent(List<Line> content) {
        this.content = content;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }


    /**
     * Has the order been paid?
     */
    @ApiModelProperty(required = false, value = "Has the order been paid?")
    @JsonProperty("paid")
    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("paymentMethod")
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Customer request about the order
     */
    @ApiModelProperty(required = false, value = "Customer request about the order")
    @JsonProperty("request")
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }


    /**
     * this is the total amount of taxes included in the total price
     */
    @ApiModelProperty(required = false, value = "this is the total amount of taxes included in the total price")
    @JsonProperty("taxes")
    public Double getTaxes() {
        return taxes;
    }

    public void setTaxes(Double taxes) {
        this.taxes = taxes;
    }


    /**
     * this is the  amount of tip included in the total price
     */
    @ApiModelProperty(required = false, value = "this is the  amount of tip included in the total price")
    @JsonProperty("tip")
    public Double getTip() {
        return tip;
    }

    public void setTip(Double tip) {
        this.tip = tip;
    }


    /**
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public DeliveryFormUpdate(Delivery delivery){
        this.confirmationStatus = delivery.getConfirmationStatus();
        this.content = delivery.getContent();
        this.instructions = delivery.getInstructions();
        this.paid = delivery.getPaid();
        this.paymentMethod = delivery.getPaymentMethod();
        this.request = delivery.getRequest();
        this.taxes = delivery.getTaxes();
        this.tip = delivery.getTip();
        this.total = delivery.getTotal();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryFormUpdateVM {\n");

        sb.append("  confirmationStatus: ").append(confirmationStatus).append("\n");
        sb.append("  content: ").append(content).append("\n");
        sb.append("  instructions: ").append(instructions).append("\n");
        sb.append("  paid: ").append(paid).append("\n");
        sb.append("  paymentMethod: ").append(paymentMethod).append("\n");
        sb.append("  request: ").append(request).append("\n");
        sb.append("  taxes: ").append(taxes).append("\n");
        sb.append("  tip: ").append(tip).append("\n");
        sb.append("  total: ").append(total).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
