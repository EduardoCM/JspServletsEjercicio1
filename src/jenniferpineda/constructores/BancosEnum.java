package jenniferpineda.constructores;

public enum BancosEnum {
	
	BANAMEX("Banamex",20), BANCOMER("Bancomer",15), SANTANDER("Santander",25), HSBC("HSBC",25);
	
	private double cat;
	private String nombre;
	
	private BancosEnum(String nombre, double cat) {
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
