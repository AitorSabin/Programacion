package ejercicio1;

import java.util.Scanner;

public class Notas {

	private Scanner sc = new Scanner(System.in);
	private int[] array = new int[10];
	
	public void rellenarNotas() {
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduce la nota del alumno ("+i+")");
			array[i]= sc.nextInt();
		}
	}
	
	private double getAverage() {
		double suma=0;
		for(int i=0; i<array.length; i++) {
			suma += array[i];
		}
		return suma/array.length;
	}
	
	public static void main(String[] args) {
		Notas nota = new Notas();
		nota.rellenarNotas();
		System.out.println(nota.getAverage());
	}

}
