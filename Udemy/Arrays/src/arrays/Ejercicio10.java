package arrays;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] array = new int[10];
		int n_posicion;
		int ultimo;
		
		System.out.println("Llenar el array");
		for(int i=0; i<array.length; i++) {
			System.out.println("Escribe un numero: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Introduce la posicion que quieres cambiar: ");
		n_posicion= sc.nextInt();
		

		for(int i =1; i<=n_posicion; i++) {
			ultimo = array[9]; //Guardamos el ultimo numero del array
			for(int j=8; j>=0; j--) { //Desplazamos una posicion en el array
				array[j+1]=array[j];
			}
			array[0] = ultimo; //Ponemos el ultimo numero como primero
		}
		for(int k=0; k<array.length; k++) {
			System.out.println(array[k]);
		}
	}
}
