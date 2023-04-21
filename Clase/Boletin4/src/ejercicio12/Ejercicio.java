package ejercicio12;

import java.util.Scanner;

public class Ejercicio {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int nPositivo;
		int suma = 0;
		int contador = 1;

		do {
			System.out.println("Introduce un numero positivo: ");
			nPositivo = sc.nextInt();
			if (nPositivo < 0) {
				System.out.println("ERROR, el numero introducido no es positivo.");
			}
		} while (nPositivo < 0);

		do {
			suma += Math.pow(contador, 2);
			contador++;
			System.out.println(suma);
		} while (suma < nPositivo);

	}

}
