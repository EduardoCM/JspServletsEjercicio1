package lorenadrianaperez.constructores;

public class TestBanco {
	
	public static void main (String args []) {
		
		CuentaBancaria cuentaFabi1 = new CuentaBancaria();
		
		//cuentaFabi.depositar(2000);
		
		//CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		
		cuentaFabi1.setContrasena("12345a");
	
		cuentaFabi1.setClaveBanco(Bancos.HSBC);
		
		//CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "28423100", 20_000);
		
		System.out.println("Creando cuenta bancaria");
		
		//cuentaLeo.retirar(10_000);
		
	}

}
