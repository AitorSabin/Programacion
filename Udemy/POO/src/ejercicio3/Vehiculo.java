package ejercicio3;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private double precio;
	
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public String mostrarDatos() {
		return "La Marca: "+marca+"\nEl Modelo: "+modelo+"\nEl Precio: "+precio+"\n";
	}
	
	
	
}
