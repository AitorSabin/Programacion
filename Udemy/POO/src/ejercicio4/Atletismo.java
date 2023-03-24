package ejercicio4;

public class Atletismo {
	private int numero;
	private String nombre;
	private double tiempoCarrera;
	
	public Atletismo(int numero, String nombre, double tiempoCarrera) {
		this.numero = numero;
		this.nombre = nombre;
		this.tiempoCarrera= tiempoCarrera;
	}
	
	
	public double getTiempoCarrera() {
		return tiempoCarrera;
	}

	public String mostrarGanador() {
		return "El ganador de la carrera es: "+this.nombre+" con el dorsal "+this.numero+"y con un tiempo de: "+this.tiempoCarrera+".";
	}
	
}
