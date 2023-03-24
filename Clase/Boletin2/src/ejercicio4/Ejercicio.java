package ejercicio4;

import java.util.Scanner;

public class Ejercicio {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numeros[] = new int[10];
		int cero = 0;
		int uno = 0;
		int dos = 0;
		int tres = 0;
		int cuatro = 0;
		int cinco = 0;
		int seis = 0;
		int siete = 0;
		int ocho = 0;
		int nueve = 0;
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Introduce el numero "+(i+1)+".");
			numeros[i]= sc.nextInt();
			switch(numeros[i]) {
				case 0: cero ++;
					break;
				case 1: uno ++;
					break;
				case 2: dos ++;
					break;
				case 3: tres ++;
					break;
				case 4: cuatro ++;
					break;
				case 5: cinco ++;
					break;
				case 6: seis ++;
					break;
				case 7: siete ++;
					break;
				case 8: ocho ++;
					break;
				case 9: nueve ++;
					break;
			}
		}
		System.out.println("Hay "+cero+" ceros");
		System.out.println("Hay "+uno+" unos");
		System.out.println("Hay "+dos+" doses");
		System.out.println("Hay "+tres+" treses");
		System.out.println("Hay "+cuatro+" cuatros");
		System.out.println("Hay "+cinco+" cincos");
		System.out.println("Hay "+seis+" seises");
		System.out.println("Hay "+siete+" sietes");
		System.out.println("Hay "+ocho+" ochos");
		System.out.println("Hay "+nueve+" nueves");
		
		sc.close();
		
	}
}
