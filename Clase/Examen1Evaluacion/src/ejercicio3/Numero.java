package ejercicio3;

import java.util.Scanner;

public class Numero {
	
	private static Scanner sc = new Scanner(System.in);

	public void numeroPerfecto() {
		int numero;
		int sumaDivisores=0;
		
		do {
			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
		}while(numero < 0 && numero > 1000);
		
		for(int i=1; i<numero; i++) {
			if(numero % i == 0) {
				sumaDivisores += i;
			}
		}
		if(sumaDivisores == numero) {
			System.out.println("El "+numero+" es un numero perfecto");
		}else {
			System.out.println("El "+numero+" NO es un numero perfecto");
		}
	}
	public static void main(String[] args) {
		Numero numero = new Numero();
		numero.numeroPerfecto();

	}

}
