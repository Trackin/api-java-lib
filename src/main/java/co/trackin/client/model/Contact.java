package co.trackin.client.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * Setting a different address when updating a contact will re geocode the contact
 */
@ApiModel(description = "Setting a different address when updating a contact will re geocode the contact")
public class Contact {

    private Long id = null;
    private String address = null;
    private String address2 = null;
    private String city = null;
    private String country = null;
    private String email = null;
    private String fax = null;
    private String firstName = null;
    private String job = null;
    private String lastName = null;
    private Double latitude = null;
    private Double longitude = null;
    private Boolean main = null;
    private String phone = null;
    private String state = null;
    private String zip = null;


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
     *
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
     *
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
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


    /**
     *
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
    @JsonProperty("job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    /**
     *
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
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


    /**
     * Is this the main contact for the collection, if any?
     */
    @ApiModelProperty(required = false, value = "Is this the main contact for the collection, if any?")
    @JsonProperty("main")
    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }


    /**
     * Use international formatting ex: +33612345678 or +14158781254
     */
    @ApiModelProperty(required = false, value = "Use international formatting ex: +33612345678 or +14158781254")
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactVM {\n");

        sb.append("  id: ").append(id).append("\n");
        sb.append("  address: ").append(address).append("\n");
        sb.append("  address2: ").append(address2).append("\n");
        sb.append("  city: ").append(city).append("\n");
        sb.append("  country: ").append(country).append("\n");
        sb.append("  email: ").append(email).append("\n");
        sb.append("  fax: ").append(fax).append("\n");
        sb.append("  firstName: ").append(firstName).append("\n");
        sb.append("  job: ").append(job).append("\n");
        sb.append("  lastName: ").append(lastName).append("\n");
        sb.append("  latitude: ").append(latitude).append("\n");
        sb.append("  longitude: ").append(longitude).append("\n");
        sb.append("  main: ").append(main).append("\n");
        sb.append("  phone: ").append(phone).append("\n");
        sb.append("  state: ").append(state).append("\n");
        sb.append("  zip: ").append(zip).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
