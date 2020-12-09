package com.clearminds.ngl.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {
	public static String leerPropiedad(String prop){
		Properties p = new Properties();
		String msj = null;
		try {
			p.load(new FileReader("C:/Users/Nega/Documents/CapacitacionCMC/CapacitacionGit/tallerSemillero/conexion.properties"));
			System.out.println("Archivo encontrado");
			msj = "Property ="+p.getProperty(prop);
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
			return msj;
		} catch (IOException e) {			
			return msj;
		}
		return msj;
	}
}
