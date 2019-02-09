package com.cispal.mspago.integracion.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cispal.mspago.core.interfaces.PagoServiceInterface;
import com.cispal.mspago.core.negocio.bean.Servicio;
import com.cispal.mspago.core.util.Transaccion;
import com.cispal.mspago.integracion.util.Util;
import com.cispal.mspago.integracion.vo.ServicioVO;

@RestController
public class PagoRestController {

	@Autowired
	private PagoServiceInterface pagoService;

	public PagoRestController() {
	}

	@PutMapping(path = "/facturacion/pagar")
	public Transaccion pagarServicio(@RequestBody ServicioVO serviciovo) {
		Transaccion tx = new Transaccion();
		try {
			Servicio servicio = Util.passServicioVOToServicioBean(serviciovo);
			tx = pagoService.pagarServicio(servicio);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return tx;
	}

}
