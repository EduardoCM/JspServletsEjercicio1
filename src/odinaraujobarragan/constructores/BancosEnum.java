package odinaraujobarragan.constructores;

public enum BancosEnum {
	BANAMEX("banamex",20), BANCOMER("bancomer",15), SANTANDER("santander",25), HSBC("hsbc",25);

	private BancosEnum(String nombre,double cat) {
		this.nombre = nombre;
		this.cat = cat;
	}
	private double cat;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public double getCat() {
		return cat;
	}
	
}
