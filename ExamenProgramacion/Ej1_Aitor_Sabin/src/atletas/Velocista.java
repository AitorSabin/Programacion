package atletas;

public class Velocista extends Atleta{
	
	private double mejorTiempoPersonal;
	private double tiempoPrueba;
	
	public Velocista() {
		
	}

	public Velocista(String nombre, String apellidos, String pais, int anhoNacimiento, double mejorTiempoPersonal) {
		super(nombre, apellidos, pais, anhoNacimiento);
		this.mejorTiempoPersonal = mejorTiempoPersonal;
		this.tiempoPrueba=0;
	}

	@Override
	public String mostrarDatosDeportivos() {
		return "El mejor Tiempo Personal es: "+mejorTiempoPersonal+"\n"+
				"El Tiempo de la Prueba fue: "+tiempoPrueba;
	}
	
	public void actualizarMejorTiempo() {
		if(this.mejorTiempoPersonal>this.tiempoPrueba) {
			this.mejorTiempoPersonal=this.tiempoPrueba;
		}
	}

	public double getMejorTiempoPersonal() {
		return mejorTiempoPersonal;
	}

	public void setMejorTiempoPersonal(double mejorTiempoPersonal) {
		this.mejorTiempoPersonal = mejorTiempoPersonal;
	}

	public double getTiempoPrueba() {
		return tiempoPrueba;
	}

	public void setTiempoPrueba(double tiempoPrueba) {
		this.tiempoPrueba = tiempoPrueba;
	}
	
	
	
}
