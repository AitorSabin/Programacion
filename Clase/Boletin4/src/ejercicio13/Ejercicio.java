package ejercicio13;

import java.util.Scanner;

public class Ejercicio {

	private static Scanner sc = new Scanner(System.in);

	public static int[] contarCaracter(String frase, char[] letras) {
		int[] contadorCaracteres = new int[letras.length];
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < letras.length; j++) {
				if (frase.charAt(i) == letras[j]) {
					contadorCaracteres[j]++;
				}
			}
		}
		return contadorCaracteres;
	}

	public static void main(String[] args) {
		String frase;
		char[] letras = { 'a', 'á', 'A', 'Á', 'e', 'é', 'E', 'É', 'i', 'í', 'I', 'Í', 'o', 'ó', 'O', 'Ó', 'u', 'ú', 'U',
				'Ú' };
		int[] contadorCaracteres;

		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		contadorCaracteres = contarCaracter(frase, letras);

		for (int i = 0; i <= letras.length - 1; i++) {
			if (contadorCaracteres[i] != 0) {
				System.out.println("La vocal " + letras[i] + " se repite " + contadorCaracteres[i]);
			}
		}
	}
}
