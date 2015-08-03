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
public class Company {

    private Long id = null;
    private Boolean allowAutostart = null;
    private Boolean allowAutostop = null;
    private Double balance = null;
    private List<Contact> contacts = new ArrayList<Contact>();
    private Country country = null;
    private String customEmailField1 = null;
    private String customEmailField2 = null;
    private String customEmailField3 = null;
    private String customEmailField4 = null;
    private String customEmailTitle1 = null;
    private String customEmailTitle2 = null;
    private String customEmailTitle3 = null;
    private String customEmailTitle4 = null;
    private String customFtFollowText = null;
    private List<DeliveryZone> deliveryZones = new ArrayList<DeliveryZone>();
    private Boolean directionsAvoidHighways = null;
    private Boolean directionsAvoidTolls = null;

    private DirectionsMode directionsMode = null;
    private Boolean enableGeolocationWarning = null;
    private String facebook = null;
    private String google = null;
    private String image = null;
    private String languageCode = null;
    private String name = null;
    private Boolean notifyByEmail = null;
    private Boolean notifyBySms = null;
    private Double rating = null;
    private Boolean sendApologyEmail = null;
    private Boolean sendThankYouEmail = null;
    private Boolean skipLoadBalancing = null;
    private String timezone = null;
    private String twitter = null;
    private String website = null;
    private String yelp = null;


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
     * Do the drivers' app assigned to this company start assigned delivery automatically?
     */
    @ApiModelProperty(required = false, value = "Do the drivers' app assigned to this company start assigned delivery automatically?")
    @JsonProperty("allowAutostart")
    public Boolean getAllowAutostart() {
        return allowAutostart;
    }

    public void setAllowAutostart(Boolean allowAutostart) {
        this.allowAutostart = allowAutostart;
    }


    /**
     * true
     */
    @ApiModelProperty(required = false, value = "true")
    @JsonProperty("allowAutostop")
    public Boolean getAllowAutostop() {
        return allowAutostop;
    }

    public void setAllowAutostop(Boolean allowAutostop) {
        this.allowAutostop = allowAutostop;
    }


    /**
     * The company's pending balance
     */
    @ApiModelProperty(required = false, value = "The company's pending balance")
    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


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
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    /**
     * Custom field for the email sent to the customer when a delivery starts
     */
    @ApiModelProperty(required = false, value = "Custom field for the email sent to the customer when a delivery starts")
    @JsonProperty("customEmailField1")
    public String getCustomEmailField1() {
        return customEmailField1;
    }

    public void setCustomEmailField1(String customEmailField1) {
        this.customEmailField1 = customEmailField1;
    }


    /**
     * See customEmailField1
     */
    @ApiModelProperty(required = false, value = "See customEmailField1")
    @JsonProperty("customEmailField2")
    public String getCustomEmailField2() {
        return customEmailField2;
    }

    public void setCustomEmailField2(String customEmailField2) {
        this.customEmailField2 = customEmailField2;
    }


    /**
     * See customEmailField1
     */
    @ApiModelProperty(required = false, value = "See customEmailField1")
    @JsonProperty("customEmailField3")
    public String getCustomEmailField3() {
        return customEmailField3;
    }

    public void setCustomEmailField3(String customEmailField3) {
        this.customEmailField3 = customEmailField3;
    }


    /**
     * See customEmailField1
     */
    @ApiModelProperty(required = false, value = "See customEmailField1")
    @JsonProperty("customEmailField4")
    public String getCustomEmailField4() {
        return customEmailField4;
    }

    public void setCustomEmailField4(String customEmailField4) {
        this.customEmailField4 = customEmailField4;
    }


    /**
     * See Custom title for the email sent to the customer when a delivery starts
     */
    @ApiModelProperty(required = false, value = "See Custom title for the email sent to the customer when a delivery starts")
    @JsonProperty("customEmailTitle1")
    public String getCustomEmailTitle1() {
        return customEmailTitle1;
    }

    public void setCustomEmailTitle1(String customEmailTitle1) {
        this.customEmailTitle1 = customEmailTitle1;
    }


    /**
     * See customEmailTitle1
     */
    @ApiModelProperty(required = false, value = "See customEmailTitle1")
    @JsonProperty("customEmailTitle2")
    public String getCustomEmailTitle2() {
        return customEmailTitle2;
    }

    public void setCustomEmailTitle2(String customEmailTitle2) {
        this.customEmailTitle2 = customEmailTitle2;
    }


    /**
     * See customEmailTitle1
     */
    @ApiModelProperty(required = false, value = "See customEmailTitle1")
    @JsonProperty("customEmailTitle3")
    public String getCustomEmailTitle3() {
        return customEmailTitle3;
    }

    public void setCustomEmailTitle3(String customEmailTitle3) {
        this.customEmailTitle3 = customEmailTitle3;
    }


    /**
     * See customEmailTitle1
     */
    @ApiModelProperty(required = false, value = "See customEmailTitle1")
    @JsonProperty("customEmailTitle4")
    public String getCustomEmailTitle4() {
        return customEmailTitle4;
    }

    public void setCustomEmailTitle4(String customEmailTitle4) {
        this.customEmailTitle4 = customEmailTitle4;
    }


    /**
     * See Custom text displayed when the customer tracks its delivery
     */
    @ApiModelProperty(required = false, value = "See Custom text displayed when the customer tracks its delivery")
    @JsonProperty("customFtFollowText")
    public String getCustomFtFollowText() {
        return customFtFollowText;
    }

    public void setCustomFtFollowText(String customFtFollowText) {
        this.customFtFollowText = customFtFollowText;
    }


    /**
     * Delivery zone associated with this company, used for address filtering
     */
    @ApiModelProperty(required = false, value = "Delivery zone associated with this company, used for address filtering")
    @JsonProperty("deliveryZones")
    public List<DeliveryZone> getDeliveryZones() {
        return deliveryZones;
    }

    public void setDeliveryZones(List<DeliveryZone> deliveryZones) {
        this.deliveryZones = deliveryZones;
    }


    /**
     * Should we use highways when computing directions
     */
    @ApiModelProperty(required = false, value = "Should we use highways when computing directions")
    @JsonProperty("directionsAvoidHighways")
    public Boolean getDirectionsAvoidHighways() {
        return directionsAvoidHighways;
    }

    public void setDirectionsAvoidHighways(Boolean directionsAvoidHighways) {
        this.directionsAvoidHighways = directionsAvoidHighways;
    }


    /**
     * Should we use toll roads when computing directions
     */
    @ApiModelProperty(required = false, value = "Should we use toll roads when computing directions")
    @JsonProperty("directionsAvoidTolls")
    public Boolean getDirectionsAvoidTolls() {
        return directionsAvoidTolls;
    }

    public void setDirectionsAvoidTolls(Boolean directionsAvoidTolls) {
        this.directionsAvoidTolls = directionsAvoidTolls;
    }


    /**
     * What transport mode should we use to compute directions?
     */
    @ApiModelProperty(required = false, value = "What transport mode should we use to compute directions?")
    @JsonProperty("directionsMode")
    public DirectionsMode getDirectionsMode() {
        return directionsMode;
    }

    public void setDirectionsMode(DirectionsMode directionsMode) {
        this.directionsMode = directionsMode;
    }


    /**
     * false
     */
    @ApiModelProperty(required = false, value = "false")
    @JsonProperty("enableGeolocationWarning")
    public Boolean getEnableGeolocationWarning() {
        return enableGeolocationWarning;
    }

    public void setEnableGeolocationWarning(Boolean enableGeolocationWarning) {
        this.enableGeolocationWarning = enableGeolocationWarning;
    }


    /**
     * company's Facebook page
     */
    @ApiModelProperty(required = false, value = "company's Facebook page")
    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }


    /**
     * company's G+ page
     */
    @ApiModelProperty(required = false, value = "company's G+ page")
    @JsonProperty("google")
    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }


    /**
     * link to restaurant's logo
     */
    @ApiModelProperty(required = false, value = "link to restaurant's logo")
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
     * Do you want to notify your clients by email?
     */
    @ApiModelProperty(required = false, value = "Do you want to notify your clients by email?")
    @JsonProperty("notifyByEmail")
    public Boolean getNotifyByEmail() {
        return notifyByEmail;
    }

    public void setNotifyByEmail(Boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
    }


    /**
     * Do you want to notify your clients by SMS?
     */
    @ApiModelProperty(required = false, value = "Do you want to notify your clients by SMS?")
    @JsonProperty("notifyBySms")
    public Boolean getNotifyBySms() {
        return notifyBySms;
    }

    public void setNotifyBySms(Boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
    }


    /**
     * Company's average rating
     */
    @ApiModelProperty(required = false, value = "Company's average rating")
    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }


    /**
     * true
     */
    @ApiModelProperty(required = false, value = "true")
    @JsonProperty("sendApologyEmail")
    public Boolean getSendApologyEmail() {
        return sendApologyEmail;
    }

    public void setSendApologyEmail(Boolean sendApologyEmail) {
        this.sendApologyEmail = sendApologyEmail;
    }


    /**
     * true
     */
    @ApiModelProperty(required = false, value = "true")
    @JsonProperty("sendThankYouEmail")
    public Boolean getSendThankYouEmail() {
        return sendThankYouEmail;
    }

    public void setSendThankYouEmail(Boolean sendThankYouEmail) {
        this.sendThankYouEmail = sendThankYouEmail;
    }


    /**
     * false
     */
    @ApiModelProperty(required = false, value = "false")
    @JsonProperty("skipLoadBalancing")
    public Boolean getSkipLoadBalancing() {
        return skipLoadBalancing;
    }

    public void setSkipLoadBalancing(Boolean skipLoadBalancing) {
        this.skipLoadBalancing = skipLoadBalancing;
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


    /**
     * company's twitter page
     */
    @ApiModelProperty(required = false, value = "company's twitter page")
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }


    /**
     * company's website
     */
    @ApiModelProperty(required = false, value = "company's website")
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    /**
     * company's Yelp page
     */
    @ApiModelProperty(required = false, value = "company's Yelp page")
    @JsonProperty("yelp")
    public String getYelp() {
        return yelp;
    }

    public void setYelp(String yelp) {
        this.yelp = yelp;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompanyVM {\n");

        sb.append("  id: ").append(id).append("\n");
        sb.append("  allowAutostart: ").append(allowAutostart).append("\n");
        sb.append("  allowAutostop: ").append(allowAutostop).append("\n");
        sb.append("  balance: ").append(balance).append("\n");
        sb.append("  contacts: ").append(contacts).append("\n");
        sb.append("  country: ").append(country).append("\n");
        sb.append("  customEmailField1: ").append(customEmailField1).append("\n");
        sb.append("  customEmailField2: ").append(customEmailField2).append("\n");
        sb.append("  customEmailField3: ").append(customEmailField3).append("\n");
        sb.append("  customEmailField4: ").append(customEmailField4).append("\n");
        sb.append("  customEmailTitle1: ").append(customEmailTitle1).append("\n");
        sb.append("  customEmailTitle2: ").append(customEmailTitle2).append("\n");
        sb.append("  customEmailTitle3: ").append(customEmailTitle3).append("\n");
        sb.append("  customEmailTitle4: ").append(customEmailTitle4).append("\n");
        sb.append("  customFtFollowText: ").append(customFtFollowText).append("\n");
        sb.append("  deliveryZones: ").append(deliveryZones).append("\n");
        sb.append("  directionsAvoidHighways: ").append(directionsAvoidHighways).append("\n");
        sb.append("  directionsAvoidTolls: ").append(directionsAvoidTolls).append("\n");
        sb.append("  directionsMode: ").append(directionsMode).append("\n");
        sb.append("  enableGeolocationWarning: ").append(enableGeolocationWarning).append("\n");
        sb.append("  facebook: ").append(facebook).append("\n");
        sb.append("  google: ").append(google).append("\n");
        sb.append("  image: ").append(image).append("\n");
        sb.append("  languageCode: ").append(languageCode).append("\n");
        sb.append("  name: ").append(name).append("\n");
        sb.append("  notifyByEmail: ").append(notifyByEmail).append("\n");
        sb.append("  notifyBySms: ").append(notifyBySms).append("\n");
        sb.append("  rating: ").append(rating).append("\n");
        sb.append("  sendApologyEmail: ").append(sendApologyEmail).append("\n");
        sb.append("  sendThankYouEmail: ").append(sendThankYouEmail).append("\n");
        sb.append("  skipLoadBalancing: ").append(skipLoadBalancing).append("\n");
        sb.append("  timezone: ").append(timezone).append("\n");
        sb.append("  twitter: ").append(twitter).append("\n");
        sb.append("  website: ").append(website).append("\n");
        sb.append("  yelp: ").append(yelp).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
