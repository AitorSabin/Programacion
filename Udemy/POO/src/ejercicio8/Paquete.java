package ejercicio8;

public class Paquete {
	
	private int numeroPaquete;
	private int  prioridad;
	private double peso;
	private String dni;
	
	public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
		this.numeroPaquete = numeroPaquete;
		this.dni = dni;
		this.peso = peso;
		this.prioridad = prioridad;
	}

	public int getNumeroPaquete() {
		return numeroPaquete;
	}

	public String getDni() {
		return dni;
	}

	public double getPeso() {
		return peso;
	}

	public int getPrioridad() {
		return prioridad;
	}
	
	public String mostrarDatosPaquete() {
		return "El numero de referencia del Paquete es: "+numeroPaquete+" El dni del Remitente es: "+dni+
				" El peso del Paquete es: "+peso+" La prioridad del Paquete es: "+prioridad;
	}
	
	
	
}
