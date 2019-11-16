package io.swagger.model.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.CategoriaRsType;

public interface CategoriaRepository extends JpaRepository<CategoriaRsType ,Integer>{
	
	@Query(value="SELECT c.IDCATEGORIA,c.NOMBRE CATEGORIA,COUNT(0) CANTIDAD,TO_CHAR(o.FECHACIERRE,'MM') MES,TO_CHAR(o.FECHACIERRE,'YYYY') AÑO\r\n" + 
			"FROM SKYNET.CATEGORIA c,SKYNET.PRODUCTO p,SKYNET.DETORDEN d,SKYNET.ORDENES o,SKYNET.ESTADO e\r\n" + 
			"WHERE c.IDCATEGORIA = p.IDCATEGORIA\r\n" + 
			"AND p.IDPRODUCTO = d.IDPRODUCTO\r\n" + 
			"AND d.IDORDEN = o.IDORDEN\r\n" + 
			"AND o.ESTADO = e.IDESTADO\r\n" + 
			"AND e.ESTADO = 'REGISTRADA'\r\n" + 
			"AND TO_DATE(o.FECHACIERRE) BETWEEN ?1 AND ?2\r\n" + 
			"GROUP BY c.IDCATEGORIA,c.NOMBRE,TO_CHAR(o.FECHACIERRE,'MM'),TO_CHAR(o.FECHACIERRE,'YYYY')\r\n" + 
			"ORDER BY 3 DESC", nativeQuery = true)
	public List<CategoriaRsType> getCategoriaMasVendida(Date fechaInicial,Date fechaFinal);

}
