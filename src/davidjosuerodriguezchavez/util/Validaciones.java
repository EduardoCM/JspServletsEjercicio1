package davidjosuerodriguezchavez.util;

import static java.lang.System.out;

public class Validaciones {
	public static void validarPassword(String pass) {
		boolean numero = false;
		boolean letras = false;

		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				numero = true;
			} else {
				letras = true;
			}
		}
		
		if(numero && letras) {
			out.println("Alfanumerico");
		} else if(numero && !letras){
			out.println("Todos son digitos");
		} else {
			out.println("Todos son letras");
		}

	}
}
