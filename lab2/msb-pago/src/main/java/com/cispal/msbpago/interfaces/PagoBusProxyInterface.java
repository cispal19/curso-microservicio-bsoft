package com.cispal.msbpago.interfaces;

import com.cispal.msbpago.objetos.AppException;
import com.cispal.msbpago.objetos.ServicioVO;
import com.cispal.msbpago.objetos.Transaccion;

public interface PagoBusProxyInterface {

	public Transaccion pagarServicio (ServicioVO servicio) throws AppException;
	
}
