package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ClienteRsType;
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

public class ClientesRsType   {
  @JsonProperty("status")
  private StatusType status = null;

  @JsonProperty("direcciones")
  private ClienteRsType direcciones = null;

  public ClientesRsType status(StatusType status) {
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

  public ClientesRsType direcciones(ClienteRsType direcciones) {
    this.direcciones = direcciones;
    return this;
  }

  /**
   * Get direcciones
   * @return direcciones
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ClienteRsType getDirecciones() {
    return direcciones;
  }

  public void setDirecciones(ClienteRsType direcciones) {
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
    ClientesRsType clientesRsType = (ClientesRsType) o;
    return Objects.equals(this.status, clientesRsType.status) &&
        Objects.equals(this.direcciones, clientesRsType.direcciones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, direcciones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientesRsType {\n");
    
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

