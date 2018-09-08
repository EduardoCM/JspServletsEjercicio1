package lizGarcia.util;

public  class cuentaBancaria_Liz {
	private int idCuenta;
	

	private String numCuenta;
	private String usuario;
	
	private String claveBanco;
	private String contrasenia;
	private double saldo;
	
	public cuentaBancaria_Liz(String usuario){
		this.usuario = usuario;
		System.out.println("se crea nueva cuenta");
	}
	
	public int getIdCuenta() {
	    return idCuenta;
		}

		public void setIdCuenta(int idCuenta) {
			this.idCuenta = idCuenta;
		}
	
	public cuentaBancaria_Liz(){
		
		System.out.println("se crea nueva cuenta vacia ");
	}
	
	public cuentaBancaria_Liz(String usuario,String numCuuenta, double saldo){
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		System.out.println(" nueva cuenta de " + this.usuario
				+ this.numCuenta + " con un saldo inicial "+this.saldo);
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClaveBanco() {
		return claveBanco;
	}
	public void setClaveBanco(String claveBanco) {
		
		switch(claveBanco) {
		case "BANAMEX":
			this.claveBanco = enumBancos_Liz.BANAMEX;
			break;
			
		case "HSBC":
			this.claveBanco = enumBancos_Liz.HSBC;
			break;
			
		case "SANTANDER":
			this.claveBanco = enumBancos_Liz.SANTANDER;
			break;
			
		case "BANCOMER":
			this.claveBanco = enumBancos_Liz.BANCOMER;
			break;
		}
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double consultaSaldo() {
		return saldo;
	}
	
	public boolean depositar(double deposito){
		return true;
	}
	
	public boolean retirar (double retiro){
		return true;
	}
}
