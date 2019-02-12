package com.bsoftgroup.msconsulta.core.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsoftgroup.msconsulta.core.interfaces.ConsultaDaoInterface;
import com.bsoftgroup.msconsulta.core.interfaces.ConsultaServiceInterface;
import com.bsoftgroup.msconsulta.core.negocio.bean.Servicio;
import com.bsoftgroup.msconsulta.core.util.AppException;

@Service
public class ConsultaService implements ConsultaServiceInterface {

	@Autowired
	private ConsultaDaoInterface consultaDao;
	
	public ConsultaService() {}

	@Override
	public List<Servicio> getServicios(Integer idCliente, Integer idEmpresa) throws AppException {
		// TODO Auto-generated method stub
		return consultaDao.getServicios(idCliente, idEmpresa);
	}
}
