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
public class CustomerForm {

    private String name = null;
    private Boolean notifyByEmail = null;
    private Boolean notifyBySms = null;


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
    @JsonProperty("notifyByEmail")
    public Boolean getNotifyByEmail() {
        return notifyByEmail;
    }

    public void setNotifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("notifyBySms")
    public Boolean getNotifyBySms() {
        return notifyBySms;
    }

    public void setNotifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerFormVM {\n");

        sb.append("  name: ").append(name).append("\n");
        sb.append("  notifyByEmail: ").append(notifyByEmail).append("\n");
        sb.append("  notifyBySms: ").append(notifyBySms).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
