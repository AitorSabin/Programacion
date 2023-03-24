package metodosdeordenamiento;

import java.util.Scanner;

public class Burbuja {

	public static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		int[] array;
		int nElementos;
		int aux;
		
		System.out.println("Introduce la cantidad de elementos del array: ");
		nElementos= sc.nextInt();
		
		array = new int[nElementos];
		
		for(int i=0; i<nElementos; i++) {
			System.out.println("Introduce un numero del array: ");
			array[i]=sc.nextInt();
		}
		
		//Metodo Burbuja
		for(int i=0; i<nElementos-1; i++) {
			for(int j=0; j<nElementos-1; j++) {
				if(array[j] > array[j+1]) {
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
							
				}
			}
		}
		System.out.println("Array ordenado de forma creciente");
		for(int i=0; i<nElementos; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Array ordenado de forma decreciente");
		for(int i=nElementos-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
