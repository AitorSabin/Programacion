package ejercicio2;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero;
		int resultado=0;
		
		System.out.println("Introduce un numero para sumar sus digitos: ");
		numero= sc.nextInt();
		
		while(numero>0) {
			resultado += numero %10;
			numero = numero/10;
		}
		System.out.println("La suma de los digitos es: "+resultado);
 		
		sc.close();
	}

}
