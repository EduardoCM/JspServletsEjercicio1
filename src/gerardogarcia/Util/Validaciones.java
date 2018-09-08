package gerardogarcia.Util;

public class Validaciones {

	
	public void validarContrasena( String pass) {
		boolean numero = false;
		boolean letras = false;
		for (int i=0; i<pass.length(); i++) {
			if(Character.isDigit(pass.charAt(i))) {
				numero=true;
				System.out.println("Todos son numeros");
			}else {
				letras = true;
				System.out.println("Todos son letras");
			}
			System.out.println("alfanumerico");
		}
		
	}
	
	

}
