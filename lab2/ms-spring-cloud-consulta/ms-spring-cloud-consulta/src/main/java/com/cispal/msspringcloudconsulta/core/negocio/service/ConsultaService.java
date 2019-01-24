package com.cispal.msspringcloudconsulta.core.negocio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cispal.msspringcloudconsulta.core.interfaces.ConsultaDaoInterface;
import com.cispal.msspringcloudconsulta.core.interfaces.ConsultaServiceInterface;

@Service
public class ConsultaService implements ConsultaServiceInterface {
	@Autowired
	private ConsultaDaoInterface consultaDao;

	public ConsultaService() {
	}
}
