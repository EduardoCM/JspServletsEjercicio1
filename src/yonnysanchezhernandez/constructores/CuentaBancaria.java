package yonnysanchezhernandez.constructores;

import yonnysanchezhernandez.util.Validaciones;

public class CuentaBancaria {
	
	private int id;

	private String usuario;
	private String numCuenta;
	private BancosEnum claveBanco;
	private String contrasena;
	private double saldo;
	
	public CuentaBancaria() {
		System.out.println("Se crea nueva cuenta");
	}
	
	public CuentaBancaria(String usuario) {
		this.usuario = usuario;
		System.out.println("Nueva cuenta de " + usuario);
	}
	
	public CuentaBancaria(String usuario, String numCuenta, double saldo) {
		
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		System.out.println("Cuenta de: " + usuario + ", numero de cuenta: " + numCuenta
							+ ", con saldo: " + saldo);
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setClaveBanco(String claveBanco) {
		switch(claveBanco) {
			case "banamex":
			this.claveBanco = BancosEnum.BANAMEX;
			break;
			case "bancomer":
			this.claveBanco = BancosEnum.BANCOMER;
			break;
			case "santader":
			this.claveBanco = BancosEnum.SANTANDER;
			break;
			case "hsbc":
			this.claveBanco = BancosEnum.HSBC;
			break;
			
			
		}
//		this.claveBanco = claveBanco;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		//Validaciones validar = new Validaciones();
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
