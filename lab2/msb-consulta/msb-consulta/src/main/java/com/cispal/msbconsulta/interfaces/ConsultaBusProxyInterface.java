package com.cispal.msbconsulta.interfaces;

import java.util.List;


import com.cispal.msbconsulta.objetos.ServicioVO;

public interface ConsultaBusProxyInterface {
	
	public List<ServicioVO> getServicios(Integer idCliente, Integer idEmpresa);
}
