package bucles;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int edad;
		double altura;
		int sum_edad =0;
		double sum_altura =0;
		double media_edad =0;
		double media_altura =0;
		int contador_edad =0;
		int contador_altura =0;
		
		for(int i=0 ; i<=5 ; i++) {
			
			System.out.println("Indica cual es la edad: ");
			edad = sc.nextInt();
			System.out.println("Indica cual es la altura: ");
			altura = sc.nextDouble();
			
			sum_edad+=edad;
			sum_altura+=altura;
			
			
			if(edad>=18) {
				contador_edad++;
			} 
			if(altura>=1.75) {
				contador_altura++;
			}
		}
		
		media_edad= sum_edad/5;
		media_altura= sum_altura/5;
		
		System.out.println("La media de las edades es: "+media_edad);
		System.out.println("La media de las alturas es: "+media_altura);
		System.out.println("Los alumnos mayores de edad son: "+contador_edad);
		System.out.println("Los alumnos que miden mas de 1,75 son: "+contador_altura);
		
		sc.close();
	}

}
