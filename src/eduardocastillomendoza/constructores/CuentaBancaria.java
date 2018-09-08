package eduardocastillomendoza.constructores;

import static eduardocastillomendoza.util.Validaciones.validarContrasena;;

public class CuentaBancaria {

	private String usuario;
	private String numCuenta;
	private BancosEnum claveBanco;
	private String contrasena;
	private double saldo;
	
	public CuentaBancaria() {
		
	}
	public CuentaBancaria(String usuario) {
		this.usuario = usuario;
		System.out.println("Nueva cuenta de " + this.usuario);
	}
	
	public CuentaBancaria(String usuario, String numCuenta,
			              double saldo) {
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		System.out.println("Nueva cuenta de " + this.usuario
				+ this.numCuenta +
				"Con un sldo inicial: " + this.saldo);
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

}
