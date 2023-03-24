package bucles;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escribi numero de sueldos: ");
		int num_sueldos =sc.nextInt();
		double sueldo;
		double sueldo_max=0;
		
		for(int i=1;i<=num_sueldos; i++) {
			System.out.println("Introduce le sueldo: ");
			sueldo=sc.nextDouble();
			
			if(sueldo > sueldo_max) {
				sueldo_max=sueldo;
			}
		}
		System.out.println("El sueldo maximo es: "+sueldo_max);
	
		sc.close();
	}

}
