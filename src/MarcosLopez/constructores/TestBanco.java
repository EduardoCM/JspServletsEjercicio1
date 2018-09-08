package MarcosLopez.constructores;

public class TestBanco {
	public static void main(String[] args) {
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		cuentaFabi.depositar(2000);
		cuentaFabi.setContrasena("LOHM900811");
		cuentaFabi.setClaveBanco(Bancos.HSBC);
		
		/*CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		cuentaLeo.retirar(10000);
		
		CuentaBancaria cuentaAle = new CuentaBancaria("Alejandra", "00084697", 20_000);*/
	}
}
