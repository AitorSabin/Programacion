package ejercicio2;

import java.util.Scanner;

public class Matricula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una matricula:");
		String c="";
		c = sc.nextLine();
		if(c.length()<=7) {
			String c1 ="";
			String c2 ="";
			for(int i = 0;i<=3; i++) {
				char caracter = c.charAt(i);
				c1= c1.concat(String.valueOf(caracter));
			}
			for(int i = 4; i<=6; i++) {
				char caracter = c.charAt(i);
				c2= c2.concat(String.valueOf(caracter));
			}
			String resultado = c1;
			String resultado1 = c2;
			System.out.println("Los caracteres numericos son: " + resultado);
			System.out.println("Los caracteres de  texto son: " + resultado1);
		}
		sc.close();
	}
}
