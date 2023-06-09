package ejercicio2Repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ejeY;
		int ejeX;
		int incremento;
		int opcion;
		
		System.out.println("Introduce el numero en el que empieza el ejeY: ");
		ejeY= sc.nextInt();
		System.out.println("Introduce el numero en el que empieza el ejeX: ");
		ejeX = sc.nextInt();
		Tablero tablero = new Tablero(ejeY, ejeX);
		
		do {
			System.out.println("****MENU****");
			System.out.println("1. ARRIBA");
			System.out.println("2. ABAJO");
			System.out.println("3. IZQUIERDA");
			System.out.println("4. DERECHA");
			System.out.println("5. Salir");
			
			System.out.println("Introduce la opcion que deseas realizar: ");
			opcion = sc.nextInt();
			
			
			
			switch(opcion) {
				case 1: System.out.println("Introduce el numero de veces que te quieres desplazar: ");
					incremento = sc.nextInt();
					tablero.arriba(incremento);
					break;
				case 2: System.out.println("Introduce el numero de veces que te quieres desplazar: ");
					incremento = sc.nextInt();
					tablero.abajo(incremento);
					break;
				case 3: System.out.println("Introduce el numero de veces que te quieres desplazar: ");
					incremento = sc.nextInt();
					tablero.izquierda(incremento);
					break;
				case 4: System.out.println("Introduce el numero de veces que te quieres desplazar: ");
					incremento = sc.nextInt();
					tablero.derecha(incremento);
					break;
				default:break;
			}
			System.out.println("Las coordenadas quedan asi: EjeY: " + tablero.getEjeY() + " EjeX: " + tablero.getEjeX());
		}while(opcion != 5);
		
		sc.close();
	}

}
