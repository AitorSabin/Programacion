package ejercicio1;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		boolean correcto = false;
		
		do {
			System.out.println("Introduce el dia: ");
			dia = sc.nextInt();
			System.out.println("Introduce el mes: ");
			mes = sc.nextInt();
			System.out.println("Introduce el a�o: ");
			ano = sc.nextInt();
			if(ano >=1900 && ano <=2023) {
				if(dia >=1 && dia <=31) {
					if(mes >=1 && mes <=12) {
						switch (mes){
							case 1,3,5,7,8,10,12:
								if (dia<=31) {
									correcto = true;
								}
								break;
							case 4,6,9,11:
								if(dia<=30) {
									correcto = true;
								}
								break;
							case 2: 
								if(dia <=28) {
									correcto = true;
								}
								break;
						}
					}
				}
			}
		}while(correcto == false);
		System.out.println(dia+"/"+mes+"/"+ano);
		sc.close();
	}

}
