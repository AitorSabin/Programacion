package arrays;

import java.util.Scanner;

public class Ejercicio6 {
	public static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		int[] a1= new int[12];
		int[] a2= new int[12];
		int[] a3= new int[24];
		int i=0;
		int j=0;
		
		System.out.println("Escribe el primer array");
		for(i=0;i<a1.length;i++) {
			System.out.println("Introduce un numero: ");
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Escribe el segundo array");
		for(i=0;i<a2.length;i++) {
			System.out.println("Introduce un numero: ");
			a2[i]=sc.nextInt();
		}
		
		i=0;
		j=0;
		while(i<12) {
			for(int k=0;k<3;k++) {
				a3[j]=a1[i+k];
				j++;
			}
			for(int k=0;k<3;k++) {
				a3[j]=a2[i+k];
				j++;
			}
			i+=3;
		}
		
		System.out.println("El array resultante es: ");
		for(i=0;i<a3.length;i++) {
			System.out.print(a3[i]+" - ");
		}
	sc.close();
	}

}
