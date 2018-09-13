package yonnysanchezhernandez.constructores;

public enum BancosEnum {
	
	BANAMEX("banamex", 20),
	BANCOMER("bancomer", 15),
	SANTANDER("santander", 25),
	HSBC("hsbc", 25);
	
	private double cat;
	private String nombre;
	
	private BancosEnum(String nombre, double cat) {
		this.nombre = nombre;
		this.cat = cat;
	}
	
	//Solo se puede obtener, no se puede modificar por que son finales

	public String getNombre() {
		return nombre;
	}


	public double getCat() {
		return cat;
	}
	
	
	
	
	
}
