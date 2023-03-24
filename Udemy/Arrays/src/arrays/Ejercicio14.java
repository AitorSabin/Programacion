package arrays;

import java.util.Scanner;

public class Ejercicio14 {
	public static Scanner sc= new Scanner (System.in);

	public static void main(String[] args) {
		int[] numeros1= new int[10];
		int[] numeros2= new int[10];
		int[] numeros3= new int[20];
		boolean creciente= true;
		
		System.out.println("Llenar array numero 1");
		do {
			for(int i=0; i<numeros1.length; i++) {
				System.out.println("Escribe un numero del array 1: ");
				numeros1[i]=sc.nextInt();
			}
			for(int i=0; i<numeros1.length-1; i++) {
				if(numeros1[i] < numeros1[i+1]) {
					creciente=true;
				}
				if(numeros1[i] > numeros1[i+1]) {
					creciente= false;
					break;
				}
			}
			
			if(creciente == false) {
				System.out.println("El array esta desordenado, vuelve a introducirlo: ");
			}
		}while(creciente == false);
		
		System.out.println("Llenar array numero 2");
		do {
			for(int i=0; i<numeros2.length; i++) {
				System.out.println("Escribe un numero del array 2: ");
				numeros2[i]=sc.nextInt();
			}
			for(int i=0; i<numeros2.length-1; i++) {
				if(numeros2[i] < numeros2[i+1]) {
					creciente=true;
				}
				if(numeros2[i] > numeros2[i+1]) {
					creciente= false;
					break;
				}
			}
			
			if(creciente == false) {
				System.out.println("El array esta desordenado");
			}
		}while(creciente == false);
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<numeros1.length && j<numeros2.length) {
			if(numeros1[i] < numeros2[j]) {
				numeros3[k] = numeros1[i];
				i++;
			}else {
				numeros3[k] = numeros2[j];
				j++;
			}
			k++;
		}
		
		if(i==10) {
			while(j<numeros2.length) {
				numeros3[k] = numeros2[j];
				j++;
				k++;
			}
		}else {
			while(i<10)	{
				numeros3[k] = numeros1[i];
				i++;
				k++;
			}
		}
		
		System.out.println("El array fusionado es: ");
		for(k=0;k<numeros3.length;k++) {
			System.out.println(numeros3[k]);
		}
		sc.close();
	}
}
