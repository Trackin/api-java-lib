package co.trackin.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 **/
@ApiModel(description = "")
public class DeliveryForm {

    private Boolean catering = null;
    private Long companyId = null;
    private Boolean confirmationStatus = null;
    private List<Line> content = new ArrayList<Line>();
    private Double cost = null;
    private Date created = null;
    private Boolean courierDelivery = null;
    private Double deliveryFee = null;
    private Long deviceId = null;
    private Date due = null;
    private String thirdPartyId = null;
    private String instructions = null;
    private String name = null;
    private Boolean needCourier = null;
    private String origin = "API";
    private Boolean paid = null;


    private PaymentMethod paymentMethod = null;
    private String request = null;

    public enum StatusEnum {
        New, Assigned, Delivering, Delivered, Cancelled,
    }

    ;
    private StatusEnum status = null;
    private Boolean takeAway = null;
    private Double taxes = null;
    private Double tip = null;
    private Double total = null;
    private Contact recipient = null;


    /**
     * True if this is a catering order
     */
    @ApiModelProperty(required = false, value = "True if this is a catering order")
    @JsonProperty("catering")
    public Boolean getCatering() {
        return catering;
    }

    public void setCatering(Boolean catering) {
        this.catering = catering;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("companyId")
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }


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
    @JsonProperty("cost")
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }


    /**
     * Date of creation of the order, set to now by default. When set, it will be used to compute the due date
     */
    @ApiModelProperty(required = false, value = "Date of creation of the order, set to now by default. When set, it will be used to compute the due date")
    @JsonProperty("created")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


    /**
     * This is only available for courier enabled subscription. Tell you if this is a courier pick-up delivery
     */
    @ApiModelProperty(required = false, value = "This is only available for courier enabled subscription. Tell you if this is a courier pick-up delivery")
    @JsonProperty("courierDelivery")
    public Boolean getCourierDelivery() {
        return courierDelivery;
    }

    public void setCourierDelivery(Boolean courierDelivery) {
        this.courierDelivery = courierDelivery;
    }


    /**
     * Fee paid by the customer for the delivery
     */
    @ApiModelProperty(required = false, value = "Fee paid by the customer for the delivery")
    @JsonProperty("deliveryFee")
    public Double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }


    /**
     * Id of the device to assign if needed
     */
    @ApiModelProperty(required = false, value = "Id of the device to assign if needed")
    @JsonProperty("deviceId")
    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Order due date. If not set, we will use the company's delivery zones to determine it
     */
    @ApiModelProperty(required = false, value = "Order due date. If not set, we will use the company's delivery zones to determine it")
    @JsonProperty("due")
    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }


    /**
     * Id of the order/delivery in your system
     */
    @ApiModelProperty(required = false, value = "Id of the order/delivery in your system")
    @JsonProperty("thirdPartyId")
    public String getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
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
     * Delivery name, can be used to set delivery # or anything. Default is 'New order'
     */
    @ApiModelProperty(required = false, value = "Delivery name, can be used to set delivery # or anything. Default is 'New order'")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * This is only available for courier enabled subscription. Set to true if this delivery is going to be picked up by a courier
     */
    @ApiModelProperty(required = false, value = "This is only available for courier enabled subscription. Set to true if this delivery is going to be picked up by a courier")
    @JsonProperty("needCourier")
    public Boolean getNeedCourier() {
        return needCourier;
    }

    public void setNeedCourier(Boolean needCourier) {
        this.needCourier = needCourier;
    }


    /**
     * Set the origin name of the order. Default value is 'API'
     */
    @ApiModelProperty(required = false, value = "Set the origin name of the order. Default value is 'API'")
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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
     * Will be set to 'New' when creating a delivery.
     */
    @ApiModelProperty(required = false, value = "Will be set to 'New' when creating a delivery.")
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }


    /**
     * true if it's a TakeAway order instead of classic delivery
     */
    @ApiModelProperty(required = false, value = "true if it's a TakeAway order instead of classic delivery")
    @JsonProperty("takeAway")
    public Boolean getTakeAway() {
        return takeAway;
    }

    public void setTakeAway(Boolean takeAway) {
        this.takeAway = takeAway;
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


    /**
     * Information about the customer
     */
    @ApiModelProperty(required = false, value = "Information about the customer")
    @JsonProperty("recipient")
    public Contact getRecipient() {
        return recipient;
    }

    public void setRecipient(Contact recipient) {
        this.recipient = recipient;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryFormVM {\n");

        sb.append("  catering: ").append(catering).append("\n");
        sb.append("  companyId: ").append(companyId).append("\n");
        sb.append("  confirmationStatus: ").append(confirmationStatus).append("\n");
        sb.append("  content: ").append(content).append("\n");
        sb.append("  cost: ").append(cost).append("\n");
        sb.append("  created: ").append(created).append("\n");
        sb.append("  courierDelivery: ").append(courierDelivery).append("\n");
        sb.append("  deliveryFee: ").append(deliveryFee).append("\n");
        sb.append("  deviceId: ").append(deviceId).append("\n");
        sb.append("  due: ").append(due).append("\n");
        sb.append("  thirdPartyId: ").append(thirdPartyId).append("\n");
        sb.append("  instructions: ").append(instructions).append("\n");
        sb.append("  name: ").append(name).append("\n");
        sb.append("  needCourier: ").append(needCourier).append("\n");
        sb.append("  origin: ").append(origin).append("\n");
        sb.append("  paid: ").append(paid).append("\n");
        sb.append("  paymentMethod: ").append(paymentMethod).append("\n");
        sb.append("  request: ").append(request).append("\n");
        sb.append("  status: ").append(status).append("\n");
        sb.append("  takeAway: ").append(takeAway).append("\n");
        sb.append("  taxes: ").append(taxes).append("\n");
        sb.append("  tip: ").append(tip).append("\n");
        sb.append("  total: ").append(total).append("\n");
        sb.append("  recipient: ").append(recipient).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
