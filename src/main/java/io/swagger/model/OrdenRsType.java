package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrdenRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

public class OrdenRsType   {
  @JsonProperty("cantidad")
  private Integer cantidad = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("mesCierre")
  private String mesCierre = null;

  @JsonProperty("anioCierre")
  private String anioCierre = null;

  public OrdenRsType cantidad(Integer cantidad) {
    this.cantidad = cantidad;
    return this;
  }

  /**
   * Get cantidad
   * @return cantidad
  **/
  @ApiModelProperty(value = "")


  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public OrdenRsType total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public OrdenRsType mesCierre(String mesCierre) {
    this.mesCierre = mesCierre;
    return this;
  }

  /**
   * Get mesCierre
   * @return mesCierre
  **/
  @ApiModelProperty(value = "")


  public String getMesCierre() {
    return mesCierre;
  }

  public void setMesCierre(String mesCierre) {
    this.mesCierre = mesCierre;
  }

  public OrdenRsType anioCierre(String anioCierre) {
    this.anioCierre = anioCierre;
    return this;
  }

  /**
   * Get anioCierre
   * @return anioCierre
  **/
  @ApiModelProperty(value = "")


  public String getAnioCierre() {
    return anioCierre;
  }

  public void setAnioCierre(String anioCierre) {
    this.anioCierre = anioCierre;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdenRsType ordenRsType = (OrdenRsType) o;
    return Objects.equals(this.cantidad, ordenRsType.cantidad) &&
        Objects.equals(this.total, ordenRsType.total) &&
        Objects.equals(this.mesCierre, ordenRsType.mesCierre) &&
        Objects.equals(this.anioCierre, ordenRsType.anioCierre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cantidad, total, mesCierre, anioCierre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdenRsType {\n");
    
    sb.append("    cantidad: ").append(toIndentedString(cantidad)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    mesCierre: ").append(toIndentedString(mesCierre)).append("\n");
    sb.append("    anioCierre: ").append(toIndentedString(anioCierre)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

