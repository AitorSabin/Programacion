package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Persona> persona = new ArrayList<Persona>();
	static Scanner sc = new Scanner(System.in);
	
	static Persona futbolista1 = new Futbolista("Aitor", "Sabin", 24, 9,"Delantero");
	static Persona futbolista2 = new Futbolista("Juan", "Estevez", 45, 14, "Defensa");
	static Persona entrenador = new Entrenador("Pedro", "Sanchez", 63, "Ofensiva");
	static Persona doctor = new Doctor("Antonio", "Recio", 51, "Fisioterapeuta", 24);
	
	public static void menu() {
		int opcion;
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1. Viaje de equipo");
			System.out.println("2. Entrenamiento");
			System.out.println("3. Partido de futbol");
			System.out.println("4. Planificar entrenamiento");
			System.out.println("5. Entrevista");
			System.out.println("6. Curar lesion");
			System.out.println("7. Salir");
			System.out.println("Introduce la opcion que deseas: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:System.out.println("");
					viajarEquipo();
					break;
				case 2:System.out.println("");
					entrenarEquipo();
					break;
				case 3:System.out.println();
					partidoFutbol();
					break;
				case 4:System.out.println("");
					planificarEntrenamiento();
					break;
				case 5:System.out.println("");
					darEntrevista();
					break;
				case 6:System.out.println("");
					curarLesion();
					break;
				case 7: break;
				default : System.out.println("Error, opcion introducida no valida");
			}
		}while(opcion != 7);
	}
	
	public static void viajarEquipo() {
		for (Persona equipo : persona) {
			System.out.print(equipo.getNombre() +" "+ equipo.getApellido()+" -> ");
			equipo.viajar();
		}
	}
	
	public static void entrenarEquipo() {
		for (Persona equipo : persona) {
			System.out.print(equipo.getNombre() +" "+ equipo.getApellido()+" -> ");
			equipo.entrenamiento();
		}
	}
	public static void partidoFutbol() {
		for (Persona equipo : persona) {
			System.out.print(equipo.getNombre() +" "+ equipo.getApellido()+" -> ");
			equipo.partidoFutbol();
		}
	}
	
	public static void planificarEntrenamiento() {
		System.out.print(entrenador.getNombre()+" "+ entrenador.getApellido()+" -> ");
		((Entrenador) entrenador).planificarEntrenamiento();
	}
	public static void darEntrevista() {
		System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+" -> ");
		((Futbolista) futbolista1).entrevista();
		
		System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" -> ");
		((Futbolista) futbolista2).entrevista();
	}
	
	public static void curarLesion() {
		System.out.print(doctor.getNombre()+" "+doctor.getApellido()+" -> ");
		((Doctor) doctor).curarLesion();
	}
	
	public static void main(String[] args) {
		persona.add(futbolista1);
		persona.add(futbolista2);
		persona.add(entrenador);
		persona.add(doctor);
		
		menu();

	}

}
