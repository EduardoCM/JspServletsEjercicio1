package eduardocastillomendoza.constructores;

public class TestBanco {
	
	public static void main(String[] args) {
		
		
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		cuentaFabi.setContrasena("ASDASDASD");
		cuentaFabi.depositar(2000);
		cuentaFabi.setClaveBanco(BancosEnum.BANCOMER);
		
		
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		Bancos bancoLeo = new Bancos();
		cuentaLeo.setClaveBanco(BancosEnum.HSBC);
		
		CuentaBancaria cuentaAlejandra = 
				new CuentaBancaria("Alejandra", 
						           "107865", 
						           20_000);
		
		
		cuentaLeo.retirar(10_000);
	}

}
