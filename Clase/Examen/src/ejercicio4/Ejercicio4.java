package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	private static Scanner sc = new Scanner(System.in);
	
	private void mostrarMatriz(char[] matriz3) {
		for (int i = 0; i < matriz3.length; i++) {
			if (i < matriz3.length - 1) {
				System.out.print(matriz3[i] + "|");
			} else {
				System.out.println(matriz3[i]);
			}
		}
		System.out.print("");
		
	}

	public void mostrarMatriz(int[] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			if (i < matriz.length - 1) {
				System.out.print(matriz[i] + "|");
			} else {
				System.out.println(matriz[i]);
			}
		}
		System.out.print("");
	}

	public static void main(String[] args) {
		
		Ejercicio4 ejercicio4 = new Ejercicio4();
		int[] matriz1 = new int[5];
		int[] matriz2 = new int[5];
		char[] matriz3 = { '-', '/', '+', '*', '/' };

		System.out.println("Rellenara la Matriz 1");
		for (int i = 0; i < matriz1.length; i++) {
			do {
				System.out.println("Rellena la posicion [" + i + "]");
				matriz1[i] = sc.nextInt();
			} while (matriz1[i] < 0 || matriz1[i] > 100);
		}

		System.out.println("Rellenara la Matriz 2");
		for (int i = 0; i < matriz2.length; i++) {
			do {
				System.out.println("Rellena la posicion [" + i + "]");
				matriz2[i] = sc.nextInt();
			} while (matriz2[i] < 0 || matriz2[i] > 100);
		}

		System.out.println("Array de numeros 1: ");
		ejercicio4.mostrarMatriz(matriz1);
		System.out.println("Array de numeros 2: ");
		ejercicio4.mostrarMatriz(matriz2);
		System.out.println("Array de operaciones: ");
		ejercicio4.mostrarMatriz(matriz3);
		
		for (int i = 0; i < matriz3.length; i++) {
			switch (matriz3[i]) {
			case '-':
				if (matriz1[i] >= matriz2[i]) {
					System.out.println("La resta de la posicion: [" + i + "] " + (matriz1[i] - matriz2[i]));
				} else {
					System.out.println("La operacion de - no se ha podido realizar.");
				}
				break;
			case '/':
				if (matriz2[i] != 0) {
					System.out.println("La division de la posicion: [" + i + "] " + ((double)(matriz1[i] / matriz2[i])));
				} else {
					System.out.println("La operacion de / no se ha podido realizar.");
				}
				break;
			case '+':
				System.out.println("La suma de la posicion: [" + i + "] " + (matriz1[i] + matriz2[i]));
				break;
			case '*':
				System.out.println("La multiplicacion de la posicion: [" + i + "] " + (matriz1[i] * matriz2[i]));
				break;
			}
		}
	}


}
