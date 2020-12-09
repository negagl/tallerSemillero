package com.clearminds.negl.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.ngl.bdd.ConexionBDD;
import com.clearminds.ngl.excepciones.BDDException;

public class ServicioBase {
	private Connection conn;

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public void abrirConexion() throws BDDException {
		try {
			conn = ConexionBDD.obtenerConexion();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cerrarConexion() {
		try {
			if (conn != null) {
				conn.close();
				System.out.println("Conexion cerrada...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al cerrar la conexion.");
		}
	}
}
