package davidjosuerodriguezchavez.util;

public class Validaciones {
	public void validarPassword(String pass) {
		boolean numero = false;
		boolean letras = false;

		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				numero = true;
			} else {
				letras = true;
			}
		}
		
		if(numero == true && letras == true) {
			System.out.println("Alfanumerico");
		} else if(numero == true && letras == false){
			System.out.println("Todos son digitos");
		} else {
			System.out.println("Todos son letras");
		}

	}
}
