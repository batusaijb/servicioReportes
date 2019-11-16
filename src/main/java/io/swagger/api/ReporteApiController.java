package io.swagger.api;

import io.swagger.model.CategoriaRsType;
import io.swagger.model.CategoriasRsType;
import io.swagger.model.ClientesRsType;

import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.Ordenes2RsType;
import io.swagger.model.Ordenes3RsType;
import io.swagger.model.OrdenesRsType;
import io.swagger.model.ProductosRsType;
import io.swagger.model.StatusType;
import io.swagger.service.CategoriaService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-15T05:20:51.123Z")

@Controller
public class ReporteApiController implements ReporteApi {

    private static final Logger log = LoggerFactory.getLogger(ReporteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    CategoriaService categoriaService;

    @org.springframework.beans.factory.annotation.Autowired
    public ReporteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CategoriasRsType> categoriasVendidas(
    		@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,
    		@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,
    		@ApiParam(value = "Fecha desde",required=true) @PathVariable("fechaDesde") OffsetDateTime fechaDesde,
    		@ApiParam(value = "Fecha hasta",required=true) @PathVariable("fechaHasta") OffsetDateTime fechaHasta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	 
            	Date date1= DateTimeUtils.toDate(fechaDesde.toInstant());
            	Date date2= DateTimeUtils.toDate(fechaHasta.toInstant());
            	 
            	
            	List<CategoriaRsType> = categoriaService.listMasVendidas(date1, date2);
            	StatusType response = new StatusType(200, "Registros actualizados: " + result);
    			return new ResponseEntity<StatusType>(response, HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CategoriasRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CategoriasRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClientesRsType> clientesFacturados(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Fecha desde",required=true) @PathVariable("fechaDesde") OffsetDateTime fechaDesde,@ApiParam(value = "Fecha hasta",required=true) @PathVariable("fechaHasta") OffsetDateTime fechaHasta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClientesRsType>(objectMapper.readValue("{  \"direcciones\" : {    \"idCliente\" : 0,    \"valorTotal\" : 6,    \"mes\" : 1,    \"anio\" : 5,    \"nombres\" : \"nombres\"  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}", ClientesRsType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClientesRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClientesRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrdenesRsType> noOrdenes(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrdenesRsType>(objectMapper.readValue("{  \"direcciones\" : {    \"total\" : 1,    \"mesCierre\" : \"mesCierre\",    \"cantidad\" : 6,    \"anioCierre\" : \"anioCierre\"  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}", OrdenesRsType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrdenesRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrdenesRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Ordenes2RsType> ordenesAbiertas(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Ordenes2RsType>(objectMapper.readValue("{  \"direcciones\" : {    \"estado\" : \"estado\",    \"fechaSolicitud\" : \"fechaSolicitud\",    \"dias\" : 6,    \"idOrden\" : 0  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}", Ordenes2RsType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Ordenes2RsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Ordenes2RsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Ordenes3RsType> ordenesCerradas(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Ordenes3RsType>(objectMapper.readValue("{  \"direcciones\" : {    \"valorTotal\" : 6,    \"mes\" : 1,    \"idOrden\" : 0,    \"anio\" : 5  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}", Ordenes3RsType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Ordenes3RsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Ordenes3RsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductosRsType> productosVendidos(@ApiParam(value = "Cabecera estandar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "Service Id Kallsonys" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Fecha desde",required=true) @PathVariable("fechaDesde") OffsetDateTime fechaDesde,@ApiParam(value = "Fecha hasta",required=true) @PathVariable("fechaHasta") OffsetDateTime fechaHasta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductosRsType>(objectMapper.readValue("{  \"direcciones\" : {    \"mes\" : 1,    \"idProducto\" : 0,    \"producto\" : \"producto\",    \"cantidad\" : 6,    \"anio\" : 5  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}", ProductosRsType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductosRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductosRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

}
