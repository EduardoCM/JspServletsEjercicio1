package lorenadrianaperez.constructores;

import lorenadrianaperez.util.Validaciones;

public class CuentaBancaria {
	
	private String usuario;
	private String numCuenta;
	private String claveBanco;
	private String contrasena;
	private double saldo;
	
	public CuentaBancaria() {
		System.out.println("Se crea nueva cuenta");
	}
	
	public CuentaBancaria(String usuario) {
		this.usuario = usuario;
		System.out.println("Nueva cuenta de " + this.usuario);
	}
	
	public CuentaBancaria(String usuario, String numCuenta, double saldo) {
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		
		System.out.println("Nueva cuenta de " + this.usuario +" #Cta. "+ this.numCuenta
							+ " Con un saldo inicial de: $" + this.saldo);
	}
	


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getClaveBanco() {
		return claveBanco;
	}

	public void setClaveBanco(String claveBanco) {
		this.claveBanco = claveBanco;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		Validaciones.validarContrasena(contrasena);
		this.contrasena = contrasena;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
