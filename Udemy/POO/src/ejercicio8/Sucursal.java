package ejercicio8;

public class Sucursal {
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	Paquete paquetes;
	
	public Sucursal(int numeroSucursal, String direccion, String ciudad) {
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
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
	
	public String mostrarDatosSucursal() {
		return "\nNumero de Sucursal: "+numeroSucursal+
				" \nDireccion de la Sucursal: "+direccion+
				" \nCiudad de la Sucursal: "+ciudad;
	}
	
	public double calcularPrecio(Paquete paquetes) {
		double precio = paquetes.getPeso();
		
		if(paquetes.getPrioridad()==1) {
			precio += 10;
		}
		if(paquetes.getPrioridad()==2) {
			precio += 20;
		}
		return precio;
	}
	
	
}
