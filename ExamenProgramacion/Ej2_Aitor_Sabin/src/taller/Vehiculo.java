package taller;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String matricula;
	private String marca;
	private String modelo;
	private int cilindrada;
	private int anhoFabricacion;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String matricula, String marca, String modelo, int cilindrada, int anhoFabricacion) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.anhoFabricacion = anhoFabricacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getAnhoFabricacion() {
		return anhoFabricacion;
	}

	public void setAnhoFabricacion(int anhoFabricacion) {
		this.anhoFabricacion = anhoFabricacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
				+ cilindrada + ", anhoFabricacion=" + anhoFabricacion + "]";
	}
	
}
