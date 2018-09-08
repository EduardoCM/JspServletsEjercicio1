package yonnysanchezhernandez;

import java.time.LocalDate;

public class registroInquilinos {

	private int idInquilino;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private int edad;
	private String sexo;
	private String inmueble;
	private String direccion;
	private LocalDate fechaIngreso;

	 	
	public registroInquilinos(){
		
	}
	
	public registroInquilinos(int idInquilino, String nombre, String apPaterno, String apMaterno, int edad, String sexo,
			String inmueble, String direccion, LocalDate fechaIngreso) {
		this.idInquilino = idInquilino;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.edad = edad;
		this.sexo = sexo;
		this.inmueble = inmueble;
		this.direccion = direccion;
		this.fechaIngreso = fechaIngreso;
	}

	public int getIdInquilino() {
		return idInquilino;
	}

	public void setIdInquilino(int idInquilino) {
		this.idInquilino = idInquilino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getInmueble() {
		return inmueble;
	}

	public void setInmueble(String inmueble) {
		this.inmueble = inmueble;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Inquilino: [" + idInquilino + ", nombre: " + nombre + ", Apellido1: " + apPaterno
				+ ", Apellido2: " + apMaterno + ", Edad: " + edad + ", Sexo: " + sexo + ", Inmueble: " + inmueble
				+ ", Direccion: " + direccion + ", Ingreso: " + fechaIngreso + "]";
	}

/*
	@Override
	public String toString() {
		return "registroInquilinos [idInquilino=" + idInquilino + ", nombre=" + nombre + ", apPaterno=" + apPaterno
				+ ", apMaterno=" + apMaterno + ", edad=" + edad + ", sexo=" + sexo + ", inmueble=" + inmueble
				+ ", direccion=" + direccion + ", fechaIngreso=" + fechaIngreso + "]";
	}
*/	
	

}
