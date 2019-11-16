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
 * ProductoRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

public class ProductoRsType   {
  @JsonProperty("idProducto")
  private Integer idProducto = null;

  @JsonProperty("producto")
  private String producto = null;

  @JsonProperty("cantidad")
  private Integer cantidad = null;

  @JsonProperty("mes")
  private Integer mes = null;

  @JsonProperty("anio")
  private Integer anio = null;

  public ProductoRsType idProducto(Integer idProducto) {
    this.idProducto = idProducto;
    return this;
  }

  /**
   * Get idProducto
   * @return idProducto
  **/
  @ApiModelProperty(value = "")


  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  public ProductoRsType producto(String producto) {
    this.producto = producto;
    return this;
  }

  /**
   * Get producto
   * @return producto
  **/
  @ApiModelProperty(value = "")


  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public ProductoRsType cantidad(Integer cantidad) {
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

  public ProductoRsType mes(Integer mes) {
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

  public ProductoRsType anio(Integer anio) {
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
    ProductoRsType productoRsType = (ProductoRsType) o;
    return Objects.equals(this.idProducto, productoRsType.idProducto) &&
        Objects.equals(this.producto, productoRsType.producto) &&
        Objects.equals(this.cantidad, productoRsType.cantidad) &&
        Objects.equals(this.mes, productoRsType.mes) &&
        Objects.equals(this.anio, productoRsType.anio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProducto, producto, cantidad, mes, anio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductoRsType {\n");
    
    sb.append("    idProducto: ").append(toIndentedString(idProducto)).append("\n");
    sb.append("    producto: ").append(toIndentedString(producto)).append("\n");
    sb.append("    cantidad: ").append(toIndentedString(cantidad)).append("\n");
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

