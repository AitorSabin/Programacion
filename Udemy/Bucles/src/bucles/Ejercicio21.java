package bucles;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		boolean contador_negativos=false;
		for(int i =0; i<=10; i++) {
			System.out.println("Introduce un numero: ");
			num=sc.nextInt();
			if(num<0) {
				contador_negativos=true;
			}
		}
		if(contador_negativos ==true) {
			System.out.println("Existe al menos un numero negativo");
		}else {
			System.out.println("No existe ningun numero negativo");
		}
		sc.close();
	}

}
