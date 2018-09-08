package jaimebastida.constructores;

public class TestBanco 
{
	public static void main(String[] args) 
	{
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		
		cuentaFabi.setContrasena("123ADB");
		cuentaFabi.depositar(1000);
		cuentaFabi.setClaveBanco(Bancos.HSBC);
		
	
		/*CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "123456", 20_000.0);
		*/
		
		
	}
}
