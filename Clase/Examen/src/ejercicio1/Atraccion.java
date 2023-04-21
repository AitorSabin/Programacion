package ejercicio1;

import java.util.Scanner;

public class Atraccion {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int persona;
		int contadorPersona=0;
		int contadorNino=0;
		int contadorAdulto=0;
		do {
			System.out.println("Introduce la edad de la persona que quiere subir: ");
			persona = sc.nextInt();
			if(persona<18 && persona > 0) {
				contadorNino++;
			}
			if(persona>19 && persona >0){
				contadorAdulto++;
			}
			contadorPersona++;
		}while(contadorPersona!=14 && persona!=0);

		if(contadorNino == contadorAdulto) {
			if(contadorNino!=0 && contadorAdulto !=0) {
				System.out.println("La cantidad de personas MENORES de edad son: "+contadorNino);
				System.out.println("La cantidad de personas MAYORES de edad son: "+contadorAdulto);
				System.out.println("Abrochense los cinturones.");
			}else {
				System.out.println("La atraccion esta vacia.");
			}
		}else {
			System.out.println("La cantidad de personas MENORES de edad son: "+contadorNino);
			System.out.println("La cantidad de personas MAYORES de edad son: "+contadorAdulto);
			System.out.println("Desalojen la atraccion, no podemos continuar.");
		}
	}

}
