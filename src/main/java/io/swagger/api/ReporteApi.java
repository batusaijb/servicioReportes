/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.9).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.CategoriasRsType;
import io.swagger.model.ClientesRsType;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.Ordenes2RsType;
import io.swagger.model.Ordenes3RsType;
import io.swagger.model.OrdenesRsType;
import io.swagger.model.ProductosRsType;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

@Api(value = "reporte", description = "the reporte API")
public interface ReporteApi {

    @ApiOperation(value = "Categorias mas Vendidas por fechas", nickname = "categoriasVendidas", notes = "", response = CategoriasRsType.class, tags={ "Reporte", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = CategoriasRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = CategoriasRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = CategoriasRsType.class) })
    @RequestMapping(value = "/reporte/categoriasVendidas",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CategoriasRsType> categoriasVendidas(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Fecha desde",required=true) @PathVariable("fechaDesde") OffsetDateTime fechaDesde,@ApiParam(value = "Fecha hasta",required=true) @PathVariable("fechaHasta") OffsetDateTime fechaHasta);


    @ApiOperation(value = "Clientes Facturados en un rango de fechas", nickname = "clientesFacturados", notes = "", response = ClientesRsType.class, tags={ "Reporte", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = ClientesRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = ClientesRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = ClientesRsType.class) })
    @RequestMapping(value = "/reporte/clientesFacturados",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ClientesRsType> clientesFacturados(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Fecha desde",required=true) @PathVariable("fechaDesde") OffsetDateTime fechaDesde,@ApiParam(value = "Fecha hasta",required=true) @PathVariable("fechaHasta") OffsetDateTime fechaHasta);


    @ApiOperation(value = "Ordenes Cerradas", nickname = "noOrdenes", notes = "", response = OrdenesRsType.class, tags={ "Reporte", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = OrdenesRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = OrdenesRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = OrdenesRsType.class) })
    @RequestMapping(value = "/reporte/noOrdenes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrdenesRsType> noOrdenes(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID);


    @ApiOperation(value = "Ordenes Abiertas por mas Tiempo", nickname = "ordenesAbiertas", notes = "", response = Ordenes2RsType.class, tags={ "Reporte", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = Ordenes2RsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = Ordenes2RsType.class),
        @ApiResponse(code = 404, message = "Not found", response = Ordenes2RsType.class) })
    @RequestMapping(value = "/reporte/ordenesAbiertas",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Ordenes2RsType> ordenesAbiertas(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID);


    @ApiOperation(value = "Ordenes Cerradas con mas Dinero", nickname = "ordenesCerradas", notes = "", response = Ordenes3RsType.class, tags={ "Reporte", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = Ordenes3RsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = Ordenes3RsType.class),
        @ApiResponse(code = 404, message = "Not found", response = Ordenes3RsType.class) })
    @RequestMapping(value = "/reporte/ordenesCerradas",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Ordenes3RsType> ordenesCerradas(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID);


    @ApiOperation(value = "Productos mas Vendidos por fechas", nickname = "productosVendidos", notes = "", response = ProductosRsType.class, tags={ "Reporte", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = ProductosRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = ProductosRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = ProductosRsType.class) })
    @RequestMapping(value = "/reporte/productosVendidos",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProductosRsType> productosVendidos(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Fecha desde",required=true) @PathVariable("fechaDesde") OffsetDateTime fechaDesde,@ApiParam(value = "Fecha hasta",required=true) @PathVariable("fechaHasta") OffsetDateTime fechaHasta);

}