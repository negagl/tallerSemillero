package com.clearminds.ngl.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.clearminds.ngl.excepciones.BDDException;

public class ConexionBDD {
	static final String JDBC_DRIVER_windowsServer = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	public static String leerPropiedad(String prop) {
		Properties p = new Properties();
		String msj = null;
		try {
			p.load(new FileReader(
					"C:/Users/Nega/Documents/CapacitacionCMC/CapacitacionGit/tallerSemillero/conexion.properties"));
			msj = p.getProperty(prop);
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
			return msj;
		} catch (IOException e) {
			return msj;
		}
		return msj;
	}

	public static Connection obtenerConexion() throws BDDException, SQLException, ClassNotFoundException{
		String usr = leerPropiedad("usuario");
		String pass = leerPropiedad("password");
		String url = leerPropiedad("urlConexion");
		Connection con = null;
		try{
			Class.forName(JDBC_DRIVER_windowsServer);
			con = DriverManager.getConnection(url, usr, pass);			
		}catch(SQLException e){
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		}

		return con;
	}
}
