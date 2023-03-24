package ejercicio3;

import java.util.Scanner;

public class Main {
	
	public static int indiceCocheMasBarato(Vehiculo coches[]) {
		double precio;
		int indice=0;
		precio = coches[0].getPrecio();
		for(int i=1; i<coches.length; i++) {
			if(coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice=i;
			}
		}
		return indice;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String marca;
		String modelo;
		double precio;
		int cantidadVehiculos;
		int indiceCocheMasBarato;
		
		System.out.println("Introduce la cantidad de vehiculos que quieres comparar: ");
		cantidadVehiculos= sc.nextInt();
		
		Vehiculo coches[] = new Vehiculo[cantidadVehiculos]; 
		
		for(int i=0; i<coches.length; i++) {
			sc.nextLine();
			System.out.println("\nIntroduce las caracteristicas del Coche "+(i+1)+":");
			System.out.println("Introduce la Marca: ");
			marca = sc.nextLine();
			System.out.println("Introduce el Modelo: ");
			modelo = sc.nextLine();
			System.out.println("Introduce el Precio: ");
			precio = sc.nextDouble();
			
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		
		indiceCocheMasBarato = indiceCocheMasBarato(coches);
		
		System.out.println("El coche mas barato es: ");
		System.out.println(coches[indiceCocheMasBarato].mostrarDatos());
		
		sc.close();
	}

}
