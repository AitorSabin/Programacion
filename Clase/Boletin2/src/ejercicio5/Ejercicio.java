package ejercicio5;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidadFC;
		boolean comprobar = false;
		
		System.out.println("Introduce la cantidad de filas y columnas que va a tener tu matriz: ");
		cantidadFC = sc.nextInt();
		int numeros[][]= new int[cantidadFC][cantidadFC];
		
		for(int i=0; i<numeros.length; i++) {
			for(int j=0; j<numeros.length; j++) {
				do {
					System.out.println("Rellena la matriz "+ "["+i+"]"+" ["+j+"]"+" con 1 y 0:");
					numeros[i][j] = sc.nextInt();
				}while(numeros[i][j] != 0  && numeros[i][j] != 1);
			}
		}
		for(int i=0; i<numeros.length; i++) {
			System.out.println("");
			for(int j=0; j<numeros.length; j++) {
				System.out.print(numeros[i][j]+"|");
			}
		}
		for(int i=0; i<numeros.length; i++) {
			for(int j=0; j<numeros.length; j++) {
				if(i==j &&numeros[i][j]==1) {
					comprobar = true;
				}else {
					if(i!=j && numeros[i][j]==0) {
						comprobar = true;
					}else {
						comprobar = false;
						break;
					}
				}
			}
		}
		if(comprobar==true) {
			System.out.println("\nLa matriz es cuadrada es una matriz identidad");
		}else {
			System.out.println("\nLa matriz es cuadrada NO es una matriz identidad");
		}
		
		sc.close();
	}
}
