package com.cispal.msbpago.consumidor;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.cispal.msbpago.interfaces.PagoBusProxyInterface;
import com.cispal.msbpago.objetos.AppException;
import com.cispal.msbpago.objetos.ServicioVO;
import com.cispal.msbpago.objetos.Transaccion;

@Component
public class PagoBusProxy implements PagoBusProxyInterface {
	private static String URL = "http://localhost:8083/mspago/facturacion/pagar";

	@Override
	public Transaccion pagarServicio(ServicioVO servicio) throws AppException {
		Transaccion tx = new Transaccion();
		HttpEntity<ServicioVO> requestEntity = new HttpEntity<ServicioVO>(servicio, null);
		ResponseEntity<Transaccion> responseEntity = new RestTemplate().exchange(URL, HttpMethod.PUT, requestEntity,
				Transaccion.class);
		if (responseEntity != null && responseEntity.hasBody()) {
			tx = responseEntity.getBody();
		}
		return tx;
	}
}
