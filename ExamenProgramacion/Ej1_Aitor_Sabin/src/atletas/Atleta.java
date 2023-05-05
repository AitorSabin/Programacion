package atletas;

public abstract class Atleta {

	protected String nombre;
	protected String apellidos;
	protected String pais;
	protected int anhoNacimiento;
	
	public Atleta() {
		
	}

	public Atleta(String nombre, String apellidos, String pais, int anhoNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pais = pais;
		this.anhoNacimiento = anhoNacimiento;
	}
	
	public abstract String mostrarDatosDeportivos();
	
	public String mostrarDatosAtleta() {
		return "El nombre del Atleta es: "+this.nombre+"\n"+
				"El apellido del Atleta es: "+this.apellidos+"\n"+
				"El pais del Atleta es: "+this.pais+"\n"+
				"El año de nacimiento del Atleta es: "+this.anhoNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAnhoNacimiento() {
		return anhoNacimiento;
	}

	public void setAnhoNacimiento(int anhoNacimiento) {
		this.anhoNacimiento = anhoNacimiento;
	}
	
}
