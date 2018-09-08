package gerardogarcia.Constructores;

public enum BancosEnum {

	banamex(20),bancomer(20),santander(20),hsbc(20);
	private double cat;
	private BancosEnum (double cat) {
		this.cat = cat;
	}
	public double getCat() {
		return cat;
	}
	
}
