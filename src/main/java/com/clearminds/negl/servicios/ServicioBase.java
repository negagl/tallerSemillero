package com.clearminds.negl.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.ngl.bdd.ConexionBDD;
import com.clearminds.ngl.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conn) {
		this.conexion = conn;
	}

	public void abrirConexion() throws BDDException {
		try {
			conexion = ConexionBDD.obtenerConexion();
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
			if (conexion != null) {
				conexion.close();
				System.out.println("Conexion cerrada...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al cerrar la conexion.");
		}
	}
}
