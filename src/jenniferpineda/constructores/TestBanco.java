package jenniferpineda.constructores;

public class TestBanco {
	
	public static void main(String[] args) {
		
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		cuentaFabi.depositar(2000);
		cuentaFabi.setContrasena("1234ABCD");
		cuentaFabi.setClaveBanco(Bancos.HSBC);
		
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		cuentaLeo.setClaveBanco(Bancos.BANAMEX);

		/*	
			
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "107865",20000);
		
		System.out.println("Creando cuenta");		
	*/
	}

}
