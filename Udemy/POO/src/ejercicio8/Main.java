package ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static Scanner sc= new Scanner(System.in);
	
	public static Sucursal crearSucursal() {
		System.out.println("\nIntroduce el numero de Sucursal: ");
		int numeroSucursal  = sc.nextInt();
		System.out.println("\nIntroduce la direccion de la Surcursal: ");
		sc.nextLine();
		String direccion = sc.nextLine();
		System.out.println("\nIntroduce la ciudad de la Sucursal: ");
		String ciudad = sc.nextLine();
		return new Sucursal(numeroSucursal, direccion, ciudad);
	}
	
	public static void enviarPaquete(List<Sucursal> listaSucursales) {
		System.out.println("\nIntroduce el numero de Sucursal: ");
		int numeroSucursal  = sc.nextInt();
		Sucursal sucursal = buscarSucursal(listaSucursales, numeroSucursal);
		if(sucursal == null) {
			System.out.println("La sucursal no existe");
		}else {
			sucursal.addPaquete(crearPaquete());
		}
	}
	
	public static Paquete crearPaquete() {
		System.out.println("\nIntroduce el numero de Paquete: ");
		int numeroPaquete = sc.nextInt();
		System.out.println("\nIntroduce el dni del Remitente: ");
		String dni= sc.next();
		System.out.println("\nIntroduce el peso del Paquete: ");
		double peso= sc.nextDouble();
		System.out.println("\nIntroduce la prioridad (0=Normal, 1=Alta, 2=Express): ");
		int prioridad= sc.nextInt();
		return new Paquete(numeroPaquete, dni, peso, prioridad);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void mostrarSucursal(List<Sucursal> listaSucursales) {
		System.out.println("Introduce el numero de Sucursal: ");
		int numeroSucursal = sc.nextInt();
		Sucursal sucursal = buscarSucursal(listaSucursales, numeroSucursal);
		System.out.println(sucursal== null ? "La Sucursal no existe" : sucursal.mostrarDatosSucursal());
	}
	
	public static Sucursal buscarSucursal(List<Sucursal> listaSucursales, int numeroSucursal) {	
		for (Sucursal sucursal: listaSucursales) {
			if(numeroSucursal == sucursal.getNumeroSucursal()) {
				return sucursal;
			}
		}
		return null;				
	}
	
	public static void buscarPaquete(List<Sucursal> listaSucursales, int numeroPaquete) {
		
	}
	
	
//	public static String buscarSucursal(List<Sucursal> listaSucursales ) {
//		System.out.println("Introduce el numero de Sucursal: ");
//		int numeroSucursal = sc.nextInt();
//		for (Sucursal sucursal: listaSucursales) {
//			if(numeroSucursal == sucursal.getNumeroSucursal()) {
//				return sucursal.mostrarDatosSucursal();
//			}
//		}
//		return "La Sucursal no existe";				
//	}
	
	public static void main(String[] args) {
		
		int opcion;
		List<Sucursal> listaSucursales = new ArrayList<Sucursal>();

		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1. Crear una nueva Sucursal");
			System.out.println("2. Enviar Paquete");
			System.out.println("3. Consultar Sucursal");
			System.out.println("4. Consultar Paquete");
			System.out.println("5. Mostrar todas las sucursales");
			System.out.println("6. Mostrar todos los paquetes");
			System.out.println("7. Salir");
			System.out.println("Introduce la opcion del menu; ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1: listaSucursales.add(crearSucursal());
						break;
				case 2: enviarPaquete(listaSucursales);
						break;
				case 3: mostrarSucursal(listaSucursales);
						break;
				case 4: System.out.println("Introduce el numero de Paquete: ");
						
						
						break;
						
				case 5: 
						
						break;
				case 6: 
						
				case 7: break;
				default: System.out.println("Error, opcion de menu incorrecta");
						break;
					
			}
			System.out.println("");
		}while(opcion != 7);
		
		sc.close();
	}
}
