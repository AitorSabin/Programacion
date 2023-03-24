package ejercicio5;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		int resultado=0;
		
		System.out.println("Introduce un numero para comprobar si es un numero Armstrong: ");
		num = sc.nextInt();
		
		int numComprobar=num;
		while(numComprobar >0) {
			resultado += Math.pow(numComprobar % 10, 3);
			numComprobar = numComprobar/10;
		}
		if(num == resultado) {
			System.out.println("El numero introducido ese un numero Armstrong");
		}else {
			System.out.println("El numero introducido NO es un numero Armstrong");
		}
		sc.close();
	}

}
