package ejercicio1;

import java.util.Scanner;

public class Ejercicio {

	public static int areaRectangulo(int largo, int ancho) {
		int area = largo * ancho;
		return area;
	}
	
	public static int perimetroRectangulo(int largo, int ancho) {
		int perimetro = ((largo*2)+(ancho*2));
		return perimetro;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el largo de un rectangulo: ");
		int largo = sc.nextInt();
		System.out.println("Introduce el ancho de un rectangulo: ");
		int ancho= sc.nextInt();
		
		System.out.println("El area del rectangulo es: "+areaRectangulo(largo, ancho));
		System.out.println("El perimetro del rectangulo es: "+perimetroRectangulo(largo, ancho));
		
		sc.close();
	}

}
