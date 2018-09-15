package giselleflorestepatl.constructores;

public class testBanco {
	public static void main(String [] args) {
		//Constructor
		CuentaBancaria cuentaGis = new CuentaBancaria();
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonado");
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "12356ASD", 50_000);
		
		cuentaGis.depositar(25_000);
		//cuentaGis.setClaveBanco(BancosEnum.HSBC);
		
		//cuentaGis.setClaveBanco(BancosEnum.BANCOMER.toString());
		//cuentaGis.setClaveBanco(BancosEnum.BANCOMER.getNombre());
		//cuentaGis.setClaveBanco(BancosEnum.BANCOMER);
		
		cuentaAlejandra.setContrasena("99999");
		
	}

}
