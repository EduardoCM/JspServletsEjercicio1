package gerardogarcia.Constructores;

public class CuentaBancaria {

		private String usuario;
		private String numCuenta;
		private String claveBanco;
		private String contraseña;
		private double saldo;
		
		public CuentaBancaria () {
			System.out.println("se crea una cuenta bancaria vacia");
		}
		
		public CuentaBancaria (String usuario) {
			this.usuario = usuario;
			System.out.println("Nueva cuenta de usuario "+ usuario);
		}
		
		public CuentaBancaria (String usuario,String numCuenta,double saldo) {
			this.usuario = usuario;
			this.numCuenta= numCuenta;
			this.saldo=saldo;
			System.out.println("Nueva cuenta "+usuario+ "Cuenta"+numCuenta+"Saldo disponible"+ saldo);
		}
		
		
		private double consultaSaldo() {
			return saldo;
		}
		
		public boolean depositar (double deposito) {
			return true;
		}
		
		public boolean retiro(double retiro) {
			return false;
		}
		
}
