package io.swagger.service;

import java.util.Date;
import java.util.List;

import io.swagger.model.ClienteRsType;

public interface ClienteService {

	public List<ClienteRsType> listFacturacion(Date fechaInicial,Date fechaFinal);
	
	
}
