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
 * Orden2RsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

public class Orden2RsType   {
  @JsonProperty("idOrden")
  private Integer idOrden = null;

  @JsonProperty("dias")
  private Integer dias = null;

  @JsonProperty("fechaSolicitud")
  private String fechaSolicitud = null;

  @JsonProperty("estado")
  private String estado = null;

  public Orden2RsType idOrden(Integer idOrden) {
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

  public Orden2RsType dias(Integer dias) {
    this.dias = dias;
    return this;
  }

  /**
   * Get dias
   * @return dias
  **/
  @ApiModelProperty(value = "")


  public Integer getDias() {
    return dias;
  }

  public void setDias(Integer dias) {
    this.dias = dias;
  }

  public Orden2RsType fechaSolicitud(String fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
    return this;
  }

  /**
   * Get fechaSolicitud
   * @return fechaSolicitud
  **/
  @ApiModelProperty(value = "")


  public String getFechaSolicitud() {
    return fechaSolicitud;
  }

  public void setFechaSolicitud(String fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
  }

  public Orden2RsType estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
  **/
  @ApiModelProperty(value = "")


  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Orden2RsType orden2RsType = (Orden2RsType) o;
    return Objects.equals(this.idOrden, orden2RsType.idOrden) &&
        Objects.equals(this.dias, orden2RsType.dias) &&
        Objects.equals(this.fechaSolicitud, orden2RsType.fechaSolicitud) &&
        Objects.equals(this.estado, orden2RsType.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOrden, dias, fechaSolicitud, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Orden2RsType {\n");
    
    sb.append("    idOrden: ").append(toIndentedString(idOrden)).append("\n");
    sb.append("    dias: ").append(toIndentedString(dias)).append("\n");
    sb.append("    fechaSolicitud: ").append(toIndentedString(fechaSolicitud)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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

