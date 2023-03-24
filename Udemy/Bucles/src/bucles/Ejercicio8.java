package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introudce un numero: ");
		int num=sc.nextInt();
		int contador=1;
		
		while(contador <= num) {
			System.out.println(contador++);	
		}
		sc.close();
	}
}
