package ejercicio3;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero[]= new int[10];
		boolean negativo= false;
		
		for(int i=0; i<numero.length; i++) {
			System.out.println("Introduce los numeros requeridos: "+(i+1)+".");;
			numero[i]= sc.nextInt();
			if(numero[i]<0) {
				negativo = true;
			}
		}
		if(negativo == true) {
			System.out.println("Hay al menos un numero negativo");
		}else {
			System.out.println("No hay ningun numero negativo");
		}
		sc.close();
	}

}
