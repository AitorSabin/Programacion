package ejercicio1;

import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cantidad;
		int numero;
		int sumaPar =0;
		int sumaImpar =0;
		System.out.println("Introduce cuantos numeros quieres usar: ");
		cantidad= sc.nextInt();
		
		for(int i=0; i<cantidad; i++) {
			System.out.println("Introduce un numero: ");
			numero=sc.nextInt();
			
			if(numero%2 ==0) {
				sumaPar += numero;
			}else {
				sumaImpar += numero;
			}
		}
		System.out.println("La suma de los numeros Pares son: "+sumaPar);
		System.out.println("La suma de los numeros Impares son: "+sumaImpar);
		
		sc.close();
	}
}
