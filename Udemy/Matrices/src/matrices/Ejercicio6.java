package matrices;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] matriz1 = new int[5][9];
		int[][] matriz2 = new int[9][5];
		
		System.out.println("Rellena la Matriz1");
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				System.out.println("Matriz["+i+"]["+j+"]: ");
				matriz1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(matriz1[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Rellana la Matriz2");
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				matriz2[j][i]=matriz1[i][j];
			}
		}
		
		System.out.println("La matriz transpuesta es: ");
		for(int i=0; i<9; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
