package com.cispal.mngproperties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cispal.mngproperties.conexion.ConfiguracionDataSource;
import com.cispal.mngproperties.conexion.DatosConexion;

@RestController
public class DatosConexionController {
	@Autowired
	private ConfiguracionDataSource service;

	@GetMapping(path="datosconexion")
	public DatosConexion getDatosConexion() {
		DatosConexion datosconexion = new DatosConexion(
				service.getDriverclassname(), 
				service.getUrl(),
				service.getUsername(),
				service.getPassword());
		return datosconexion;
	}

}
