package ejercicio4;

import java.util.Scanner;

public class Main {

	public static int indiceGanador(Atletismo[] atletas) {
		double tiempoCarrera;
		int indice=0;
		
		tiempoCarrera = atletas[indice].getTiempoCarrera();
		
		for(int i=1; i<atletas.length; i++) {
			if(atletas[i].getTiempoCarrera()< tiempoCarrera) {
				tiempoCarrera= atletas[i].getTiempoCarrera();
				indice=i;
			}
		}
		return indice;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numeroAtletas;
		int numero;
		String nombre;
		double tiempoCarrera;	
		int indiceAtletaGanador;
		
		System.out.println("Introduce el numero de atletas que participan: ");
		numeroAtletas = sc.nextInt();
		
		
		Atletismo[] atletas = new Atletismo[numeroAtletas];
		
		for(int i=0; i<atletas.length; i++) {
			System.out.println("Introduce el numero del Atleta "+(i+1)+":");
			numero= sc.nextInt();
			sc.nextLine();
			System.out.println("Introduce el nombre del Atleta "+(i+1)+":");
			nombre= sc.nextLine();
			System.out.println("Introduce el tiempo con el que finalizo la carrera "+(i+1)+":");
			tiempoCarrera= sc.nextDouble();
			
			atletas[i] = new Atletismo(numero, nombre, tiempoCarrera);
		}
		indiceAtletaGanador = indiceGanador(atletas);
		System.out.println("El atleta ganador es: ");
		System.out.println(atletas[indiceAtletaGanador].mostrarGanador());
		
		sc.close();

	}

}
