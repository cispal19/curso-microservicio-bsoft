package com.cispal.msbconsulta.proveedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cispal.msbconsulta.interfaces.ConsultaBusFeignInterface;
import com.cispal.msbconsulta.interfaces.ConsultaBusProxyInterface;
import com.cispal.msbconsulta.objetos.ServicioVO;


@RestController
public class ConsultaBusRestController {
	@Autowired
	private ConsultaBusProxyInterface consultaBusProxy;
	@Autowired
	private ConsultaBusFeignInterface consultaBusFeign;

	@GetMapping("/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	public List<ServicioVO> getServicios(@PathVariable("idCliente") Integer idCliente,
			@PathVariable("idEmpresa") Integer idEmpresa) {
		return consultaBusProxy.getServicios(idCliente, idEmpresa);
	}
	
	@GetMapping("/facturacion/feign/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	public List<ServicioVO> getServiciosFeign(@PathVariable("idCliente") Integer idCliente,
			@PathVariable("idEmpresa") Integer idEmpresa) {
		return consultaBusFeign.getServicios(idCliente, idEmpresa);
	}

}
