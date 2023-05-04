package ejercicio2;

import java.util.Scanner;

public class NotasAlumnos {

	private Scanner sc = new Scanner(System.in);
	
	private int[] arrayNotas = new int[10];
	private String[] arrayNombres = new String[10];
	
	public void rellenarNotas_Alumnos() {
		for(int i=0; i<arrayNotas.length; i++) {
			System.out.println("Introduce el nombre del alumno "+i);
			arrayNombres[i]= sc.next();
			System.out.println("Introduce la nota de: "+arrayNombres[i]);
			arrayNotas[i]= sc.nextInt();
		}
	}
	
	public String min() {
		int menor=arrayNotas[0];
		int posicion=0;
		
		for(int i=1; i<arrayNotas.length; i++) {
			if(menor> arrayNotas[i]) {
				menor = arrayNotas[i];
				posicion=i;
			}
		}
		return "La notas mas baja de todos es: "+arrayNotas[posicion]
				+" y la tiene: "+arrayNombres[posicion];
	}
	
	public String max() {
		int mayor=arrayNotas[0];
		int posicion=0;
		
		for(int i=1; i<arrayNotas.length; i++) {
			if(mayor < arrayNotas[i]) {
				mayor = arrayNotas[i];
				posicion=i;
			}
		}
		return "La notas mas alta de todos es: "+arrayNotas[posicion]
				+" y la tiene: "+arrayNombres[posicion];
	}
	
	public static void main(String[] args) {
		NotasAlumnos notasAlumnos = new NotasAlumnos();
		notasAlumnos.rellenarNotas_Alumnos();
		System.out.println(notasAlumnos.min());
		System.out.println(notasAlumnos.max());
	}

}
