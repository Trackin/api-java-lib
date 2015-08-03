package co.trackin.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.Date;


/**
 *
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "")
public class DeliveryForDevice {

    private String zip = null;
    private String lastName = null;
    private String address = null;
    private String address2 = null;
    private String city = null;
    private String firstName = null;
    private String thirdPartyId = null;
    private Long companyId = null;
    private Double total = null;
    private Date due = null;
    private String name = null;
    private Date end = null;
    private Long id = null;
    private String state = null;
    private Date begin = null;
    private String status = null;


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    /**
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
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    /**
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
     **/
    @ApiModelProperty(required = false, value = "")
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
    @JsonProperty("companyId")
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }


    /**
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
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("due")
    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("end")
    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
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
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("begin")
    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryForDeviceVM {\n");

        sb.append("  zip: ").append(zip).append("\n");
        sb.append("  lastName: ").append(lastName).append("\n");
        sb.append("  address: ").append(address).append("\n");
        sb.append("  address2: ").append(address2).append("\n");
        sb.append("  city: ").append(city).append("\n");
        sb.append("  firstName: ").append(firstName).append("\n");
        sb.append("  thirdPartyId: ").append(thirdPartyId).append("\n");
        sb.append("  companyId: ").append(companyId).append("\n");
        sb.append("  total: ").append(total).append("\n");
        sb.append("  due: ").append(due).append("\n");
        sb.append("  name: ").append(name).append("\n");
        sb.append("  end: ").append(end).append("\n");
        sb.append("  id: ").append(id).append("\n");
        sb.append("  state: ").append(state).append("\n");
        sb.append("  begin: ").append(begin).append("\n");
        sb.append("  status: ").append(status).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
