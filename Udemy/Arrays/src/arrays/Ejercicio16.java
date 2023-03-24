package arrays;

import java.util.Scanner;

public class Ejercicio16 {

	public static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		double[]primerTrimestre = new double[5];
		double[]segundoTrimestre = new double[5];
		double[]tercerTrimestre = new double[5];
		double sumaPrimero=0;
		double sumaSegundo=0;
		double sumaTercero=0;
		int numeroAlumno;
		System.out.println("Notas Primer Trimestre: ");
		for(int i=0; i<primerTrimestre.length;i++) {
			System.out.println("Introduce la nota del alumno "+i+ ": ");
			primerTrimestre[i]=sc.nextDouble();
			sumaPrimero += primerTrimestre[i];
		}
		
		System.out.println("Notas Segundo Trimestre: ");
		for(int i=0; i<segundoTrimestre.length;i++) {
			System.out.println("Introduce la nota del alumno "+i+ ": ");
			segundoTrimestre[i]=sc.nextDouble();
			sumaSegundo += segundoTrimestre[i];
		}
		
		System.out.println("Notas Tercer Trimestre: ");
		for(int i=0; i<tercerTrimestre.length;i++) {
			System.out.println("Introduce la nota del alumno "+i+ ": ");
			tercerTrimestre[i]=sc.nextDouble();
			sumaTercero += tercerTrimestre[i];
		}
		
		System.out.println("La media de la clase el primer trimestre es de: "+sumaPrimero/5);
		System.out.println("La media de la clase el segundo trimestre es de: "+sumaSegundo/5);
		System.out.println("La media de la clase el tercer trimestre es de: "+sumaTercero/5);
		
		do {
		System.out.println("Introduce el numero de un alumno para saber su media: ");
		numeroAlumno=sc.nextInt();
		}while(numeroAlumno<0 || numeroAlumno>4);
		
		System.out.println("La media del alumno indicado es de: "+(primerTrimestre[numeroAlumno] + segundoTrimestre[numeroAlumno] + tercerTrimestre[numeroAlumno])/3);
	}

}
