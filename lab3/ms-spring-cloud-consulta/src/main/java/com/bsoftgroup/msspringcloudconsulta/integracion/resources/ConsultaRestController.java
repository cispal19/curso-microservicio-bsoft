package com.bsoftgroup.msspringcloudconsulta.integracion.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bsoftgroup.msspringcloudconsulta.core.interfaces.ConsultaServiceInterface;

@RestController
public class ConsultaRestController {
@Autowired
private ConsultaServiceInterface consultaService;


public ConsultaRestController() {}

}
