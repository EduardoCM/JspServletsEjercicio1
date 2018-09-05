package org.ipn.escom.model;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private float estatura;
	

	public Persona() {
		
	}

	public Persona(String nombre, String apellidos, int edad, float estatura) {
		System.out.println("Entro a contructor de classe Persona");
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Nueva Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", estatura=" + estatura
				+ "]";
	}
	
	

}
