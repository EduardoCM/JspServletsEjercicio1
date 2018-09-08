package jaimebastida.util;

public class Validaciones 
{
	public static void validarPassword(String pass)
	{
		boolean numero = true;
		boolean letras = true;
		
		for(int i = 0; i < pass.length(); i++) 
		{
			if(Character.isDigit(pass.charAt(i)))
			{
				letras = false;				
			}
			else
			{
				numero = false;
			}
		}
		
		if(numero)
			System.out.println("Todos son digitos");
		else if(letras)
			System.out.println("Todos son letras");
		else
			System.out.println("Alfanumerico");
	}
}
