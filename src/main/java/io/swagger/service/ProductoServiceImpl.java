package io.swagger.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.model.ProductoRsType;
import io.swagger.model.repository.ProductoRepository;

public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<ProductoRsType> listMasVendido(Date fechaInicial,Date fechaFinal){
		return productoRepository.getProductoMasVendido(fechaInicial, fechaFinal);
	}

}
