package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int resultado= 0;
		System.out.println("Inserta un numero: ");
		int num= sc.nextInt();
		
		while(num !=0) {
			System.out.println("Inserta un numero: ");
			num =sc.nextInt();
			if(num!=0) {
				resultado= num+num;
			}
		}
		System.out.println("El resultado de la suma de todos los numero introducidos es: "+resultado);
		
		sc.close();

	}

}
