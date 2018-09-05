package org.ipn.escom.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Propietario {
	private int idPropietario;
	private String nombre;
	private String apellidoPeterno;
	private String apellidoMaterno;
	private String fechaNacimiento;
	private String claveElector;
	private String sexo;
	private Vehiculo vehiculo;
	
	public Propietario() {
		
	}

	public Propietario(int idPropietario, String nombre, String apellidoPeterno, String apellidoMaterno,
			String fechaNacimiento, String claveElector, String sexo, Vehiculo vehiculo) {
		super();
		this.idPropietario = idPropietario;
		this.nombre = nombre;
		this.apellidoPeterno = apellidoPeterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.claveElector = claveElector;
		this.sexo = sexo;
		this.vehiculo = vehiculo;
	}

	

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Propietario [idPropietario=" + idPropietario + ", nombre=" + nombre + ", apellidoPeterno="
				+ apellidoPeterno + ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento
				+ ", claveElector=" + claveElector + ", sexo=" + sexo + "]";
	}

	public int getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPeterno() {
		return apellidoPeterno;
	}

	public void setApellidoPeterno(String apellidoPeterno) {
		this.apellidoPeterno = apellidoPeterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getClaveElector() {
		return claveElector;
	}

	public void setClaveElector(String claveElector) {
		this.claveElector = claveElector;
	}

	public String isSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
