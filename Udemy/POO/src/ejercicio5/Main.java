package ejercicio5;

import java.util.Scanner;

public class Main {
	
	public static double mayorArea(Triangulo_Isosceles triangulos[]) {
		double area = triangulos[0].area();
		for(int i=0; i<triangulos.length;i++) {
			if(triangulos[i].area()> area) {
				area= triangulos[i].area();
			}
		}
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado;
		double base;
		int numeroTriangulos;
		
		System.out.println("\nIntroduce el numero de triangulos: ");
		numeroTriangulos = sc.nextInt();
		
		Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[numeroTriangulos];
		
		for(int i=0; i<triangulos.length; i++) {
			System.out.println("Introduce los valores para el triangulo "+(i+1)+":");
			System.out.println("Introduce la base: ");
			base =sc.nextDouble();
			System.out.println("Introduce el lado: ");
			lado = sc.nextDouble();
			
			triangulos[i] = new Triangulo_Isosceles(lado, base);
			
			System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].perimetro());
			System.out.println("\nEl area del triangulo es: "+triangulos[i].area());
		}
		
		System.out.println("\nEl area del triangulo de mayor superficies es: "+mayorArea(triangulos));

		sc.close();
	}

}
