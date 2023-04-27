package metodosdeordenamiento;

import java.util.Scanner;

public class Seleccion {

	public static Scanner sc= new Scanner (System.in);
	
	public static void main(String[] args) {
		int array[];
		int nElementos;
		
		System.out.println("Introduce el numero de elementos del array: ");
		nElementos = sc.nextInt();
		
		array= new int[nElementos];
		
		System.out.println("Llena el array");
		for(int i =0; i<nElementos;i++) {
			System.out.println("Introduce un numero del array: ");
			array[i]= sc.nextInt();
		}

	}

}
