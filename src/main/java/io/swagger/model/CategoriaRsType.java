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
 * CategoriaRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

public class CategoriaRsType   {
  @JsonProperty("idCategoria")
  private Integer idCategoria = null;

  @JsonProperty("categoria")
  private String categoria = null;

  @JsonProperty("cantidad")
  private Integer cantidad = null;

  @JsonProperty("mes")
  private Integer mes = null;

  @JsonProperty("anio")
  private Integer anio = null;

  public CategoriaRsType idCategoria(Integer idCategoria) {
    this.idCategoria = idCategoria;
    return this;
  }

  /**
   * Get idCategoria
   * @return idCategoria
  **/
  @ApiModelProperty(value = "")


  public Integer getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(Integer idCategoria) {
    this.idCategoria = idCategoria;
  }

  public CategoriaRsType categoria(String categoria) {
    this.categoria = categoria;
    return this;
  }

  /**
   * Get categoria
   * @return categoria
  **/
  @ApiModelProperty(value = "")


  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public CategoriaRsType cantidad(Integer cantidad) {
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

  public CategoriaRsType mes(Integer mes) {
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

  public CategoriaRsType anio(Integer anio) {
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
    CategoriaRsType categoriaRsType = (CategoriaRsType) o;
    return Objects.equals(this.idCategoria, categoriaRsType.idCategoria) &&
        Objects.equals(this.categoria, categoriaRsType.categoria) &&
        Objects.equals(this.cantidad, categoriaRsType.cantidad) &&
        Objects.equals(this.mes, categoriaRsType.mes) &&
        Objects.equals(this.anio, categoriaRsType.anio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCategoria, categoria, cantidad, mes, anio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoriaRsType {\n");
    
    sb.append("    idCategoria: ").append(toIndentedString(idCategoria)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
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

