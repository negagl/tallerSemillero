package com.clearminds.ngl.bdd.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.ngl.bdd.ConexionBDD;
import com.clearminds.ngl.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = ConexionBDD.obtenerConexion();
			if (con != null){
				System.out.println("Conexion exitosa!");
			}
		} catch (BDDException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
