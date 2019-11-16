package io.swagger.model.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.CategoriaRsType;
import io.swagger.model.OrdenRsType;

public interface OrdenRepository extends JpaRepository<OrdenRsType ,Integer>{
	
	@Query(value="SELECT COUNT(0) CANTIDAD,SUM(o.VALORTOTAL),TO_CHAR(o.FECHACIERRE,'MM') MES,TO_CHAR(o.FECHACIERRE,'YYYY') AÑO\r\n" + 
			"FROM SKYNET.ORDENES o,SKYNET.ESTADO e\r\n" + 
			"WHERE o.ESTADO = e.IDESTADO\r\n" + 
			"AND e.ESTADO = 'REGISTRADA'\r\n" + 
			"GROUP BY o.ESTADO,TO_CHAR(o.FECHACIERRE,'MM'),TO_CHAR(o.FECHACIERRE,'YYYY')", nativeQuery = true)
	public List<OrdenRsType> getOrdenesCerradas();

}
