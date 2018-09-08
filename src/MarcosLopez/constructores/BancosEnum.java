package MarcosLopez.constructores;

public enum BancosEnum {
	
	BANAMEX("banamex",20), BANCOMER("bancomer",15), SANTANDER("santander",25), HSBC("hsbc",25);
	
	private BancosEnum(String nombre, double cat) {
		this.cat = cat;
		this.nombre = nombre;
	}
	
	private double cat;
	private String nombre;

	public double getCat() {
		return cat;
	}

	public String getNombre() {
		return nombre;
	}
}
