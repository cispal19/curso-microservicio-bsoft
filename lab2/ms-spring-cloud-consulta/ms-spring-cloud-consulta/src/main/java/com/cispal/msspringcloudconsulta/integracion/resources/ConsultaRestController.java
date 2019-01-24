package com.cispal.msspringcloudconsulta.integracion.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cispal.msspringcloudconsulta.core.interfaces.ConsultaServiceInterface;

@RestController
public class ConsultaRestController {
	@Autowired
	private ConsultaServiceInterface consultaService;

	public ConsultaRestController() {
	}
}
