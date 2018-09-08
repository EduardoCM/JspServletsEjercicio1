package yonnysanchezhernandez.constructores;

public class TestBanco {
	
	public static void main(String [] args) {
		
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		cuentaFabi.depositar(20000);
		
		//System.out.println("Nueva cuenta");
		
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		cuentaLeo.retirar(10_000);
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra","25HGT",20000);
		
		
	}

}
