package giselleflorestepatl.util;

public class validaciones {
	
	public static void validarContrasena(String password) {
		boolean numero  = false;
		boolean letras  = false;
		
		
		for(int i=0; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i))) {
				numero = true;
			}
			else {
				letras = true;
			}
		}
		
		if(numero == true && letras == false) {
			System.out.println("Todos son digitos");
		}
		else if(letras == true && numero == false) {
			System.out.println("Todos son letras");
		}
		else if(letras && numero) {
			System.out.println("Alfanumerico");
		}
		else {
			System.out.println("No valido");
		}
	}

}
