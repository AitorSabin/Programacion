package ejercicio8;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dni;
		String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println("Introduce el dni menos la letra: ");
		dni = sc.nextInt();

		int posicion = dni % 23;

		System.out.println("El dni es : " + dni + tabla.charAt(posicion));

		sc.close();
	}

}
