package io.swagger.model.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.ClienteRsType;

public interface ClienteRepository extends JpaRepository<ClienteRsType ,Integer>{
	
	@Query(value="SELECT c.IDCLIENTE,c.NOMBRE||' ' ||c.APELLIDO NOMBRE_CLI,SUM(o.VALORTOTAL) VALOR,TO_CHAR(o.FECHACIERRE,'MM') MES,TO_CHAR(o.FECHACIERRE,'YYYY') AÑO\r\n" + 
			"FROM SKYNET.CLIENTE c,SKYNET.ORDENES o,SKYNET.ESTADO e\r\n" + 
			"WHERE c.IDCLIENTE = o.IDCLIENTE\r\n" + 
			"AND o.ESTADO = e.IDESTADO\r\n" + 
			"AND e.ESTADO = 'REGISTRADA'\r\n" + 
			"AND TO_DATE(o.FECHACIERRE) BETWEEN ?1 AND ?2\r\n" + 
			"GROUP BY c.IDCLIENTE,c.NOMBRE,c.APELLIDO,TO_CHAR(o.FECHACIERRE,'MM'),TO_CHAR(o.FECHACIERRE,'YYYY')\r\n" + 
			"ORDER BY 3 DESC", nativeQuery = true)
	public List<ClienteRsType> getClienteFacturacion(Date fechaInicial,Date fechaFinal);

}
