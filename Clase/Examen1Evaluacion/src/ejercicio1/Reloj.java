package ejercicio1;

import java.util.Scanner;

public class Reloj {

	private static Scanner sc = new Scanner(System.in);

	private int horas;
	private int minutos;
	private int segundos;

	private final int HORAS_MINIMA = 0;
	private final int HORAS_MAXIMA = 23;

	private final int MINUTOS_MINIMO = 0;
	private final int MINUTOS_MAXIMO = 59;

	private final int SEGUNDOS_MINIMO = 0;
	private final int SEGUNDOS_MAXIMO = 59;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void asignarHoras() {
		do {
			System.out.println("Introduce la hora: ");
			this.setHoras(sc.nextInt());
		} while (this.getHoras() < HORAS_MINIMA || this.getHoras() > HORAS_MAXIMA);
	}

	public void asignarMinutos() {
		do {
			System.out.println("Introduce el minuto: ");
			minutos = sc.nextInt();
		} while (minutos < MINUTOS_MINIMO || minutos > MINUTOS_MAXIMO);
	}

	public void asignarSegundos() {
		do {
			System.out.println("Introduce los segundos: ");
			segundos = sc.nextInt();
		} while (segundos < SEGUNDOS_MINIMO || segundos > SEGUNDOS_MAXIMO);
	}

	public void mostrasHora() {
		int tempSegundo = segundos;
		int tempMinutos = minutos;
		int tempHoras = horas;

		if ((tempSegundo + 1) > SEGUNDOS_MAXIMO) {
			tempSegundo = SEGUNDOS_MINIMO;
			tempMinutos += 1;
			if (tempMinutos > MINUTOS_MAXIMO) {
				tempMinutos = MINUTOS_MINIMO;
				tempHoras += 1;
				if (tempHoras > HORAS_MAXIMA) {
					tempHoras = HORAS_MINIMA;
				}
			}
			System.out.println(tempHoras + ":" + tempMinutos + ":" + (tempSegundo));
		} else {
			System.out.println(tempHoras + ":" + tempMinutos + ":" + (tempSegundo + 1));
		}
	}

}
