package odinaraujobarragan.constructores;

public class CuentaBancaria {
	private String usuario;
	private String numCuenta;
	private String claveBanco;
	private String contrase�a;
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
		this.claveBanco = claveBanco;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}