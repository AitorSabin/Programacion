package arrays;

import java.util.Scanner;

public class Prueba {
public static Scanner sc= new Scanner(System.in);
		
	public static void main(String[] args) {
		int[] array = new int[10];
		int n_posicion;
		int n_nuevo;
			
		System.out.println("Llenar el array");
		for(int i=0; i<array.length; i++) {
			System.out.println("Escribe un numero: ");
			array[i] = sc.nextInt();
		}
			
		System.out.println("Introduce la posicion que quieres cambiar: ");
		n_posicion= sc.nextInt();
		System.out.println("Introduce valor que quieras introducir: ");
		n_nuevo = sc.nextInt();
			
		for(int i =0; i<=array.length-1; i++) {
			if(array[i] == array[n_posicion]) {
				array[i]= n_nuevo;
			}
 		}
	}

}
