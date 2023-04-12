package ejercicio6;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Introduce el numero 1: ");
		num1= sc.nextInt();
		System.out.println("Introduce el numero 2: ");
		num2= sc.nextInt();
		
		if((num1 %2 ==0 && num2 %2 ==0) && num1<=50 && (num2>=100 && num2 <= 500)) {
			System.out.println("La suma de los dos numeros es: "+(num1+num2));
		}else {
			System.out.println("ERROR. Al menos uno de los dos numeros no cumple los requisitos requeridos para realizar la suma");
		}
		sc.close();
	}
}
