package bucles;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=0;
		int suma_pos=0;
		int contador_pos=0;
		int suma_neg=0;
		int contador_neg=0;
		int contador_ceros=0;
		double media_pos;
		double media_neg;
		for(int i=1;i<=10;i++) {
			
			System.out.println("Escribe un numero: ");
			num= sc.nextInt();
			if(num==0) {
				contador_ceros++;
			}else if(num>0) {
				suma_pos+=num;
				contador_pos++;
			}else {
				suma_neg += num;
				contador_neg++;
			}
		}
		
		if(contador_pos==0) {
			System.out.println("No se puede hacer la media de los numero positivos");
		}else {
			media_pos= (double)suma_pos/contador_pos;
			System.out.println("La media de los numeros positivos es: "+media_pos);
		}
		
		if(contador_neg==0) {
			System.out.println("No se puede hacer la media de los numeros negativos");
		}else {
			media_neg= (double)suma_neg/contador_neg;
			System.out.println("La media de los numeros negativos es: "+media_neg);
		}
		System.out.println("La cantidad de ceros es: "+ contador_ceros);
		
		sc.close();
	}

}
