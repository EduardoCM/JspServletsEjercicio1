package jenniferpineda.constructores;

public class TestBanco {
	
	public static void main(String[] args) {
		
		CuentaBancaria cuentaFabi = new CuentaBancaria();
		cuentaFabi.depositar(2000);
		
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonardo");
		cuentaLeo.retirar(10_000);
		
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "107865",20000);
		
		System.out.println("Creando cuenta");
		
		
	}

}
