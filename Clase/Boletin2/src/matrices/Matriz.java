package matrices;

import java.util.Scanner;

public class Matriz {

	public static Scanner sc = new Scanner(System.in);

	public static void cubrirMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Rellenar el array " + "[" + i + "]" + "[" + j + "]" + ":");
				matriz[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length - 1; j++) {
				if (matriz[i][j] % 2 == 0) {
					matriz[i][matriz.length] += matriz[i][j];
				}
			}
		}
	}

	public static void mostrarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == matriz.length) {
					System.out.print(matriz[i][j]);
				} else {
					System.out.print(matriz[i][j] + "|");
				}
			}
		}
	}

	public static void main(String[] args) {
		int cantidadFC;

		System.out.println("Introduce la longitud de la matriz que en este caso sera CUADRADA:");
		do {
			System.out.println("El numero a introducir debera ser mayor que 2 o menor o igual que 6");
			cantidadFC = sc.nextInt();
		} while (cantidadFC <= 2 || cantidadFC >= 7);
		int matriz[][] = new int[cantidadFC][cantidadFC + 1];
		Matriz.cubrirMatriz(matriz);
		Matriz.mostrarMatriz(matriz);
	}

}
