package davidjosuerodriguezchavez.constructores;

import static davidjosuerodriguezchavez.util.Validaciones.validarPassword;

public class CuentaBancaria {
	
	private int id;
	private String usuario;
	private String numCuenta;
	private BancosEnum claveBanco;
	private String password;
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
		System.out.println("Nueva cuenta de " + this.usuario + "\nCon numero de cuenta: " + this.numCuenta
				+ "\nCon saldo inicial: " + this.saldo);
	}

	private double consultaSaldo() {
		return saldo;
	}

	public boolean depositar(double deposito) {
		return true;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		validarPassword(password);
		this.password = password;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", usuario=" + usuario + ", numCuenta=" + numCuenta + ", claveBanco="
				+ claveBanco + ", password=" + password + ", saldo=" + saldo + "]";
	}
}
