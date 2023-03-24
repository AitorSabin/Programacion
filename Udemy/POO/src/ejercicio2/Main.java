package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Tablero tablero1;
		
		int ejeY;
		int ejeX;
		int opcion;
		int incremento=0;
		
		System.out.println("Introduce la coordenada inicial del EjeY: ");
		ejeY = sc.nextInt();
		System.out.println("Introduce la coordenada inicial del EjeX");
		ejeX = sc.nextInt();
		
		//Posicion inicial del objeto
		tablero1 = new Tablero(ejeY, ejeX);
		
		do {
			System.out.println("***MENU***");
			System.out.println("1. ARRIBA");
			System.out.println("2. ABAJO");
			System.out.println("3. DERECHA");
			System.out.println("4. IZQUIERDA");
			System.out.println("5. Salir");
			System.out.println("\nIntroduce la opcion que deseas para tu tablero");
			opcion = sc.nextInt();
			
			if(opcion != 5) {
				System.out.println("\nIntroduce la cantidad de espacios que deseas mover: ");
				incremento = sc.nextInt();
			}
			
			switch (opcion) {
				case 1: tablero1.moverArriba(incremento); 
					break;
				case 2: tablero1.moverAbajo(incremento);
					break;
				case 3: tablero1.moverDerecha(incremento);
					break;
				case 4: tablero1.moverIzquierda(incremento);
					break;
				case 5: break;
				default: System.out.println("Error. Opcion introducida no disponible");
					break;
			}
			
			System.out.println("");
			tablero1.mostrarPosicion();
			System.out.println("");
			
		}while(opcion != 5);
		
		sc.close();
	}

}
