package ejercicio3Repaso;

public class Vehiculo {

	//Atributos
	private String marca;
	private String modelo;
	private int precio;

	//Constructor
	public Vehiculo(String marca , String modelo, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	//Metodos
	public int getPrecio() {
		return precio;
	}

	public String mostrarDatos() {
		return "Marca: "+ marca +"\nModelo: "+ modelo +"\nPrecio: "+ precio;
	}
	
	
}
