package com.bsoftgroup.msconsulta.core.interfaces;

import java.util.List;

import com.bsoftgroup.msconsulta.core.negocio.bean.Servicio;
import com.bsoftgroup.msconsulta.core.util.AppException;

public interface ConsultaDaoInterface {
	
	public List<Servicio> getServicios(Integer idCliente, Integer idEmpresa) throws AppException; 

}
