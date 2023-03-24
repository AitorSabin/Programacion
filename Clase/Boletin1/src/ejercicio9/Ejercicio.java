package ejercicio9;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1;
		int num2;
		
		do {
			System.out.println("Introduce el numero 1: ");
			num1 = sc.nextInt();
			System.out.println("Introduce el numero 2: ");
			num2 = sc.nextInt();
			if(num1 == num2) {
				System.out.println("El numero 1 y el numero 2 no pueden ser iguales");
			}
		}while(num1 ==  num2);
		
		if(num1 > num2) {
			System.out.println("Los numero ordenados de mayor a menor son: ");
			System.out.println(num1);
			System.out.println(num2);
			if(((num1 >=10 && num1 <=15) && (num2 >=10 && num2 <=15)) || (num1 >=20 && num1 <= 25) && (num2 >=20 && num2 <=25)) {
				System.out.println("Los numeros introducidos multplicados por 10 son: ");
				System.out.println(num1 *= 10);
				System.out.println(num2 *= 10);
			}
		} else {
			System.out.println("Los numero ordenados de mayor a menor son: ");
			System.out.println(num2);
			System.out.println(num1);
			if(((num1 >=10 && num1 <=15) && (num2 >=10 && num2 <=15)) || (num1 >=20 && num1 <= 25) && (num2 >=20 && num2 <=25)) {
				System.out.println("Los numeros introducidos multplicados por 10 son: ");
				System.out.println(num2 *= 10);
				System.out.println(num1 *= 10);
			}
		}

		sc.close();
	}
}
