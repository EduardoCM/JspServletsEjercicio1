package giselleflorestepatl;

public class Libros {
	private String nombreAutor;
	private int anioPublicacion;
	private String titulo;
	private String lugar;
	private String editorial;
	
	
	//Constructores
	public Libros() {
	}
	
	
	public Libros(String nombreAutor, int anioPublicacion, String titulo, String lugar, String editorial) {
		this.nombreAutor = nombreAutor;
		this.anioPublicacion = anioPublicacion;
		this.titulo = titulo;
		this.lugar = lugar;
		this.editorial = editorial;
	}

	//Getters y Setters
	public String getNombreAutor() {
		return nombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	@Override
	public String toString() {
		return "Libros [nombreAutor=" + nombreAutor + ", anioPublicacion=" + anioPublicacion + ", titulo=" + titulo
				+ ", lugar=" + lugar + ", editorial=" + editorial + "]";
	}
	
	
	
	

}
