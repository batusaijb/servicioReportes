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
 * Orden3RsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

public class Orden3RsType   {
  @JsonProperty("idOrden")
  private Integer idOrden = null;

  @JsonProperty("valorTotal")
  private Integer valorTotal = null;

  @JsonProperty("mes")
  private Integer mes = null;

  @JsonProperty("anio")
  private Integer anio = null;

  public Orden3RsType idOrden(Integer idOrden) {
    this.idOrden = idOrden;
    return this;
  }

  /**
   * Get idOrden
   * @return idOrden
  **/
  @ApiModelProperty(value = "")


  public Integer getIdOrden() {
    return idOrden;
  }

  public void setIdOrden(Integer idOrden) {
    this.idOrden = idOrden;
  }

  public Orden3RsType valorTotal(Integer valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Get valorTotal
   * @return valorTotal
  **/
  @ApiModelProperty(value = "")


  public Integer getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(Integer valorTotal) {
    this.valorTotal = valorTotal;
  }

  public Orden3RsType mes(Integer mes) {
    this.mes = mes;
    return this;
  }

  /**
   * Get mes
   * @return mes
  **/
  @ApiModelProperty(value = "")


  public Integer getMes() {
    return mes;
  }

  public void setMes(Integer mes) {
    this.mes = mes;
  }

  public Orden3RsType anio(Integer anio) {
    this.anio = anio;
    return this;
  }

  /**
   * Get anio
   * @return anio
  **/
  @ApiModelProperty(value = "")


  public Integer getAnio() {
    return anio;
  }

  public void setAnio(Integer anio) {
    this.anio = anio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Orden3RsType orden3RsType = (Orden3RsType) o;
    return Objects.equals(this.idOrden, orden3RsType.idOrden) &&
        Objects.equals(this.valorTotal, orden3RsType.valorTotal) &&
        Objects.equals(this.mes, orden3RsType.mes) &&
        Objects.equals(this.anio, orden3RsType.anio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOrden, valorTotal, mes, anio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Orden3RsType {\n");
    
    sb.append("    idOrden: ").append(toIndentedString(idOrden)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    mes: ").append(toIndentedString(mes)).append("\n");
    sb.append("    anio: ").append(toIndentedString(anio)).append("\n");
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

