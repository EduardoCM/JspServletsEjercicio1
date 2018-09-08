package gerardogarcia;

public class RequisitosPacientes {

	public String nombre;
	public String curp;
	public String sexo;
	public String civil;
	public String sangre;
	public int edad;
		
	@Override
	public String toString() {
		return "RequisitosPacientes [nombre=" + nombre + ", curp=" + curp + ", sexo=" + sexo + ", civil=" + civil
				+ ", sangre=" + sangre + ", edad=" + edad + "]";
	}

	public RequisitosPacientes() {
		
	}
	
	public RequisitosPacientes(String nombre, String curp, String sexo, String civil, String sangre, int edad) {
		this.nombre = nombre;
		this.curp = curp;
		this.sexo = sexo;
		this.civil = civil;
		this.sangre = sangre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCivil() {
		return civil;
	}
	public void setCivil(String civil) {
		this.civil = civil;
	}
	public String getSangre() {
		return sangre;
	}
	public void setSangre(String sangre) {
		this.sangre = sangre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
}
