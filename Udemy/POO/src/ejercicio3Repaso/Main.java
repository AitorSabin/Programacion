package ejercicio3Repaso;

import java.util.Scanner;

public class Main {
	
	public static int precioMasBarato(Vehiculo coches[]) {
		int indice=0;
		int precio = coches[0].getPrecio();
		for(int i = 1; i<coches.length; i++) {
			if(coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String marca;
		String modelo;
		int precio;
		int numCoches;
		int indicePrecioMasBarato;
	
		System.out.println("Indica el numero de coches que quieres comparar: ");
		numCoches = sc.nextInt();
	
		Vehiculo coches[] = new Vehiculo[numCoches];

		for(int i = 0; i<coches.length; i++) {
			System.out.println("Introduce la marca del Coche: ");
			marca = sc.next();
			System.out.println("Introduce el modelo del Coche: ");
			modelo = sc.next();
			System.out.println("Introduce el precio del Coche: ");
			precio = sc.nextInt();
			
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		indicePrecioMasBarato = precioMasBarato(coches);
		
		System.out.println("El coche mas barato es: ");
		System.out.println(coches[indicePrecioMasBarato].mostrarDatos());
		
		sc.close();	
	}
}
