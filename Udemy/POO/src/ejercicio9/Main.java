package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		do {
			do {
				System.out.println("Introduce lo opcion de poligono que deseas");
				System.out.println("1. Triangulo");
				System.out.println("2. Rectangulo");
				System.out.println("Opcion: ");
				opcion = sc.nextInt();
			}while(opcion < 1 || opcion > 2);
			
			switch(opcion) {
				case 1: llenarTriangulo();
					break;
				case 2:	llenarRectangulo();
					break;
			}
			System.out.println("\nQuieres introducir otro poligono(S/N): ");
			respuesta = sc.next().charAt(0);
			System.out.println("");
		}while(respuesta == 's' || respuesta == 'S');
	}
	
	public static void llenarTriangulo() {
		double lado1;
		double lado2;
		double lado3;
		
		System.out.println("Introduce el lado1 del triangulo: ");
		lado1 = sc.nextDouble();
		System.out.println("Introduce el lado2 del triangulo: ");
		lado2 = sc.nextDouble();
		System.out.println("Introduce el lado3 del triangulo: ");
		lado3 = sc.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		
		poligono.add(triangulo);
	}
	
	public static void llenarRectangulo() {
		double lado1;
		double lado2;
		
		System.out.println("Introduce el lado1 del rectangulo: ");
		lado1 = sc.nextDouble();
		System.out.println("Introduce el lado2 del rectangulo: ");
		lado2 = sc.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		
		poligono.add(rectangulo);
	}
	
	public static void mostrarResultados() {
		for (Poligono poli : poligono) {
			System.out.println(poli.toString());
			System.out.println("Area= "+poli.area());
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		//Llenar Poligono
		llenarPoligono();
		//Mostrar los datos y el area de cada poligono
		mostrarResultados();
	}

}
