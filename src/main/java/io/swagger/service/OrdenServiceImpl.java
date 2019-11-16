package io.swagger.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.model.Orden2RsType;
import io.swagger.model.Orden3RsType;
import io.swagger.model.OrdenRsType;
import io.swagger.model.repository.Orden2Repository;
import io.swagger.model.repository.Orden3Repository;
import io.swagger.model.repository.OrdenRepository;

public class OrdenServiceImpl implements OrdenService{
	
	@Autowired
	OrdenRepository ordenRepository;

	@Autowired
	Orden2Repository orden2Repository;
	
	@Autowired
	Orden3Repository orden3Repository;
	
	@Override
	public List<OrdenRsType> listaOrdenesCerradas(){
		return ordenRepository.getOrdenesCerradas();
	}
	
	@Override
	public List<Orden2RsType> listaOrdenesAbiertas(){
		return orden2Repository.getOrdenesAbiertas();
	}
	
	@Override
	public List<Orden3RsType> listaOrdenesCerradasXFecha(Date fechaInicial,Date fechaFinal){
		return orden3Repository.getOrdenesCerradasXFecha(fechaInicial, fechaFinal);
	}

}
