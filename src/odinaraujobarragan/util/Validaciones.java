package odinaraujobarragan.util;

public class Validaciones {
	public static void validarContraseña(String password) {
		boolean numero = false;
		boolean letras = false;

		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				numero = true;
			} else {
				letras = true;
			}
		}
		
		String mensaje = numero && letras ? "Es alfanumerico": numero?"Todos son digitos":"Todos son letras";
		System.out.println(mensaje);
	}
}
