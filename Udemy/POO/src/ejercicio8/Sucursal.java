package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	private List<Paquete> listaPaquetes;
	
	public Sucursal(int numeroSucursal, String direccion, String ciudad) {
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.listaPaquetes = new ArrayList<Paquete>();
	}

	public int getNumeroSucursal() {
		return numeroSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void addPaquete(Paquete paquete) {
		listaPaquetes.add(paquete);
	}
	
	public List<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}

	public String mostrarDatosSucursal() {
		return "\nNumero de Sucursal: "+numeroSucursal+
				" \nDireccion de la Sucursal: "+direccion+
				" \nCiudad de la Sucursal: "+ciudad;
	}
	
	public double calcularPrecio2(Paquete paquete) {		
		
		double precio = paquete.getPeso();
		
		if(paquete.getPrioridad()==1) {
			return precio += 10;
		} else if(paquete.getPrioridad()==2) {
			return precio += 20;
		} else {
			return precio;			
		}
	}
	
	
}
