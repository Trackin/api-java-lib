package co.trackin.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class Country {
  
  private Long id = null;
  private String isoCode = null;
  private String label = null;
  private String phoneCode = null;
  private Boolean taxIncluded = null;
  private String currency = null;

  
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
  @JsonProperty("isoCode")
  public String getIsoCode() {
    return isoCode;
  }
  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("phoneCode")
  public String getPhoneCode() {
    return phoneCode;
  }
  public void setPhoneCode(String phoneCode) {
    this.phoneCode = phoneCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("taxIncluded")
  public Boolean getTaxIncluded() {
    return taxIncluded;
  }
  public void setTaxIncluded(Boolean taxIncluded) {
    this.taxIncluded = taxIncluded;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryVM {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isoCode: ").append(isoCode).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  phoneCode: ").append(phoneCode).append("\n");
    sb.append("  taxIncluded: ").append(taxIncluded).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
