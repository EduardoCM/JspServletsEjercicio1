package jenniferpineda.constructores;

import jenniferpineda.util.Validaciones;

import static jenniferpineda.util.Validaciones.validarContrasena;

public class CuentaBancaria {
	
	private String numCuenta;
	private BancosEnum claveBanco;
	private String contrasena;
	private double saldo;
	private String usuario;
	
	public CuentaBancaria() {
		System.out.println("Se crea nueva cuenta vacia");
	}
	
	public CuentaBancaria(String usuario) {
		this.usuario = usuario;
		System.out.println("Nueva cuenta de " + usuario);
	}
	
	public CuentaBancaria(String usuario, String numCuenta, double saldo) {
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		System.out.println("Nueva cuenta de " + this.usuario + this.numCuenta + "Con un saldo inicial " + this.saldo);
	}
	
	public double consultaSaldo() {
		return saldo;
	}
	
	public boolean depositar(double deposito) {
		return true;
	}
	
	public boolean retirar(double retiro) {
		return true;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public BancosEnum getClaveBanco() {
		return claveBanco;
	}

	public void setClaveBanco(BancosEnum claveBanco) {
		this.claveBanco = claveBanco;
	}

	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		validarContrasena(contrasena);
		this.contrasena = contrasena;
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}
