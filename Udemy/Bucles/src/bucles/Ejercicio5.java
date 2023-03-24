package bucles;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int aleatorio = (int)(Math.random()*100);
		int numero=0;
		int contador=0;
		do {
			System.out.println("Inserta un numero: ");
			numero= sc.nextInt();
			if(aleatorio > numero) {
				System.out.println("Escribe un numero mayor ");
			}else if(aleatorio < numero){
				System.out.println("Escribe un numero menor ");
			}else {
				System.out.println("Adivinaste el numero en: "+contador+" intentos");
			}
			contador++;
		}while(numero != aleatorio);

		sc.close();
	}

}
