package ejercicio4Repaso;

public class Atletismo {
	
	private int numAtleta;
	private String nombre;
	private double tiempoCarrera;

	public Atletismo(int numAtleta, String nombre, double tiempoCarrera) {
		this.numAtleta = numAtleta;
		this.nombre = nombre;
		this.tiempoCarrera = tiempoCarrera;
	}

	public double getTiempoCarrera() {
		return tiempoCarrera;
	}
	
	public String mostrarDatos() {
		return "El ganador "+ nombre + " con el numero " + numAtleta + " y un tiempo de: "+ tiempoCarrera;
	}
	

}
