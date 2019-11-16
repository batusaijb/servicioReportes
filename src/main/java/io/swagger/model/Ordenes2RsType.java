package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Orden2RsType;
import io.swagger.model.StatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ordenes.
 */
@ApiModel(description = "Ordenes.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

public class Ordenes2RsType   {
  @JsonProperty("status")
  private StatusType status = null;

  @JsonProperty("direcciones")
  private Orden2RsType direcciones = null;

  public Ordenes2RsType status(StatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusType getStatus() {
    return status;
  }

  public void setStatus(StatusType status) {
    this.status = status;
  }

  public Ordenes2RsType direcciones(Orden2RsType direcciones) {
    this.direcciones = direcciones;
    return this;
  }

  /**
   * Get direcciones
   * @return direcciones
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Orden2RsType getDirecciones() {
    return direcciones;
  }

  public void setDirecciones(Orden2RsType direcciones) {
    this.direcciones = direcciones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ordenes2RsType ordenes2RsType = (Ordenes2RsType) o;
    return Objects.equals(this.status, ordenes2RsType.status) &&
        Objects.equals(this.direcciones, ordenes2RsType.direcciones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, direcciones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ordenes2RsType {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    direcciones: ").append(toIndentedString(direcciones)).append("\n");
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

