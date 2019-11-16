package io.swagger.service;

import java.util.Date;
import java.util.List;

import io.swagger.model.ProductoRsType;

public interface ProductoService {
	
	public List<ProductoRsType> listMasVendido(Date fechaInicial,Date fechaFinal);

}
