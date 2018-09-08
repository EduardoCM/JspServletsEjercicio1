package eduardocastillomendoza.util;

import static java.lang.System.out;

public class Validaciones {
	
	public static void validarContrasena(String pass) {
		boolean numero = false;
		boolean letras = false;
		
		for(int i = 0; i < pass.length(); i++) {
			
			if(Character.isDigit(pass.charAt(i))) {
				numero = true;
			}else {
				letras = true;
			}
		
		}
		
		if(numero && !letras) {
			out.println("Todos son digitos");
		}else if (numero) {
			out.println("Alfanumericos");
		}else {
			out.println("Todos letras");
		}
	}

}
