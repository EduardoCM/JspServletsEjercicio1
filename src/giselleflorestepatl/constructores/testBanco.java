package giselleflorestepatl.constructores;

import giselleflorestepatl.util.validaciones;

public class testBanco {
	public static void main(String [] args) {
		//Constructor
		CuentaBancaria cuentaGis = new CuentaBancaria();
		CuentaBancaria cuentaLeo = new CuentaBancaria("Leonado");
		CuentaBancaria cuentaAlejandra = new CuentaBancaria("Alejandra", "12356ASD", 50_000);
		
		cuentaGis.depositar(25_000);
		cuentaAlejandra.setContrasena("99999");
		validaciones validaCuentaAlejandra = new validaciones();
		validaCuentaAlejandra.validarContrasena(cuentaAlejandra.getContrasena());
		cuentaAlejandra.setContrasena("99999A");
		validaCuentaAlejandra.validarContrasena(cuentaAlejandra.getContrasena());
		cuentaAlejandra.setContrasena("GGGGGGG");
		validaCuentaAlejandra.validarContrasena(cuentaAlejandra.getContrasena());
		
	}

}
