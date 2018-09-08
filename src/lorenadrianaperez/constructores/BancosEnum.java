package lorenadrianaperez.constructores;

public enum BancosEnum {
	
	BANAMEX(20), 
	BANCOMER(15),
	SANTANDER(18),
	HSBC(12);
	
	private double cat;
	
	private BancosEnum(double cat) {
		this.cat = cat;
	}

	public double getCat() {
		return cat;
	}


	
	
	
	
	

}
