package ejercicio3;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String frase;
		int contadorVocales=0;
		
		System.out.println("Introduce una frase: ");
		frase= sc.nextLine().toLowerCase();
		
		for(int i=0; i<frase.length();i++) {
			if(frase.charAt(i)== 'a' || frase.charAt(i)== 'e' || frase.charAt(i)== 'i' || frase.charAt(i)== 'o' ||
				frase.charAt(i)== 'u') {
				
				contadorVocales++;
			}
		}
		System.out.println("El numero de vocales introducidas es: "+contadorVocales);
		
		sc.close();
	}

}
