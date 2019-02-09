package com.cispal.mspago.core.interfaces;

import com.cispal.mspago.core.negocio.bean.Servicio;
import com.cispal.mspago.core.util.AppException;
import com.cispal.mspago.core.util.Transaccion;

public interface PagoDaoInterface {
	public Transaccion pagarServicio(Servicio servicio) throws AppException;

}
