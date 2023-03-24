package arrays;

import java.util.Scanner;

public class Ejercicio7 {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int[] a1 = new int[10];
		boolean creciente= false;
		boolean decreciente=false;
		
		System.out.println("Llenar el array");
		for(int i=0;i<a1.length;i++) {
			System.out.println("Introduce un numero: ");
			a1[i]=sc.nextInt();
		}
		
		for(int i=0;i<a1.length-1;i++) {
			if(a1[i] < a1[i+1]) {
				creciente =true;
			}
			if(a1[i] > a1[i+1]) {
				decreciente =true;
			}
		}
		if(creciente==true && decreciente==false) {
			System.out.println("El array esta en forma creciente");
		}else if(creciente==false && decreciente==true) {
			System.out.println("El array esta en forma decreciente");
		}else if(creciente==true && decreciente==true) {
			System.out.println("El array esta desordenado");
		}else if(creciente==false && decreciente==false) {
			System.out.println("El array es igual");
		}
	}

}
