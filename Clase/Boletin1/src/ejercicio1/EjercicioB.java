package ejercicio1;

import java.util.Scanner;

public class EjercicioB {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cantidad;
		int sumaPar=0;
		int sumaImpar=0;
		int sumaMedia;
		
		System.out.println("Introduce la cantidad de numeros que quieres usar: ");
		cantidad= sc.nextInt();
		int[] array=new int[cantidad];
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduce un numero: ");
			array[i]= sc.nextInt();
			if(array[i] %2 ==0) {
				sumaPar += array[i];
			}else {
				sumaImpar += array[i];
			}
		}
		System.out.println("El array inicial es: ");
		for(int i=0; i<array.length; i++) {
			if (i==array.length-1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+ "|");
			}
		}
		
		System.out.println("");
		sumaMedia=(sumaImpar+sumaPar)/cantidad;
		System.out.println("La media de los numero del array es: "+sumaMedia );
		
		System.out.println("");
		System.out.println("La suma de los numeros Pares es: "+sumaPar);
		System.out.println("La suma de los numeros Impares es: "+sumaImpar);

		for(int i=0; i<array.length; i++) {
			if(array[i]<sumaMedia) {
				array[i]=0;
			}	
		}
		System.out.println("El array final es: ");
		for(int i=0; i<array.length; i++) {
			if (i==array.length-1) {
				System.out.print(array[i]);
			}else {
			System.out.print(array[i]+ "|");
			}
		}
		sc.close();
	}

}
