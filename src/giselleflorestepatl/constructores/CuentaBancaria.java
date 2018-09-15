package giselleflorestepatl.constructores;

//import giselleflorestepatl.util.validaciones;
import static giselleflorestepatl.util.validaciones.validarContrasena;

public class CuentaBancaria {
	
	private int id;
	private String usuario;
	private String numCuenta;
	private BancosEnum claveBanco;
	private String contrasena;
	private double saldo;
	
	/*Java crea constructores por default 
	Se pueden sobre cargar
	*/
	public CuentaBancaria() {
		System.out.println("Se crea una nueva cuenta vacia");
	}
	
	public CuentaBancaria(String usuario) {
		this.usuario = usuario;
		System.out.println("Nueva cuenta de " + usuario);
	}
	
	public CuentaBancaria(String usuario, String numCuenta, double saldo) {
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		System.out.println("Nueva cuenta de: " + this.usuario
				+  " Num cuenta: " + this.numCuenta 
				+ " Saldo: " + this.saldo);
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
		case "BANAMEX":
			this.claveBanco = BancosEnum.BANAMEX;
			break;
		case "BANCOMER":
			this.claveBanco = BancosEnum.BANCOMER;
			break;
		case "SANTANDER":
			this.claveBanco = BancosEnum.SANTANDER;
			break;
		case "HSBC":
			this.claveBanco = BancosEnum.HSBC;
			break;
		default:
			break;
		}
	}

	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		/*validaciones valida = new validaciones(); 
		 Ya no se instancia un objeto pues es estatico el
		 metodo al que se quiere acceder
		*/
		//valida.validarContrasena(contrasena);
		//Ya no se crea el objeto, es estatico
		//validaciones.validarContrasena(contrasena);
		validarContrasena(contrasena);//esto se ocupa cuando se hace el import static
		this.contrasena = contrasena;
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
				+ claveBanco + ", contrasena=" + contrasena + ", saldo=" + saldo + "]";
	}
	
	
	
	
	
	

}
