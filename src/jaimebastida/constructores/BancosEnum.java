package jaimebastida.constructores;

public enum BancosEnum 
{
	BANAMEX("banamex", 20), BANCOMER("bancomer", 15), SANTANDER("santander", 25), HSBC("hsbc", 30);
	
	private double cat;
	private String nombre;
	
	private BancosEnum(String nombre, double cat)
	{
		this.cat = cat;
		this.nombre = nombre;
	}

	public double getCat() {
		return cat;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
