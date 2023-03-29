package ejercicio2;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int contador = 0;
		
		do {
			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
			contador++;
		}while(numero != -1);

		System.out.println("La cantidad de numeros introducidos son: "+(contador-1) );
		
		sc.close();
	}
}
