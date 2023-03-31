package ejercicio5;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		
		System.out.println(frase.substring(3, 5));
		
		String[] palabras=frase.split(" ");
		
		for(String palabra:palabras) {
			System.out.println(palabra);
		}
		sc.close();
		
	}

}
