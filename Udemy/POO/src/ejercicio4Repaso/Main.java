package ejercicio4Repaso;

import java.util.Scanner;

public class Main {

	public static int indiceGanador(Atletismo atleta[]) {
		int indice=0;
		double tiempoCarrera = atleta[0].getTiempoCarrera();
		for(int i=1; i<atleta.length; i++) {
			if(tiempoCarrera > atleta[i].getTiempoCarrera()) {
				tiempoCarrera = atleta[i].getTiempoCarrera();
				indice= i;
			}
		}
		return indice;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int numAtleta;
		String nombre;
		double tiempoCarrera;
		int cantidadAtletas;
		
		System.out.println("Introduce el numero de Atletas que hay: ");
		cantidadAtletas=sc.nextInt();
		
		Atletismo atleta[]= new Atletismo[cantidadAtletas];
		
		for(int i= 0; i<atleta.length; i++) {
			System.out.println("Introduce el numero del Atleta: ");
			numAtleta= sc.nextInt();
			System.out.println("Introduce el nombre del Atleta: ");
			nombre= sc.next();
			System.out.println("Introduce el tiempo de carrera del Atleta: ");
			tiempoCarrera= sc.nextDouble();
			
			atleta[i]= new Atletismo(numAtleta, nombre, tiempoCarrera);
		} 
		System.out.println("El atleta ganador es: ");
		System.out.println(atleta[indiceGanador(atleta)].mostrarDatos());
		sc.close();
	}
}
