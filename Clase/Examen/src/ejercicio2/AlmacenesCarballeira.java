package ejercicio2;

import java.util.Scanner;

public class AlmacenesCarballeira {

	public static Scanner sc = new Scanner(System.in);

	public static boolean comprobarLetra(String a) {

		if (Character.isLetter(a.charAt(a.length() - 1))) {
			if(a.charAt(a.length()-1)=='S' || a.charAt(a.length()-1)=='N') {
				return true;
			}		
		}
		System.out.println("No se encuentra una letra en la posicion que corresponde.");
		return false;

	}

	public static boolean comprobarNumeros(String a) {

		boolean acum = true;

		for (int i = 0; i < (a.length() - 2); i++) {

			if (Character.isDigit(a.charAt(i)) == false) {
				acum = false;
				System.out.println("Los numeros no son correctos.");
			}

		}

		return acum;

	}

	public String comprobarCodigo() {
		String codigo;
		do {
			System.out.println("Introduce tu codigo de cliente: ");
			codigo = sc.next();
			comprobarNumeros(codigo);
			comprobarLetra(codigo);
		} while (codigo.length() != 5);
		
		return codigo;
	}
	
	public int descuento(String codigo) {
		int descuento;
		do {
			System.out.println("Introduce el descuento: ");
			descuento= sc.nextInt();
		}while(descuento<0 || descuento>10);
		if(codigo.charAt(codigo.length()-1)=='S' || codigo.charAt(codigo.length()-1)=='N') {			
			return descuento;
		}
		return 0;
	}

	public static void main(String[] args) {
		AlmacenesCarballeira almacen = new AlmacenesCarballeira();
		int numero;
		double precio;
		
		System.out.println("Introduce el numero de productos que vas a pasar en caja e introduce el precio: ");
		System.out.println("Numero: ");
		numero= sc.nextInt();
		System.out.println("Precio: ");
		precio = sc.nextDouble();
		almacen.comprobarCodigo();
		almacen.descuento(almacen.comprobarCodigo());

	}

}
