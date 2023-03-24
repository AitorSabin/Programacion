package ejercicio3;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero;
		do {
			System.out.println("Introduce un numero: ");
			numero= sc.nextInt();
		}while(numero<10 || numero>255);

		String binario= Integer.toBinaryString(numero);
		System.out.println(binario);
		
		sc.close();
	}

}
