package giselleflorestepatl.constructores;

import giselleflorestepatl.util.validaciones;

public class testBanco {
	public static void main(String [] args) {
		//Constructor
		CuentaBancaria cuentaGis = new CuentaBancaria();
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonado");
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "12356ASD", 50_000);
		
		cuentaGis.depositar(25_000);
		
		validaciones validaCuentaAlejandra = new validaciones();
		validaCuentaAlejandra.validarContrasena(cuentaAlejandra.getContrasena());
		
	}

}
