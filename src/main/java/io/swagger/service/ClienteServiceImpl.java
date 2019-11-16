package io.swagger.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.ClienteRsType;
import io.swagger.model.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<ClienteRsType> listFacturacion(Date fechaInicial,Date fechaFinal){
		return clienteRepository.getClienteFacturacion(fechaInicial, fechaFinal);
	}

}
