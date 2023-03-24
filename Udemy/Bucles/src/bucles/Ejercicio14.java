package bucles;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double salario=0;
		double suma=0;
		int contador_max=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduce el salario: ");
			salario=sc.nextDouble();
			
			if(salario>=1000) {
				contador_max++;
			}
			
			suma+=salario;
		}
		
		System.out.println("La suma de los sueldos son: "+suma);
		System.out.println("Sueldos que superan los mil euros: "+contador_max);

		sc.close();
	}

}
