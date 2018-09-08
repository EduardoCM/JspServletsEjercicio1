package davidjosuerodriguezchavez.constructores;

public class TestBanco {
	public static void main(String[] args) {
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "123456", 20_000.0);
	}
}
