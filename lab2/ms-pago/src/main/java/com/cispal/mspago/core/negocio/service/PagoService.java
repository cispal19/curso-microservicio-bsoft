package com.cispal.mspago.core.negocio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cispal.mspago.core.interfaces.PagoDaoInterface;
import com.cispal.mspago.core.interfaces.PagoServiceInterface;
import com.cispal.mspago.core.negocio.bean.Servicio;
import com.cispal.mspago.core.util.AppException;
import com.cispal.mspago.core.util.Transaccion;

@Service
public class PagoService implements PagoServiceInterface {

	@Autowired
	private PagoDaoInterface consultaDao;
	
	public PagoService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Transaccion pagarServicio(Servicio servicio) throws AppException {
		return consultaDao.pagarServicio(servicio);
	}
	
}
