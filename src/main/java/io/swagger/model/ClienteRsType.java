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
 * ClienteRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

public class ClienteRsType   {
  @JsonProperty("idCliente")
  private Integer idCliente = null;

  @JsonProperty("nombres")
  private String nombres = null;

  @JsonProperty("valorTotal")
  private Integer valorTotal = null;

  @JsonProperty("mes")
  private Integer mes = null;

  @JsonProperty("anio")
  private Integer anio = null;

  public ClienteRsType idCliente(Integer idCliente) {
    this.idCliente = idCliente;
    return this;
  }

  /**
   * Get idCliente
   * @return idCliente
  **/
  @ApiModelProperty(value = "")


  public Integer getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Integer idCliente) {
    this.idCliente = idCliente;
  }

  public ClienteRsType nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }

  /**
   * Get nombres
   * @return nombres
  **/
  @ApiModelProperty(value = "")


  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public ClienteRsType valorTotal(Integer valorTotal) {
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

  public ClienteRsType mes(Integer mes) {
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

  public ClienteRsType anio(Integer anio) {
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
    ClienteRsType clienteRsType = (ClienteRsType) o;
    return Objects.equals(this.idCliente, clienteRsType.idCliente) &&
        Objects.equals(this.nombres, clienteRsType.nombres) &&
        Objects.equals(this.valorTotal, clienteRsType.valorTotal) &&
        Objects.equals(this.mes, clienteRsType.mes) &&
        Objects.equals(this.anio, clienteRsType.anio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCliente, nombres, valorTotal, mes, anio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClienteRsType {\n");
    
    sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
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

