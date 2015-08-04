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
public class Pick {

    private String idPartner = null;
    private Integer quantity = null;
    private String preference = null;
    private String label = null;
    private Double price = null;


    /**
     * Id in your database, or in the client's P.O.S (depends on the usage you make of it)
     **/
    @ApiModelProperty(required = false, value = "Id in your database, or in the client's P.O.S (depends on the usage you make of it)")
    @JsonProperty("idPartner")
    public String getIdPartner() {
        return idPartner;
    }

    public void setIdPartner(String idPartner) {
        this.idPartner = idPartner;
    }


    /**
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("preference")
    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }


    /**
     *
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
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PickVM {\n");

        sb.append("  idPartner: ").append(idPartner).append("\n");
        sb.append("  quantity: ").append(quantity).append("\n");
        sb.append("  preference: ").append(preference).append("\n");
        sb.append("  label: ").append(label).append("\n");
        sb.append("  price: ").append(price).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
