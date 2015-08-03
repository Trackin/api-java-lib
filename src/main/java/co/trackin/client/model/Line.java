package co.trackin.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


/**
 *
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "")
public class Line {

    private String comments = null;
    private String description = null;
    private String label;
    private List<Pick> picks = new ArrayList<Pick>();
    private Double price;
    private int quantity;
    private Double vat = (double) 0;
    private String idPartner = null;
    private Double total = null;


    public Line(String label, Double price, int quantity){
        this.label=label;
        this.price = price;
        this.quantity = quantity;
    }

    Line(){
    }

    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Line name (ex: 'Hamburger', 'Orange juice' or '1L of rocket fuel')
     */
    @ApiModelProperty(required = false, value = "Line name (ex: 'Hamburger', 'Orange juice' or '1L of rocket fuel')")
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("picks")
    public List<Pick> getPicks() {
        return picks;
    }

    public void setPicks(List<Pick> picks) {
        this.picks = picks;
    }


    /**
     *
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }


    /**
     * Minimum value is 1
     */
    @ApiModelProperty(required = false, value = "Minimum value is 1")
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }


    /**
     * Taxes rate (0 if not applicable)
     */
    @ApiModelProperty(required = false, value = "Taxes rate (0 if not applicable)")
    @JsonProperty("vat")
    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }


    /**
     * Id in your database, or in the client's P.O.S (depends on the usage you make of it)
     */
    @ApiModelProperty(required = false, value = "Id in your database, or in the client's P.O.S (depends on the usage you make of it)")
    @JsonProperty("idPartner")
    public String getIdPartner() {
        return idPartner;
    }

    public void setIdPartner(String idPartner) {
        this.idPartner = idPartner;
    }


    /**
     **/
    @ApiModelProperty(required = false, value = "")
    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineVM {\n");

        sb.append("  comments: ").append(comments).append("\n");
        sb.append("  description: ").append(description).append("\n");
        sb.append("  label: ").append(label).append("\n");
        sb.append("  picks: ").append(picks).append("\n");
        sb.append("  price: ").append(price).append("\n");
        sb.append("  quantity: ").append(quantity).append("\n");
        sb.append("  vat: ").append(vat).append("\n");
        sb.append("  idPartner: ").append(idPartner).append("\n");
        sb.append("  total: ").append(total).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
