package ejercicio2;

import java.util.Scanner;

public class Matricula {

	private static Scanner sc = new Scanner(System.in);

	public void solicitarMatricula() {
		String matricula;
		
		do {
			System.out.println("Introduce la matricula: ");
			matricula = sc.nextLine();
			
			if (matricula.length() < 7 || matricula.length() > 7) {
				System.out.println("Introduce la matricula correcta");
			} else if (matricula.equalsIgnoreCase("0000AAA")) {
				break;
			} else {
				System.out.println("Los carateres numericos son: " + matricula.substring(0, 4));
				System.out.println("Los caracteres de texto son: " + matricula.substring(4, 7));
			}
		} while (true);
	}

	public static void main(String[] args) {
		Matricula matricula = new Matricula();
		matricula.solicitarMatricula();

	}
}
