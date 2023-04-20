package ejercicio10;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numero;
		int cantidadNumero;
		int numeroMayor = 0;
		int numeroMenor = 0;
		
		System.out.println("Introduzca cuántos números tienen que leerse por teclado: ");
		cantidadNumero = sc.nextInt();
		
		numero = new int[cantidadNumero];
		for (int i = 0; i < numero.length; i++) {
			do {
				System.out.println("Introduce un numero: [" + i + "]");
				numero[i] = sc.nextInt();
				if (numero[i] < 0) {
					System.out.println("ERROR, el numero introducido no puede ser negativo.");
				}
			} while (numero[i] < 0);
		}

		for (int i = 0; i < numero.length; i++) {
			if (numeroMayor < numero[i]) {
				numeroMayor = numero[i];
			}
			if (numeroMenor > numero[i]) {
				numeroMenor = numero[i];
			}
		}

		System.out.println("El numero Mayor es: " + numeroMayor);
		System.out.println("El numero Menor es: " + numeroMenor);

		sc.close();
	}
}
