package bucles;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double notas;
		boolean aprobado=true;
		for(int i=0; i<5; i++) {
			do {
				System.out.println("Introduce una nota");
				notas=sc.nextDouble();
			}while(notas<0 || notas>10);
			
			if(notas<5) {
				aprobado=false;
			}
		}
		if(aprobado==false) {	
			System.out.println("Hay al menos un suspenso");
		}else {
			System.out.println("No hay ningun suspenso");
		}
		
		sc.close();
	}

}
