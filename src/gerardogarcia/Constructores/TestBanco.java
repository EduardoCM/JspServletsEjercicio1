package gerardogarcia.Constructores;

public class TestBanco {

	public static void main (String [] args) {
		CuentaBancaria cuentafabi = new CuentaBancaria();
		cuentafabi.setContrasena("1234");
		
		//CuentaBancaria cuentaleo = new CuentaBancaria("lenardo");
		
		cuentafabi.setClaveBanco(Bancos.hsbc);
		cuentafabi.setClaveBanco(Bancos.hsbc);
		
		
	}
}
