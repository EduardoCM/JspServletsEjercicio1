package org.ipn.escom.model;

public class Vehiculo {
	
	private int idVehiculo;
	private String marca;
	private String modelo;
	private String placa;
	private String color;
	private String tipoVehiculo;
	private Propietario propietario;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(int idVehiculo, String marca, String modelo, String placa, String color, String tipoVehiculo,
			Propietario propietario) {
		super();
		this.idVehiculo = idVehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.color = color;
		this.tipoVehiculo = tipoVehiculo;
		this.propietario = propietario;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa
				+ ", color=" + color + ", tipoVehiculo=" + tipoVehiculo + ", propietario=" + propietario + "]";
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
}
