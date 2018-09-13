package yonnysanchezhernandez.util;
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
			System.out.println("Todos son numero");
		}else if(numero) {
			System.out.println("Son alfanumericos");
		}else{
			System.out.println("Son letras");
		}


	}
}
