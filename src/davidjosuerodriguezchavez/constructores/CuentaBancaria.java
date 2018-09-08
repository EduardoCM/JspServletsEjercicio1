package davidjosuerodriguezchavez.constructores;

public class CuentaBancaria {
	private String usuario;
	private String numCuenta;
	private String claveBanco;
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
		System.out.println("Nueva cuenta de " + this.usuario + "\nCon numero de cuenta: " 
							+ this.numCuenta + "\nCon saldo inicial: " + this.saldo);
	}

	private double consultaSaldo() {
		return saldo;
	}

	public boolean depositar(double deposito) {
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
		this.claveBanco = claveBanco;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
