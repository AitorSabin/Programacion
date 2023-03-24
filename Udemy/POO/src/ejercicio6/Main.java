package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		NumeroComplejo numero1, numero2, suma, mult;
		double a;
		double b;
		double c;
		double d;
		int opcion;
		int numero;
		
		do {
			System.out.println("\t.:Operaciones con Numeros Complejos:.");
			System.out.println("1. Sumar dos numeros complejos.");
			System.out.println("2. Multiplicar 2 numeros complejos.");
			System.out.println("3. Comparar 2 numeros complejos (iguales o no).");
			System.out.println("4. Multiplicar un numero complejo por un entero.");
			System.out.println("5. Salir.");
			System.out.println("Introduce la opcion del menu: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:System.out.println("\nIntroduce el primer numero complejo");
					System.out.println("Introduce la parte real: ");
					a = sc.nextDouble();
					System.out.println("Introduce la parte imaginaria:");
					b = sc.nextDouble();
					System.out.println("\nIntroduce el segundo numero complejo");
					System.out.println("Introduce la parte real: ");
					c = sc.nextDouble();
					System.out.println("Introduce la parte imaginaria:");
					d = sc.nextDouble();
					
					numero1 = new NumeroComplejo(a, b);
					numero2 = new NumeroComplejo(c, d);
					
					suma = numero1.calcularSuma(numero2);
					System.out.println("\nLa suma es: "+suma.getA()+" + "+suma.getB()+"i");
					break;
				case 2:System.out.println("\nIntroduce el primer numero complejo");
					System.out.println("Introduce la parte real: ");
					a = sc.nextDouble();
					System.out.println("Introduce la parte imaginaria:");
					b = sc.nextDouble();
					System.out.println("\nIntroduce el segundo numero complejo");
					System.out.println("Introduce la parte real: ");
					c = sc.nextDouble();
					System.out.println("Introduce la parte imaginaria:");
					d = sc.nextDouble();
					
					numero1 = new NumeroComplejo(a, b);
					numero2 = new NumeroComplejo(c, d);
					
					mult = numero1.calcularMult(numero2);
					System.out.println("\nLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i");
					break;
				case 3:System.out.println("\nIntroduce el primer numero complejo");
					System.out.println("Introduce la parte real: ");
					a = sc.nextDouble();
					System.out.println("Introduce la parte imaginaria:");
					b = sc.nextDouble();
					System.out.println("\nIntroduce el segundo numero complejo");
					System.out.println("Introduce la parte real: ");
					c = sc.nextDouble();
					System.out.println("Introduce la parte imaginaria:");
					d = sc.nextDouble();
					
					numero1 = new NumeroComplejo(a, b);
					numero2 = new NumeroComplejo(c, d);
					
					if(numero1.compararIgualdad(numero2)) {
						System.out.println("\nLos numeros complejos son iguales.");
					}else {
						System.out.println("\nLos numeros complejos NO son iguales.");
					}
					break;
				case 4:System.out.println("\nIntroduce el primer numero complejo");
					System.out.println("Introduce la parte real: ");
					a = sc.nextDouble();
					System.out.println("Introduce la parte imaginaria:");
					b = sc.nextDouble();
					System.out.println("Introduce el numero entero: ");
					numero = sc.nextInt();
					
					numero1 = new NumeroComplejo(a, b);
					
					mult = numero1.multPorEntero(numero);
					System.out.println("\nLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i");
			}
			System.out.println("");
		}while(opcion != 5);
		sc.close();
	}
}
