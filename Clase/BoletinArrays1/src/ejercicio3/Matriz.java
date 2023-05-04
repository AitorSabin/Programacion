package ejercicio3;

import java.util.Scanner;

public class Matriz {
	
	public Scanner sc = new Scanner(System.in);
	
	private int[][] matriz;
	
	public Matriz() {
		matriz = new int[3][3];
	}
	
	public Matriz(int filas, int cols) {
		matriz = new int[filas][cols];
	}
	
	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public int[][] rellenarMatriz(int [][] matriz1) {
		int[][] matrizLlena = new int[matriz.length][matriz[0].length];
		for(int i= 0; i<matrizLlena.length; i++) {
			for(int j=0; j<matrizLlena[i].length;j++) {
				System.out.println("Rellana la Matriz en la posicion ("+i+") ("+j+")");
				matrizLlena[i][j]= sc.nextInt();
			}
		}
		return matrizLlena;
	}
	
	public int[][] suma(int[][] matriz1, int[][] matriz2){
		int[][] matrizSuma = new int[matriz.length][matriz[0].length];
		for(int i= 0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length;j++) {
				matrizSuma[i][j]= matriz1[i][j]+matriz2[i][j];	
			}
		}
		return matrizSuma;
	}
	
	public static void main(String[] args) {
		int[][] matrizRellena1;
		int[][] matrizRellena2;
		int[][] matrizSuma1;
		Matriz matriz1 = new Matriz();
		Matriz matriz2 = new Matriz();
		
		matrizRellena1= matriz1.rellenarMatriz(matriz1.getMatriz());
		matrizRellena2= matriz2.rellenarMatriz(matriz2.getMatriz());
		matrizSuma1=matriz1.suma(matrizRellena1, matrizRellena2);

		for(int i= 0; i<matrizRellena1.length; i++) {
			for(int j=0; j<matrizRellena1[i].length;j++) {
				System.out.print(matrizRellena1[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i= 0; i<matrizRellena2.length; i++) {
			for(int j=0; j<matrizRellena2[i].length;j++) {
				System.out.print(matrizRellena2[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		for(int i= 0; i<matrizRellena2.length; i++) {
			for(int j=0; j<matrizRellena2[i].length;j++) {
				System.out.print(matrizSuma1[i][j]);
			}
			System.out.println("");
		}
	}

}
