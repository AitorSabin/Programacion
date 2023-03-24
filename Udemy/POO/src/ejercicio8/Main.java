package ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static int buscarPaquete(ArrayList <Paquete> paqueteArrayList, int numeroPaquete, int contadorPaquete) {
		int indice =0;
		boolean encontrado = false;
		
		for(int i=0; i<paqueteArrayList.size();i++) {
			if(paqueteArrayList.get(i).getNumeroPaquete() == numeroPaquete) {
				encontrado = true;
				indice = i;
			}
		}
		if(encontrado == false) {
			indice = -1;
		}
		return indice;
	}

	public static int buscarSucursal(ArrayList <Sucursal> sucursalesArrayList, int numeroSucursal, int contadorSucursal) {
		int indice =0;
		boolean encontrado = false;
		
		for(int i=0; i<sucursalesArrayList.size();i++) {
			if(sucursalesArrayList.get(i).getNumeroSucursal() == numeroSucursal) {
				encontrado = true;
				indice = i;
			}
		}
		if(encontrado == false) {
			indice = -1;
		}
		return indice;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numeroSucursal;
		int numeroPaquete;
		int prioridad;
		int opcion;
		int contadorSucursal=0;
		int contadorPaquete=0;
		int indiceSucursal;
		int indicePaquete;
		double peso;
		double precioPaquete;
		String dni;
		String direccion;
		String ciudad;
		//Sucursal sucursales[] = new Sucursal[50];
		//Paquete paquetes[] = new Paquete[100];
		ArrayList <Sucursal> sucursalesArrayList = new ArrayList<Sucursal>();
		ArrayList <Paquete> paqueteArrayList = new ArrayList<Paquete>();
		
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1. Crear una nueva Sucursal");
			System.out.println("2. Enviar Paquete");
			System.out.println("3. Consultar Sucursal");
			System.out.println("4. Consultar Paquete");
			System.out.println("5. Mostrat todas las sucursales");
			System.out.println("6. Mostrar todos los paquetes");
			System.out.println("7. Salir");
			System.out.println("Introduce la opcion del menu; ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1: System.out.println("\nIntroduce el numero de Sucursal: ");
						numeroSucursal = sc.nextInt();
						System.out.println("\nIntroduce la direccion de la Surcursal: ");
						sc.nextLine();
						direccion = sc.nextLine();
						System.out.println("\nIntroduce la ciudad de la Sucursal: ");
						ciudad = sc.next();
						
						sucursalesArrayList.add(new Sucursal(numeroSucursal, direccion, ciudad));
						//sucursales[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
						contadorSucursal++;
						break;
				case 2: System.out.println("\nIntroduce el numero de la Sucursal: ");
						numeroSucursal = sc.nextInt();
						indiceSucursal = buscarSucursal(sucursalesArrayList, numeroSucursal, contadorSucursal);
						
						if(indiceSucursal == -1) {
							System.out.println("La sucursal no existe");
						}else {
							System.out.println("\nIntroduce el numero de Paquete: ");
							numeroPaquete = sc.nextInt();
							System.out.println("\nIntroduce el dni del Remitente: ");
							dni= sc.next();
							System.out.println("\nIntroduce el peso del Paquete: ");
							peso= sc.nextDouble();
							System.out.println("\nIntroduce la prioridad (0=Normal, 1=Alta, 2=Express): ");
							prioridad= sc.nextInt();
							
							paqueteArrayList.add(new Paquete(numeroPaquete, dni, peso, prioridad));
							
							precioPaquete = sucursalesArrayList.get(indiceSucursal).calcularPrecio(paqueteArrayList.get(contadorPaquete));
							System.out.println("\nEl precio es: "+precioPaquete+"�");
							contadorPaquete++;
						}
						break;
				case 3: System.out.println("Introduce el numero de Sucursal: ");
						numeroSucursal = sc.nextInt();
						
						indiceSucursal = buscarSucursal(sucursalesArrayList, numeroSucursal, contadorSucursal);
						
						if(indiceSucursal == -1) {
							System.out.println("\nLa sucursal no existe");
						}else {
							System.out.println("\nLos datos de la sucursal son: ");
							System.out.println(sucursalesArrayList.get(indiceSucursal).mostrarDatosSucursal());
						}
						break;
				case 4: System.out.println("Introduce el numero de Paquete: ");
						numeroPaquete = sc.nextInt();
						
						indicePaquete = buscarPaquete(paqueteArrayList, numeroPaquete, contadorPaquete);
						
						if(indicePaquete == -1) {
							System.out.println("\\nEl paquete no existe");
						}else {
							System.out.println("\nLos datos del paquete son: ");
							System.out.println(paqueteArrayList.get(indicePaquete).mostrarDatosPaquete());
						}
						break;
				case 5: 
						for(Sucursal sucursal: sucursalesArrayList) {
							System.out.println("\nLos datos de la sucursal son los siguientes: ");
							System.out.println(sucursal.mostrarDatosSucursal());
						}
						break;
				case 6: 
						for(Paquete paquetes: paqueteArrayList) {
							System.out.println("\nLos datos del paquete son los siguientes: ");
							System.out.println(paquetes.mostrarDatosPaquete());
						}
						break;
				case 7: break;
				default: System.out.println("Error, opcion de menu incorrecta");
						break;
					
			}
			System.out.println("");
		}while(opcion != 7);
		
		sc.close();
	}
}
