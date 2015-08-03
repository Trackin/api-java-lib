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
public class CompanyForm {

    private List<Contact> contacts = new ArrayList<Contact>();
    private Long countryId = null;
    private String countryIsoCode = null;
    private String languageCode = null;
    private String name = null;
    private String timezone = null;


    /**
     * Company's contact information
     */
    @ApiModelProperty(required = false, value = "Company's contact information")
    @JsonProperty("contacts")
    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


    /**
     * Required if no countryIsoCode
     */
    @ApiModelProperty(required = false, value = "Required if no countryIsoCode")
    @JsonProperty("countryId")
    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }


    /**
     * Required if no countryId
     */
    @ApiModelProperty(required = false, value = "Required if no countryId")
    @JsonProperty("countryIsoCode")
    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }


    /**
     * en
     */
    @ApiModelProperty(required = false, value = "en")
    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * The name of the company
     */
    @ApiModelProperty(required = false, value = "The name of the company")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Timezone for the company(Europe/Paris, America/Los_Angeles...)
     */
    @ApiModelProperty(required = false, value = "Timezone for the company(Europe/Paris, America/Los_Angeles...)")
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompanyFormVM {\n");

        sb.append("  contacts: ").append(contacts).append("\n");
        sb.append("  countryId: ").append(countryId).append("\n");
        sb.append("  countryIsoCode: ").append(countryIsoCode).append("\n");
        sb.append("  languageCode: ").append(languageCode).append("\n");
        sb.append("  name: ").append(name).append("\n");
        sb.append("  timezone: ").append(timezone).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
