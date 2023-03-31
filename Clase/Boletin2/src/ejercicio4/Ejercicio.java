package ejercicio4;

import java.util.Arrays;

public class Ejercicio {

	private static int[] eliminarDuplicados(int[] arOriginal) {
		int[] tempArray = new int[arOriginal.length];

		int indexJ = 0;
		for (int i = 0; i < arOriginal.length - 1; i++) {
			int elemento = arOriginal[i];
			if (elemento != arOriginal[i + 1]) {
				tempArray[indexJ++] = elemento;
			}
		}

		tempArray[indexJ++] = arOriginal[arOriginal.length - 1];

		return tempArray;
	}

	private static int[] encontrarElementosRepetidos(int[] arOriginal) {
		// ARRAY ORDENADO
		Arrays.sort(arOriginal);

		// ARRAY DE NUMERO DE ELEMENTOS
		int[] arNumElementos = new int[arOriginal.length];
		int contador = 0;
		int aux = arOriginal[0];
		int iterador = 0;
		for (int i = 0; i < arOriginal.length; i++) {
			if (aux == arOriginal[i]) {
				contador++;
			} else {
				arNumElementos[iterador] = contador;
				contador = 1;
				aux = arOriginal[i];
				iterador++;
			}

		}
		arNumElementos[iterador] = contador;
		return arNumElementos;
	}

	public static void main(String[] args) {

		int[] ar = { 1, 2, 2, 1, 1, 3, 0, 0, 2 };

		// ARRAY ORDENADO
		Arrays.sort(ar);

		// ARRAY DE NUMERO DE ELEMENTOS
		int[] arNumElementos = encontrarElementosRepetidos(ar);

		// ARRAY DE NUMEROS NO REPETIDOS ORDENADOS
		int[] arNoDuplicates = eliminarDuplicados(ar);

		// CONTAR NUMERO DE ELEMENTOS PARA EL ARRAY BIDIMENSIONAL
		int contadorOnly = 0;
		for (int elemento : arNoDuplicates) {
			if (elemento != 0)
				contadorOnly++;
		}

		// ARRAY BIDIMENSIONAL CON EL ELEMENTO Y NUMERO DE ELEMENTOS
		int[][] arRepetidos = new int[contadorOnly][2];

		for (int i = 0; i < arRepetidos.length; i++)
			for (int j = 0; j < arRepetidos[i].length; j++)
				if (j == 0)
					arRepetidos[i][j] = arNoDuplicates[i];
				else
					arRepetidos[i][j] = arNumElementos[i];

		// IMPRIMIR ARRAY BIDIMENSIONAL
		for (int i = 0; i < arRepetidos.length; i++) {
			System.out.print("{ ");
			for (int j = 0; j < arRepetidos[i].length; j++)
				System.out.print("" + arRepetidos[i][j] + " ");
			System.out.print("},");
		}

	}
}
