package eduardocastillomendoza.constructores;

public enum CafeSize {
	
	CHICO(15),
	MEDIANO(20),
	GRANDE(25);
	
	private int precio;
	
	private CafeSize(int precio) {
		this.precio = precio;
	}

}
