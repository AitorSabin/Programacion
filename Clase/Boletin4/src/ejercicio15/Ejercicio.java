package ejercicio15;

import java.util.Scanner;

public class Ejercicio {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int dni;
		int posicion;
		String numCadena;
		char ultCaracter;
		String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		do {
			System.out.println("Introduce el dni menos la letra: ");
			dni = sc.nextInt();
			numCadena = dni+"";
		}while(numCadena.length()!=8);
			
		posicion = dni % 23;
		
		numCadena = dni+""+tabla.charAt(posicion);
		ultCaracter = numCadena.charAt(numCadena.length()-1);
		
		if(ultCaracter >= 'A' || ultCaracter <='Z') {
			System.out.println(numCadena);
			
		}
	}

}
