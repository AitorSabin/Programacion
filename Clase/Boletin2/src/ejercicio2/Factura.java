package ejercicio2;

public class Factura {
	private int codigo;
	private int cantidadVendidaLitros;
	private double precioLitro;
	
	public Factura(int codigo, int cantidadVendidaLitros, double precioLitro) {
		this.codigo = codigo;
		this.cantidadVendidaLitros = cantidadVendidaLitros;
		this.precioLitro = precioLitro;
	}

	public double getPrecioLitro() {
		return precioLitro;
	}
	
	public int getCantidadVendidaLitros() {
		return cantidadVendidaLitros;
	}

	public String mostrarDatos() {
		return "El codigo: "+(codigo+1)+" ha vendido "+cantidadVendidaLitros+" litros a: "+precioLitro+" � el litro";
	}
	
	public int masDeSeiscientos(Factura facturas[]) {
		double precio;
		int cantidad;
		int contador=0;
		for(int i=0; i<facturas.length-1; i++) {
			precio = facturas[i].getPrecioLitro();
			cantidad = facturas[i].getCantidadVendidaLitros();
			if((precio * cantidad) >= 600) {
				contador ++;
			}
		}
		return contador;
		
	}
}
