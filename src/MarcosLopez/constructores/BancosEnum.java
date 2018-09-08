package MarcosLopez.constructores;

public enum BancosEnum {
	
	BANAMEX(20), BANCOMER(15), SANTANDER(25), HSBC(25);
	
	private BancosEnum(double cat) {
		this.cat = cat;
	}
	
	private double cat;

	public double getCat() {
		return cat;
	}
}
