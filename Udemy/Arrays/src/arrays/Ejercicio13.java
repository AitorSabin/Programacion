package arrays;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] numeros= new int[10];
//		int[] numerosPares= new int[10];
//		int[] numerosImpares= new int[10];
		int contadorPares=0;
		int contadorImpares=0;
		
		System.out.println("LLenar el array");
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Introduce un numero: ");
			numeros[i]= sc.nextInt();
			
			if(numeros[i] %2==0) {
				contadorPares++;
			}else {
				contadorImpares++;
			}
		}
		int[] numerosPares= new int[contadorPares];
		int[] numerosImpares= new int[contadorImpares];
		
		contadorPares=0;
		contadorImpares=0;
		
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] % 2 ==0) {
				numerosPares[contadorPares]= numeros[i];
				contadorPares++;
			}else {
				numerosImpares[contadorImpares] = numeros[i];
				contadorImpares++;
			}
		}
		
//		for(int i=0; i<numeros.length; i++) {
//			if(numeros[i] % 2 ==0) {
//				numerosPares[contadorPares]= numeros[i];
//				contadorPares++;
//			}else {
//				numerosImpares[contadorImpares] = numeros[i];
//				contadorImpares++;
//			}
//		}
		System.out.println("Array normal");
		for(int i =0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("Array de Numeros Pares");
		for(int i =0; i<numerosPares.length; i++) {
//			if(numerosPares[i] != 0) {
				System.out.println(numerosPares[i]);
//			}
		}
		System.out.println("Array de Numeros Impares");
		for(int i =0; i<numerosImpares.length; i++) {
//			if(numerosImpares[i] !=0) {
				System.out.println(numerosImpares[i]);
//			}
		}
	sc.close();	
	}

}
