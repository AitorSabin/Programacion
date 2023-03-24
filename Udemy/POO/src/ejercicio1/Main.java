package ejercicio1;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		double lado1;
		double lado2;
		
		Cuadrilatero cuadrilatero1;
		
		System.out.println("Introduce el valor del lado1: ");
		lado1 = sc.nextDouble();
		System.out.println("Introduce el valor del lado2: ");
		lado2 = sc.nextDouble();
		
		if(lado1==lado2) {
			cuadrilatero1= new Cuadrilatero(lado1);
		}else {
			cuadrilatero1= new Cuadrilatero(lado1, lado2);
		}
		
		System.out.println("El perimetro es: "+cuadrilatero1.getPerimetro());
		System.out.println("El area es: "+cuadrilatero1.getArea());
		
		sc.close();
	}

}
