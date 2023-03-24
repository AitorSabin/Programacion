package arrays;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int[] numeros = new int[10];
		int posicion;
		System.out.println("Llenar el array: ");
		for(int i =0; i<numeros.length; i++) {
			System.out.println("Introduce un numero del array");
			numeros[i] = sc.nextInt();
		}
		do {
			System.out.println("Introduce la posicion del (0-9)");
			posicion= sc.nextInt();
		}while(posicion<0 || posicion>9);
			
		for(int i= posicion; i<numeros.length-1; i++) {
			numeros[i]= numeros[i+1];	
		}
		
		System.out.println("El array queda asi: ");
		for(int i=0; i<numeros.length-1; i++) {
			System.out.println(numeros[i]);
		}
		sc.close();
	}

}
