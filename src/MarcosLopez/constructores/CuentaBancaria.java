package MarcosLopez.constructores;

public class CuentaBancaria {
	private String usuario;
	private String numCuenta;
	private String claveBanco;
	private String contraseña;
	private double saldo;
	
	public CuentaBancaria(){
		System.out.println("Se crea nueva cuenta vacia");
	}
	
	public CuentaBancaria(String usuario){
		this.usuario = usuario;
		System.out.println("Nueva cuenta de: " + usuario);
	}
	
	public CuentaBancaria(String usuario,String numCuenta, double saldo){
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		System.out.println("Nueva cuenta de: " + this.usuario + " " + this.numCuenta + " con saldo inicial: " + this.saldo);
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
	
	public String getClaveBanco() {
		return claveBanco;
	}
	
	public void setClaveBanco(String claveBanco) {
		this.claveBanco = claveBanco;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
