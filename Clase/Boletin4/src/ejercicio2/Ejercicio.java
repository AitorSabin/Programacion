package ejercicio2;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int aux = 0;

		System.out.println("Introduce el valor del numero 1: ");
		x = sc.nextInt();
		System.out.println("Introduce el valor del numero 2: ");
		y = sc.nextInt();

		System.out.println(x + " " + y);
		aux = x;
		x = y;
		y = aux;

		System.out.println(x + " " + y);

		sc.close();
	}

}
