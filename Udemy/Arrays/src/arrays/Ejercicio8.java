package arrays;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] array = new int[10];
		int numero;
		int posicion;
		
		System.out.println("Llenar el array");
		for(int i =0; i<8; i++) {
			System.out.println("Introduce un numero");
			array[i]= sc.nextInt();
		}
		
		System.out.println("Introduce un numero: ");
		numero=sc.nextInt();
		System.out.println("Introduce una posicion: ");
		posicion=sc.nextInt();
		
		for(int i=7; i>=posicion; i--) {
			array[i+1]= array[i];
		}
		
		array[posicion] = numero;
		
		System.out.println("El nuevo array es: ");
		
		for(int i=0; i<9; i++) {
			System.out.println("Posicion "+i+": "+array[i] );
		}
	}

}
