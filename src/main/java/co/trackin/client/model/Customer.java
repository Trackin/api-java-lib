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
public class Customer {

    private Long id = null;
    private List<Contact> contacts = new ArrayList<Contact>();
    private String name = null;
    private Boolean notifyByEmail = null;
    private Boolean notifyBySms = null;


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
    @JsonProperty("contacts")
    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
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
     * Notify customer by email?
     */
    @ApiModelProperty(required = false, value = "Notify customer by email?")
    @JsonProperty("notifyByEmail")
    public Boolean getNotifyByEmail() {
        return notifyByEmail;
    }

    public void setNotifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
    }


    /**
     * Notify customer by sms?
     */
    @ApiModelProperty(required = false, value = "Notify customer by sms?")
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
        sb.append("class CustomerVM {\n");

        sb.append("  id: ").append(id).append("\n");
        sb.append("  contacts: ").append(contacts).append("\n");
        sb.append("  name: ").append(name).append("\n");
        sb.append("  notifyByEmail: ").append(notifyByEmail).append("\n");
        sb.append("  notifyBySms: ").append(notifyBySms).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
