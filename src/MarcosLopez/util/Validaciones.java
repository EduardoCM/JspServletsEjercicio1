package MarcosLopez.util;

public class Validaciones {
	
	public void validarContrasena(String pass){
		boolean numero = false;
		boolean letras = false;
		
		for(int i = 0; i < pass.length(); i++ ) {
			if(Character.isDigit(pass.charAt(i)))
				numero = true;
			else
				letras = true;
		}
		
		if(numero & !letras)
			System.out.println("Todos son d�gitos");
		else if(!numero & letras)
			System.out.println("Todos son letras");
		else if(numero & letras)
			System.out.println("Todos son alfanumericos");
	}
}
