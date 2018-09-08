package jenniferpineda.constructores;

public enum BancosEnum {
	
	BANAMEX(20), BANCOMER(15), SANTANDER(25), HSBC(25);
	
	private double cat;
	
	private BancosEnum(double cat) {
		this.cat = cat;
	}

	public double getCat() {
		return cat;
	}

		

}
