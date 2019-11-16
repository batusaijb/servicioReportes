package io.swagger.service;

import java.util.Date;
import java.util.List;

import io.swagger.model.Orden2RsType;
import io.swagger.model.Orden3RsType;
import io.swagger.model.OrdenRsType;

public interface OrdenService {
	public List<OrdenRsType> listaOrdenesCerradas();
	
	public List<Orden2RsType> listaOrdenesAbiertas();
	
	public List<Orden3RsType> listaOrdenesCerradasXFecha(Date fechaInicial,Date fechaFinal);
}
