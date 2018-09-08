package giselleflorestepatl.constructores;

public enum BancosEnum {
	//Estos por defecto son public static final
	BANAMEX("banamex", 20),
	BANCOMER("bancomer", 15),
	SANTANDER("santander", 25),
	HSBC("hsbc", 25);
	
	private double cat;
	private String nombre;
	
	private BancosEnum( String nombre, double cat) {
		this.cat = cat;
		this.nombre = nombre;
	}

	//Solo se puede obtener, no se puede modificar por que son finales
	public double getCat() {
		this.nombre = nombre;
		return cat;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
}
