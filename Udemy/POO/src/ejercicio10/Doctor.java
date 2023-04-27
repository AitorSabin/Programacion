package ejercicio10;

public class Doctor extends Persona{

	private String titulacion;
	private int añosExperiencia;
	
	public Doctor(String nombre, String apellido, int edad, String titulacion, int añosExperiencia) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.añosExperiencia = añosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
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
