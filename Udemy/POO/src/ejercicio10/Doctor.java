package ejercicio10;

public class Doctor extends Persona{

	private String titulacion;
	private int a�osExperiencia;
	
	public Doctor(String nombre, String apellido, int edad, String titulacion, int a�osExperiencia) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.a�osExperiencia = a�osExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Supervisa a los jugadores mientras juegan.");
	}

	@Override
	public void entrenamiento() {
		System.out.println("Supervisa a los jugadores mientras entrenan.");
	}
	
	public void curarLesion() {
		System.out.println("Cura la lesion de los jugadores");
	}
}
