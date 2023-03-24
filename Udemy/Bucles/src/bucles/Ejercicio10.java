package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int resultado=0;
		for(int i=1; i<=10; i++) {
			int num= sc.nextInt();
			resultado+=num;
		}
		System.out.println(resultado);
		sc.close();
	}

}
