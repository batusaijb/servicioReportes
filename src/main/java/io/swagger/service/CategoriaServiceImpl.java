package io.swagger.service;

import java.util.Date;
import java.util.List;

import io.swagger.model.CategoriaRsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<CategoriaRsType> listMasVendidas(Date fechaInicial,Date fechaFinal){
		return categoriaRepository.getCategoriaMasVendida(fechaInicial, fechaFinal);
	}

}
