package ejercicio4;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Introduce el numero 1: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el numero 2: ");
		num2 = sc.nextInt();
		
		System.out.println("Numeros introducidos: "+num1+", "+num2);
		
		if(num1 >=0 && num2 >=0) {
			System.out.println("La suma de los dos numeros es: "+(num1+num2));
		}else {
			if(num1<0 && num2 >=0) {
				System.out.println("No se calcula la suma porque el primer número es negativo");
			}else if(num2<0 && num1 >=0) {
				System.out.println("No se calcula la suma porque el segundo número es negativo");
			}else {
				System.out.println("No se calcula la suma porque los dos números son negativos.");
			}
		}

		sc.close();
	

	}

}
