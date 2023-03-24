package ejercicio7;

import java.util.Scanner;

public class Main {

	public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
		int i= 0;
		int indice=0;
		boolean encontrar= false;
		
		//Busqueda Secuencial
		while((i<cuentas.length) && (encontrar == false)) {
			if(cuentas[i].getIdnumeroCuenta() == n) {
				encontrar =true;
				indice = i;
			}
			i++;
			}
		if(encontrar == false) {
			indice = -1;
		}
		return indice;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double saldo;
		double cantidad;
		int numeroCuenta;
		int nCuentas;
		int opcion;
		int indiceCuenta;
		String nombre;
		String apellido;
		String dni;
		Cuenta cuentas[];
		Cliente cliente;
		
		System.out.println("Introduce el nombre del Cliente: ");
		nombre= sc.nextLine();
		System.out.println("Introduce el apellido del Cliente: ");
		apellido = sc.nextLine();
		System.out.println("Introduce el dni del Cliente: ");
		dni = sc.nextLine();
		System.out.println("Introduce el NUMERO de cuentas del Cliente: ");
		nCuentas= sc.nextInt();

		cuentas = new Cuenta[nCuentas];
		
		for(int i=0; i<cuentas.length; i++) {
			System.out.println("Introduce los datos para la cuenta "+(i+1)+":");
			System.out.println("Introuce el numero de Cuenta: ");
			numeroCuenta= sc.nextInt();
			System.out.println("Introduce el saldo de la Cuenta: ");
			saldo= sc.nextDouble();
			
			cuentas[i]= new Cuenta(saldo, numeroCuenta);
		}
		
		cliente = new Cliente(nombre, apellido, dni, cuentas);
		
		
		do {
			System.out.println("****MENU****");
			System.out.println("1. Ingresar dinero");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Consultar dinero");
			System.out.println("5. Salir");
			System.out.println("Introduce la opcion del menu: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1: System.out.println("\nIntroduce el numero de cuenta: ");
						numeroCuenta = sc.nextInt();
						indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
						
						if(indiceCuenta == -1) {
							System.out.println("\nEl numero de cuenta no existe");
						}else {
							System.out.println("\nIntroduce la cantidad de dinero a ingresar: ");
							cantidad = sc.nextDouble();
							
							cliente.ingresarDinero(indiceCuenta, cantidad);
							System.out.println("\nIngreso realizado");
							System.out.println("Saldo disponible: "+cliente.consultas_saldo(indiceCuenta));
						}
						break;
				case 2: System.out.println("\nIntroduce el numero de cuenta: ");
						numeroCuenta = sc.nextInt();
						indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				
						if(indiceCuenta == -1) {
							System.out.println("\nEl numero de cuenta no existe");
						}else {
							System.out.println("\nIntroduce la cantidad de dinero a retirar: ");
							cantidad = sc.nextDouble();
							
							if(cantidad>cliente.consultas_saldo(indiceCuenta)) {
								System.out.println("Saldo insuficiente");
							}else {
								cliente.retirarDinero(indiceCuenta, cantidad);
								System.out.println("\nRetirada de dinero realizado");
								System.out.println("Saldo disponible: "+cliente.consultas_saldo(indiceCuenta));
							}
						}
						break;
				case 3: System.out.println("\nIntroduce el numero de cuenta: ");
						numeroCuenta = sc.nextInt();
						indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				
						if(indiceCuenta == -1) {
							System.out.println("\nEl numero de cuenta no existe");
						}else {
							System.out.println("Saldo disponible: "+cliente.consultas_saldo(indiceCuenta));
						}
						break;
				case 4: break;
				default: System.out.println("Se equivoco de opcion de menu");			
			}
			System.out.println("");
		}while(opcion != 4);
		sc.close();
	}
}
