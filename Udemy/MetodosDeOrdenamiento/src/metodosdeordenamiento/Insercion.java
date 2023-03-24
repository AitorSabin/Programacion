package metodosdeordenamiento;

import java.util.Scanner;

public class Insercion {
	
	public static Scanner sc= new Scanner (System.in);
	
	public static void main(String[] args) {
		int array[];
		int nElementos;
		int posicion;
		int aux;
		
		System.out.println("Introduce el numero de elementos del array: ");
		nElementos = sc.nextInt();
		
		array= new int[nElementos];
		
		System.out.println("Llena el array");
		for(int i =0; i<nElementos;i++) {
			System.out.println("Introduce un numero del array: ");
			array[i]= sc.nextInt();
		}
		
		//Ordenamiento por Insercion
		for(int i=0; i<nElementos; i++) {
			posicion = i;
			aux = array[i];
			while(posicion >0 && array[posicion-1] > aux) {
				array[posicion] = array[posicion-1];
				posicion--;
			}
			array[posicion] = aux;
		}
		System.out.println("Orden Ascendente");
		for(int i = 0; i<nElementos; i++) {
			System.out.println(array[i]);
		}

	}

}
