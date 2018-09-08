package davidjosuerodriguezchavez.constructores;

public class TestBanco {
	public static void main(String[] args) {
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		cuentaFabi.setPassword("12");
		cuentaFabi.depositar(2000);
		
		cuentaFabi.setClaveBanco(BancosEnum.BANAMEX);
		System.out.println(cuentaFabi.getClaveBanco());
		// CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		// CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "123456", 20_000.0);
	}
}
