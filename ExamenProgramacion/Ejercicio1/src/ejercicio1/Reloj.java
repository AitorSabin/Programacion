package ejercicio1;

import java.util.Scanner;

public class Reloj {
	public static int horas = 0;
	public static int minutos = 0;
	public static int segundos = 0;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Reloj h = new Reloj();
		h.horas();
		h.minutos();
		h.segundos();
		if (horas <=24 && minutos <=59 && segundos <=59) {
			System.out.print(horas + ":" + minutos + ":");
		}else {
			System.out.println("Error. "
			+ "Vuelve a iniciar el programa insertando unos parametros validos");
		}
		h.aumentar();
		System.out.println(segundos);
	}
	public void horas() {
		horas = sc.nextInt();
	}
	public void minutos() {
		minutos = sc.nextInt();
	}
	public void segundos() {
		segundos = sc.nextInt();
	}
	public void aumentar() {
		segundos = segundos += 1;
		
	}
}
