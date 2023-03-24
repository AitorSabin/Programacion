package ejercicio6;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String palabra;
		String palindromo="";
		
		System.out.println("Introduce la palabra que quieres comprobar si es un palindromo: ");
		palabra = sc.nextLine();
		
		for(int i= palabra.length()-1; i>=0; i--) {
			palindromo += palabra.charAt(i);
		}
		
		if(palabra.equals(palindromo)) {
			System.out.println("La palabra es un palindromo");
		}else {
			System.out.println("La palabra NO es un palindromo");
		}
		sc.close();
	}

}
