package atletas;

public class SaltadorLongitud extends Atleta{

	private double mejorSaltoPersonal;
	private double saltoPrueba;
	
	public SaltadorLongitud() {
	
	}

	public SaltadorLongitud(String nombre, String apellidos, String pais, int anhoNacimiento,double mejorSaltoPersonal) {
		super(nombre, apellidos, pais, anhoNacimiento);
		this.mejorSaltoPersonal = mejorSaltoPersonal;
		this.saltoPrueba=0;
	}

	@Override
	public String mostrarDatosDeportivos() {
		return "El mejor Salto Personal es: "+this.mejorSaltoPersonal+"\n"+
				"El Salto de la Prueba es: "+this.saltoPrueba;
	}
	
	public void actualizarMejorSalto() {
		if(this.mejorSaltoPersonal<this.saltoPrueba) {
			this.mejorSaltoPersonal=this.saltoPrueba;
		}
	}

	public double getMejorSaltoPersonal() {
		return mejorSaltoPersonal;
	}

	public void setMejorSaltoPersonal(double mejorSaltoPersonal) {
		this.mejorSaltoPersonal = mejorSaltoPersonal;
	}

	public double getSaltoPrueba() {
		return saltoPrueba;
	}

	public void setSaltoPrueba(double saltoPrueba) {
		this.saltoPrueba = saltoPrueba;
	}
	
	
	
}
