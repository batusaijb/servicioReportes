package io.swagger.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Orden2RsType;

public interface Orden2Repository extends JpaRepository<Orden2RsType ,Integer>{
	@Query(value="SELECT o.IDORDEN, ROUND(SYSDATE-o.FECHASOLICITUD) DIAS,o.FECHASOLICITUD,e.ESTADO\r\n" + 
			"FROM SKYNET.ORDENES o,SKYNET.ESTADO e\r\n" + 
			"WHERE o.ESTADO = e.IDESTADO\r\n" + 
			"AND e.ESTADO = 'REGISTRADA'\r\n" + 
			"ORDER BY 2 DESC", nativeQuery = true)
	public List<Orden2RsType> getOrdenesAbiertas();
}
