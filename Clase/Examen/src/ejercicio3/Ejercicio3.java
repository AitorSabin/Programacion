package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	private static Scanner sc = new Scanner(System.in);

	public void rellenarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int) (Math.random() * (10 - 0) + 1);
			}
		}
	}

	public void sumarMatrices(int[][] matriz1, int[][] matriz2, int[][] matriz3) {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					matriz3[i][j] += matriz1[i][j] + matriz2[i][j];
				}
			}
		}


	}

	public void mostrarMatrices(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j < matriz.length - 1) {
					System.out.print(matriz[i][j] + "|");
				} else {
					System.out.println(matriz[i][j]);
				}
			}
			System.out.print("");
		}
	}

	public static void main(String[] args) {
		Ejercicio3 ejercicio3 = new Ejercicio3();
		int nPositivo;
		int[][] matriz1;
		int[][] matriz2;
		int[][] matriz3;
		do {
			System.out.println("Introduce un numero mayor o igual a 3 y menor o igual a 8: ");
			nPositivo = sc.nextInt();
		} while (nPositivo < 3 || nPositivo > 8);

		matriz1 = new int[nPositivo][nPositivo];
		matriz2 = new int[nPositivo][nPositivo];
		matriz3 = new int[nPositivo][nPositivo];

		ejercicio3.rellenarMatriz(matriz1);
		ejercicio3.rellenarMatriz(matriz2);
		ejercicio3.sumarMatrices(matriz1, matriz2, matriz3);
		System.out.println("La Matriz 1 es: ");
		ejercicio3.mostrarMatrices(matriz1);
		System.out.println("La Matriz 2 es: ");
		ejercicio3.mostrarMatrices(matriz2);
		System.out.println("La suma de las posiciones pares de las dos matrices son: ");
		ejercicio3.mostrarMatrices(matriz3);

	}
}
