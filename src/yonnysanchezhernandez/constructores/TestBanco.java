package yonnysanchezhernandez.constructores;

public class TestBanco {
	
	public static void main(String [] args) {
		
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		cuentaFabi.setContrasena("2344BGT");
		cuentaFabi.depositar(20000);
		cuentaFabi.setClaveBanco(BancosEnum.BANAMEX);
		
		//System.out.println("Nueva cuenta");
		CuentaBancaria cuentaSam = new CuentaBancaria();
		cuentaSam.setContrasena("123455");
		cuentaSam.depositar(90000);
		cuentaSam.setClaveBanco(BancosEnum.HSBC);
		
		
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		cuentaLeo.retirar(10_000);
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra","25HGT",20000);
		
		CuentaBancaria cuentaDiana = new CuentaBancaria();
		cuentaDiana.setContrasena("123455");
		cuentaDiana.depositar(180000);
		cuentaDiana.setClaveBanco(BancosEnum.HSBC);
	}

}
