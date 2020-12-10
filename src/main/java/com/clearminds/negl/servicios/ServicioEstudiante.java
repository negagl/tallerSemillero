package com.clearminds.negl.servicios;

import java.sql.SQLException;
import com.clearminds.negl.servicios.DateUtil;
import java.sql.Statement;

import com.clearminds.ngl.dtos.Estudiante;
import com.clearminds.ngl.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante);
		Statement stmt = null;
		String fecha = DateUtil.convertirFecha();
		try {
			stmt = getConexion().createStatement();

			String sql = "insert into estudiantes(nombre,apellido,edad, fecha_modificacion) values('"
					+ estudiante.getNombre() + "','" + estudiante.getApellido() + "'," + estudiante.getEdad() + ",'"
					+ fecha + "')";

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Actualizando estudiante: " + estudiante);
		Statement stmt = null;
		String fecha = DateUtil.convertirFecha();
		try {
			stmt = getConexion().createStatement();

			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "', apellido='"
					+ estudiante.getApellido() + "', edad=" + estudiante.getEdad() + ", fecha_modificacion='" + fecha
					+ "' where id=" + estudiante.getId();

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
	}
}
