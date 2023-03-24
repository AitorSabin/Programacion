package bucles;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num =sc.nextInt();
		int tabla =0;
		for(int i =0; i<=10; i++) {
			tabla=num*i;
			System.out.println(tabla);
		}
		sc.close();

	}

}
