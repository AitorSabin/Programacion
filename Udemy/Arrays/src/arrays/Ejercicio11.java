package arrays;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int[] numeros= new int[10];
		boolean creciente = true;
		int num;
		int sitio = 0;
		int j=0;
		
		System.out.println("Llenar el array: ");
		do {
			
			for(int i=0; i<5; i++) {
				System.out.println("Escribe un numero: ");
				numeros[i]= sc.nextInt();
			}
			
			//Comprobar si el array esta ordenado de forma creciente
			for(int i=0; i<4; i++) {
				if(numeros[i] < numeros[i+1]) {
					creciente= true;
				}
				if(numeros[i] > numeros[i+1]) {
					creciente= false;
					break;
				}
			}
			
			if(creciente == false) {
				System.out.println("El array no esta ordenado vuelve a introducirlo");
			}
		}while(creciente == false);	
		
		System.out.println("Introduce un numero que quieres colocar");
		num = sc.nextInt();
		
		//En que posicion va el numero
		while(numeros[j]< num && j<5) {
			sitio++;
			j++;
		}
		
		for(int i=4; i>=sitio;i--) {
			numeros[i+1]= numeros[i];
		}
		
		//El numero que el usuario puso
		numeros[sitio] = num;
		
			System.out.println("El array queda: ");
			for(int i=0; i<6; i++) {
				System.out.println(numeros[i]);
			}
		
		sc.close();	
	}

}
