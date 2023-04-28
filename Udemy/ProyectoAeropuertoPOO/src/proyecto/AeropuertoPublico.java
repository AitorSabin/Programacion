package proyecto;

public class AeropuertoPublico extends Aeropuerto{
	
	private double subvencion;

	public AeropuertoPublico(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}
	
	public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
		super(nombre, ciudad, pais);
		this.subvencion = subvencion;
	}
	
	public AeropuertoPublico(String nombre, String ciudad, String pais, Compaņia[] listaCompaņias, double subvencion) {
		super(nombre, ciudad, pais, listaCompaņias);
		this.subvencion = subvencion;
	}

	public double getSubvencion() {
		return subvencion;
	}
	
	

	
	
}
