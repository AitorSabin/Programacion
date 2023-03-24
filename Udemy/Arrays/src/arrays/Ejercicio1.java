package arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num[]= new int[5];
		System.out.println("Guardar los datos del array");
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+". Introduce un numero: ");
			num[i]=sc.nextInt();
		}
		System.out.println("Leer los elementos del array");
		for(int i:num) {
			System.out.println(i);
		}
		sc.close();
	}

}
