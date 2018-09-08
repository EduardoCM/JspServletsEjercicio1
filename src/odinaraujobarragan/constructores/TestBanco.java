package odinaraujobarragan.constructores;

public class TestBanco {

	public static void main(String[] args) {
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		cuentaFabi.depositarSaldo(2000);
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "107865", 20_000);
		cuentaLeo.retirarSaldo(10_000);
	}
}
