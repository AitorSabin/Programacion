package ejercicio5;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduce el valor del numero 1: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el valor del numero 2: ");
		num2 = sc.nextInt();
		System.out.println("Introduce el valor del numero 3: ");
		num3 = sc.nextInt();
		
		System.out.println("Números introducidos: "+num1+" "+num2+" "+num3);
		
		if(num3+num2 == num1) {
			System.out.println("Se cumple que (numero 1):"+num1+" = (numero2):"+num2+" + (numero 3):"+num3);
		}else if(num1+num3 == num2) {
			System.out.println("Se cumple que (numero2):"+num2+" = (numero 1):"+num1+" + (numero 3):"+num3);
		}else if(num1+num2 == num3) {
			System.out.println("Se cumple que (numero 3):"+num3+" = (numero 1):"+num1+" + (numero2):"+num2);
		}else {
			System.out.println("Los números no cumplen la condición");
		}

		sc.close();
	}

}
