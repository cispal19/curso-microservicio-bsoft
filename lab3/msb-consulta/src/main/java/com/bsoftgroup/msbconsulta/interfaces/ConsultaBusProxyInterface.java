package com.bsoftgroup.msbconsulta.interfaces;

import java.util.List;

import com.bsoftgroup.msbconsulta.objetos.ServicioVO;

public interface ConsultaBusProxyInterface {
	
	public List<ServicioVO> getServicios(Integer idCliente, Integer idEmpresa);

}
