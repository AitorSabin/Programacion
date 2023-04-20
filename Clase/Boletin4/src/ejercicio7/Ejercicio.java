package ejercicio7;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int precioProducto;
		System.out.println("Introduce el valor del producto: ");
		precioProducto = sc.nextInt();

		if (precioProducto <= 200) {
			System.out.println("El precio final es: " + precioProducto);
		} else if (precioProducto > 200 && precioProducto <= 1000) {
			System.out.println("El precio final es: " + (precioProducto - (precioProducto * 0.05)));
		} else {
			System.out.println("El precio final es: " + (precioProducto - (precioProducto * 0.1)));
		}
		sc.close();
	}

}
