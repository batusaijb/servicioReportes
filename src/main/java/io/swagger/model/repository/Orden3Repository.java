package io.swagger.model.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Orden3RsType;

public interface Orden3Repository extends JpaRepository<Orden3RsType ,Integer>{
	
	@Query(value="SELECT o.IDORDEN,o.VALORTOTAL,TO_CHAR(o.FECHACIERRE,'MM') MES,TO_CHAR(o.FECHACIERRE,'YYYY') AÑO\r\n" + 
			"FROM SKYNET.ORDENES o,SKYNET.ESTADO e\r\n" + 
			"WHERE o.ESTADO = e.IDESTADO\r\n" + 
			"AND e.ESTADO = 'REGISTRADA'\r\n" + 
			"AND TO_DATE(o.FECHACIERRE) BETWEEN ?1 AND ?2\r\n" + 
			"ORDER BY 2 DESC", nativeQuery = true)
	public List<Orden3RsType> getOrdenesCerradasXFecha(Date fechaInicial,Date fechaFinal);

}
