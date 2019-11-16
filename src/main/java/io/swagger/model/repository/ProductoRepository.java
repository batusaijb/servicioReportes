package io.swagger.model.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.ProductoRsType;

public interface ProductoRepository extends JpaRepository<ProductoRsType ,Integer>{
	
	@Query(value="SELECT p.IDPRODUCTO,p.DESCRIPCION PRODUCTO,COUNT(0) CANTIDAD,TO_CHAR(o.FECHACIERRE,'MM') MES,TO_CHAR(o.FECHACIERRE,'YYYY') AÑO\r\n" + 
			"FROM SKYNET.PRODUCTO p,SKYNET.DETORDEN d,SKYNET.ORDENES o,SKYNET.ESTADO e\r\n" + 
			"WHERE p.IDPRODUCTO = d.IDPRODUCTO\r\n" + 
			"AND d.IDORDEN = o.IDORDEN\r\n" + 
			"AND o.ESTADO = e.IDESTADO\r\n" + 
			"AND e.ESTADO = 'REGISTRADA'\r\n" + 
			"AND TO_DATE(o.FECHACIERRE) BETWEEN ?1 AND ?2\r\n" + 
			"GROUP BY p.IDPRODUCTO,p.DESCRIPCION,TO_CHAR(o.FECHACIERRE,'MM'),TO_CHAR(o.FECHACIERRE,'YYYY')\r\n" + 
			"ORDER BY 3 DESC", nativeQuery = true)
	public List<ProductoRsType> getProductoMasVendido(Date fechaInicial,Date fechaFinal);

}
