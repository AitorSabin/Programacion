package arrays;

import java.util.Scanner;

public class Ejercicio15 {
	
	public static Scanner sc= new Scanner (System.in);
	
	public static void main(String[] args) {
	int[] array= new int[10];
	int numeroBuscar;
	boolean creciente= true;
	boolean encontrado= true;
		
	do {
		System.out.println("Llenar el array");
		for(int i = 0; i<array.length; i++) {
			System.out.println("Introduce el numero en el array: ");
			array[i]= sc.nextInt();
		}	
		for(int i= 0; i<array.length-1; i++) {
			if(array[i]<array[i+1]) {
				creciente=true;
			}else {
				creciente=false;
				break;
			}
		}
		if(creciente==false) {
			System.out.println("El array esta desordeano vuelve a introducirlo");
		}
	}while(creciente==false);	

	System.out.println("Introduce un numero que deseas buscar: ");
	numeroBuscar=sc.nextInt();
	
	for(int i=0; i<array.length; i++) {
		if(array[i] == numeroBuscar) {
			System.out.println("La posicion del array es : "+i);
			encontrado=true;
			break;
		}else {
			encontrado = false;
		}
	}
	if(encontrado==false) {
		System.out.println("El numero introducido no se encontro en el array");
	}
	}

}
