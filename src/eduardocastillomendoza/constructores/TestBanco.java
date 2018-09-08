package eduardocastillomendoza.constructores;

public class TestBanco {
	
	public static void main(String[] args) {
		
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		
		cuentaFabi.depositar(2000);
		
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		
		CuentaBancaria cuentaAlejandra = 
				new CuentaBancaria("Alejandra", 
						           "107865", 
						           20_000);
		
		cuentaLeo.retirar(10_000);
	}

}
