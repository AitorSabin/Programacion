package ejercicio2;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int codigo;
		int cantidadVendidaLitros;
		double precioLitro;
		double facturaIndividual=0;
		double totalFacturacion=0;
		int contadorSeiscientos = 0;
		  
	  Factura facturas[] = new Factura[5]; 
	  
	  for(int i = 0; i<facturas.length; i++) {
		  System.out.println("El codigo de la factura va a ser igual al orden en el que se crea");
		  codigo = i;
		  System.out.println("\nIntroduce la cantidad vendida en litros: ");
		  cantidadVendidaLitros = sc.nextInt();
		  System.out.println("\nIntroduce el precio en litros: ");
		  precioLitro = sc.nextDouble();
		  facturaIndividual= cantidadVendidaLitros*precioLitro;
		  totalFacturacion += facturaIndividual;
		  
		  facturas[i]= new Factura(codigo, cantidadVendidaLitros, precioLitro, facturaIndividual); 
	  }
	  contadorSeiscientos = facturas[0].masDeSeiscientos(facturas);
	  System.out.println("La facturacion total es: "+totalFacturacion);
	  System.out.println(facturas[2].mostrarDatos());
	  System.out.println("\nHay "+contadorSeiscientos+" facturas de mas de 600�");
	  
	  sc.close();
	}
}
