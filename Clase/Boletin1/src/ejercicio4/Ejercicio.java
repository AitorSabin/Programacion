package ejercicio4;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero1;
		int numero2;
		int tamanoArray;
		int divisible=0;
		int contador=0;
		
		do {
			System.out.println("Introduce el numero 1: ");
			numero1=sc.nextInt();
			System.out.println("Introduce el numero 2: ");
			numero2=sc.nextInt();
		}while(numero1>numero2);
		
		tamanoArray= numero2-numero1;
		int[]array= new int[tamanoArray];
		
		for(int j= numero1; j<=numero2-1; j++) {
			divisible=0;
			for(int i=1; i<=j; i++) {
				if(j%i==0) {
					divisible++;
				}
			}
			if(divisible<=2) {
				array[contador++]= j;
			}
		}
		System.out.println("Los numeros primos entre el "+numero1+ " y el "+numero2+" son los siguientes:");
		for(int i=0; i<array.length; i++) {
			if(array[i]!=0)
				System.out.println(array[i]);
		}
		sc.close();
	}

}
