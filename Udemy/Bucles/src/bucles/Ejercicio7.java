package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 
		 double num=0; 
		 int contador =0;
		 double resultado=0;
		 while(num>=0) {
			 System.out.println("Inserta un numero: ");
			 num= sc.nextInt();
			 if(num>=0) {
			 	resultado+=num;
			 	contador++;
			 }else {
				 System.out.println(resultado);
				 System.out.println("La media de la suma de todos los numeros es: "+resultado/contador);
			 }
		  }
		 System.out.println(contador);
		 
		 sc.close();

	}

}
