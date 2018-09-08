package yonnysanchezhernandez.util;

public class Validaciones {
	
	public void validarContrasena(String pass) {
		
		boolean numero = false;
		boolean letras = false;
		
		for(int i = 0; i < pass.length(); i++) {
			
			if(Character.isDigit(pass.charAt(i))) {
				numero = true;
			}else {
				letras = true;
			}

		}
		
		if(numero = true & letras == false) {
			System.out.println("Todos son numero");
		}if(letras = true & numero == false) {
			System.out.println("Todos son letras");
		}else {
			System.out.println("Es alfanumerico");
		}

		}
}
