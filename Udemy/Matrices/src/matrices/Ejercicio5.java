package matrices;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int matriz[][];
		int nFilas;
		int nColumnas;
		int sumaFilas;
		int sumaColumnas;
		
		System.out.println("Introduce el numero de Filas: ");
		nFilas=sc.nextInt();
		System.out.println("Introduce el numero de Columnas: ");
		nColumnas=sc.nextInt();
		
		matriz = new int[nFilas][nColumnas];
		
		//Pedimos que se rellene la matriz
		System.out.println("Introduce la matriz");
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++) {
				System.out.println("Matriz["+i+"]["+j+"]: ");
				matriz[i][j]= sc.nextInt();
			}
		}
		//Mostramos la Matriz
		System.out.println("La matriz es: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println("");
		}
		
		//Sumamos las filas
		for(int i=0; i<nFilas; i++) {
			sumaFilas=0;
			for(int j=0; j<nColumnas; j++) {
				sumaFilas += matriz[i][j];
			}
			System.out.println("La suma de la fila["+i+"] es: "+ sumaFilas);
		}
		System.out.println("");
		
		//Sumamos las columnas
		for(int j=0; j<nColumnas; j++) {
			sumaColumnas=0;
			for(int i=0; i<nFilas; i++) {
				sumaColumnas += matriz[i][j];
			}
			System.out.println("La suma de la columna["+j+"] es: "+ sumaColumnas);
		}
		System.out.println("");
		sc.close();
	}

}
