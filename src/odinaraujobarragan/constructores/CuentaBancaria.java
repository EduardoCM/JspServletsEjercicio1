package odinaraujobarragan.constructores;

import static odinaraujobarragan.util.Validaciones.validarContrasena;;

public class CuentaBancaria {
	private int idCuentaBancaria;
	private String usuario;
	public int getIdCuentaBancaria() {
		return idCuentaBancaria;
	}

	public void setIdCuentaBancaria(int idCuentaBancaria) {
		this.idCuentaBancaria = idCuentaBancaria;
	}

	private String numCuenta;
	private String claveBanco;
	private String contrasena;
	private double saldo;

	public CuentaBancaria() {
		System.out.println("Se crea nueva cuenta");
	}

	public CuentaBancaria(String usuario) {
		this.usuario = usuario;
		System.out.println("Nueva cuenta de: " + usuario);
	}
	
	public CuentaBancaria(String usuario,String numCuenta,double saldo) {
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		System.out.println("Nueva cuenta de: " + usuario+ ", numeroCuenta: " +this.numCuenta+" , con un saldo inicial: "+this.saldo);
	}

	private double consultaSaldo() {
		return saldo;
	}

	public boolean depositarSaldo(double deposito) {
		return true;
	}

	public boolean retirarSaldo(double cantidad) {
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

	public String getClaveBanco() {
		return claveBanco;
	}

	public void setClaveBanco(String claveBanco) {
		switch(claveBanco) {
		case "banamex":
			this.claveBanco = BancosEnum.BANAMEX.getNombre();
			break;
		case "santander":
			this.claveBanco = BancosEnum.SANTANDER.getNombre();
			break;
		case "hsbc":
			this.claveBanco = BancosEnum.HSBC.getNombre();
			break;
		case "bancomer":
			this.claveBanco = BancosEnum.BANCOMER.getNombre();
			break;
			
		}
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
