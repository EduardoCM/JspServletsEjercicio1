package lorenadrianaperez;

public class Producto {
	
	private String nparte;
	private String descripcion;
	private String proveedor;
	private int aduana;
	private int patente;
	private int pedimento;
	
	private String procedencia;

	
	public Producto () {
		
	}
	
	
	public Producto(String nparte, String descripcion, String proveedor, int aduana, int patente, int pedimento, String procedencia) {
		this.nparte = nparte;
		this.descripcion = descripcion;
		this.proveedor = proveedor;
		this.aduana = aduana;
		this.patente = patente;
		this.pedimento = pedimento;
		this.procedencia = procedencia;

	}


	public String getNparte() {
		return nparte;
	}


	public void setNparte(String nparte) {
		this.nparte = nparte;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public int getAduana() {
		return aduana;
	}


	public void setAduana(int aduana) {
		this.aduana = aduana;
	}


	public int getPatente() {
		return patente;
	}


	public void setPatente(int patente) {
		this.patente = patente;
	}


	public int getPedimento() {
		return pedimento;
	}


	public void setPedimento(int pedimento) {
		this.pedimento = pedimento;
	}

	public String getProcedencia() {
		return procedencia;
	}


	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}	
	
	
	
	

	@Override
	public String toString() {
		return "Producto [nparte=" + nparte + ", descripcion=" + descripcion + ", proveedor=" + proveedor + ", aduana="
				+ aduana + ", patente=" + patente + ", pedimento=" + pedimento +", procedencia=" + procedencia + "]";
	}
	
	

	

}
