package eduardocastillomendoza.constructores;

public enum BancosEnum {
	
	B1("banamex", 20), 
	B2("bancomer", 15), 
	B3("santander", 25), 
	BANCOHSBC("hsbc", 25);
	
	private double cat;
	private String nombre;
	
	private BancosEnum(String nombre, double cat) {
		this.nombre = nombre;
		this.cat = cat;
	}
	

	public String getNombre() {
		return nombre;
	}


	public double getCat() {
		return cat;
	}
	
	
	
	
	
	
	

}
