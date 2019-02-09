package com.cispal.msbpago.proveedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cispal.msbpago.interfaces.PagoBusProxyInterface;
import com.cispal.msbpago.objetos.AppException;
import com.cispal.msbpago.objetos.ServicioVO;
import com.cispal.msbpago.objetos.Transaccion;

@RestController
public class PagoBusRestController {

	@Autowired
	private PagoBusProxyInterface pagoBusProxy;

	@PutMapping("/facturacion/pagar")
	 public Transaccion pagarServicio(@RequestBody ServicioVO servicio) {
		Transaccion tx = new Transaccion();
		try {
			tx = pagoBusProxy.pagarServicio(servicio);
		} catch (AppException ape) {
			System.out.println(ape.getMessage());
		}
		return tx;
	}

}
