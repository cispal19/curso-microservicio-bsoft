package com.cispal.mspago.core.accesodato.repositorio;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cispal.mspago.core.interfaces.PagoDaoInterface;
import com.cispal.mspago.core.negocio.bean.Servicio;
import com.cispal.mspago.core.util.AppException;
import com.cispal.mspago.core.util.Conexion;
import com.cispal.mspago.core.util.Transaccion;

@Repository
public class PagoDao implements PagoDaoInterface {
	public PagoDao() {
	}

	@Override
	public Transaccion pagarServicio(Servicio servicio) throws AppException {
		Transaccion tx= new Transaccion();
		PreparedStatement pstmt = null;
		Conexion con = null;
		String SQL = "UPDATE esq_pwj_080918.TBL_CLIENTE_PRODUCTO SET estado = '1' where codigo=?and cliente=? and producto=?";
	try {
			con = new Conexion();
			con.getConexion().setAutoCommit(false);
			pstmt = con.getConexion().prepareStatement(SQL);
			pstmt.setInt(1, servicio.getCodigo());
			pstmt.setInt(2, servicio.getCliente().getCodigo());
			pstmt.setInt(3, servicio.getProducto().getCodigo());
			pstmt.executeUpdate();
			tx.setCodigo("0000");
			tx.setDescripcion("Proceso Conforme");
			con.getConexion().commit();
		}catch (SQLException sqle) {
			throw new AppException(sqle.getMessage());
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}finally {
			try {
				con.closeResources(con.getConexion(), null, null, null,pstmt);
			}catch (Exception e) {
					throw new AppException(e.getMessage());
			}
		}
		return tx;
	}
}
