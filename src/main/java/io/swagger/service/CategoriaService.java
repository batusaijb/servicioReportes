package io.swagger.service;

import java.util.Date;
import java.util.List;

import io.swagger.model.CategoriaRsType;

public interface CategoriaService {
	
	public List<CategoriaRsType> listMasVendidas(Date fechaInicial,Date fechaFinal);

}
