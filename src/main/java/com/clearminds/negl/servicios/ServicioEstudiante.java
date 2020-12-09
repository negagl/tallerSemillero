package com.clearminds.negl.servicios;

import com.clearminds.ngl.dtos.Estudiante;
import com.clearminds.ngl.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante);
		cerrarConexion();
	}
}
