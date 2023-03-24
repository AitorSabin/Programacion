package arrays;

import java.util.Scanner;

public class Ejercicio9 {

	public static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		int[] array= new int[10];
		int ultimo;
		
		System.out.println("Llena el array");
		for(int i=0; i<array.length;i++) {
			System.out.println("Introduce un numero: ");
			array[i]= sc.nextInt();
		}
		ultimo= array[9];
		
		for(int i=array.length-2;i>=0;i--) {
			System.out.println(array[i]);
			array[i+1]= array[i];
			System.out.println(array[i]);
		}
		
		array[0]= ultimo;
		
		System.out.println("El array desplazado es: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
