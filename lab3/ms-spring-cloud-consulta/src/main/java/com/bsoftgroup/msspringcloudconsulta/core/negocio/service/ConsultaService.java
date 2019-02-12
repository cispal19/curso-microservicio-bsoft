package com.bsoftgroup.msspringcloudconsulta.core.negocio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsoftgroup.msspringcloudconsulta.core.interfaces.ConsultaDaoInterface;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaDaoInterface consultaDao;

	public ConsultaService() {}
}
