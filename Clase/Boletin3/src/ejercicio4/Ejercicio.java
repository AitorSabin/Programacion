package ejercicio4;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String frase;
		
		do {
			System.out.println("Introduce una frase;");
			frase = sc.nextLine();
			if(frase.contains("El final")) {
				break;
			}else {				
				System.out.println(frase.replace(" ", ""));
			}
		}while(true);
		
		sc.close();
	}
}
