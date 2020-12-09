package com.clearminds.ngl.bdd.test;

import com.clearminds.negl.servicios.ServicioEstudiante;
import com.clearminds.ngl.dtos.Estudiante;
import com.clearminds.ngl.excepciones.BDDException;

public class TestServicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try{
			srvEstudiante.insertarEstudiante(new Estudiante("Enrique", "Lopez"));
		}catch(BDDException e){
			e.printStackTrace();
			e.getMessage();
		}
	}

}
