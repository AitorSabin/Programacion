package bucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		System.out.println("El factorial de "+num+" es: "+factorial);
		sc.close();
	}

}
