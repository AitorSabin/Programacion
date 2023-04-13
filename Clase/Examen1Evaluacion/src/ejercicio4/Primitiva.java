package ejercicio4;

import java.util.Scanner;

public class Primitiva {

	private static Scanner sc = new Scanner(System.in);

	private final int TOTAL_NUMEROS = 6;
	private final int MAX_NUM = 49;
	private final int MAX_REINT_NUM = 9;

	private int dia;
	private int mes;
	private int ano;
	private int[] numerosGanadores = new int[TOTAL_NUMEROS];
	private int numeroComplementario;
	private int numeroReintegro;

	public Primitiva(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public static String toString(int[] a) {
		if (a == null)
			return "null";
		int iMax = a.length - 1;
		if (iMax == -1)
			return " ";

		StringBuilder b = new StringBuilder();
		b.append(' ');
		for (int i = 0;; i++) {
			b.append(a[i]);
			if (i == iMax)
				return b.append(' ').toString();
			b.append(" ");
		}
	}

	public void mostrarResultado() {
		System.out.println("El resultado del sorteo realizado el " + dia + " del " + mes + " del " + ano
				+ " fue el siguiente:\r\n" + "Números premiados: " + toString(numerosGanadores) + "\r\n"
				+ "Complementario: " + numeroComplementario + "\r\n" + "Reintegro: " + numeroReintegro + "\r\n" + "");
	}

	public int[] rellenarNumGanador() {
		int[] numeroGanador = new int[TOTAL_NUMEROS];
		for (int i = 0; i < numeroGanador.length; i++) {
			System.out.println("Introduce el numero Ganador" + "[" + i + "]");
			numeroGanador[i] = sc.nextInt();
			if (numeroGanador[i] < 1 || numeroGanador[i] > 49) {
				System.out.println("ERROR. Numero introducido incorrecto");
				i -= 1;
			}
		}
		return numeroGanador;
	}

	public int rellenarNumeroReintegro() {
		int numeroRein;
		do {
			System.out.println("Introducir numero de Reintegro");
			numeroRein = sc.nextInt();
			if (numeroRein < 0 || numeroRein > MAX_REINT_NUM) {
				System.out.println("Numero de Reintegro introducido no valido");
			}
		} while (numeroRein < 0 || numeroRein > MAX_REINT_NUM);
		return numeroRein;
	}
	
	public int rellenarNumeroComplementario() {
		int numeroComple;
		do {
			System.out.println("Introducir numero Complementario");
			numeroComple = sc.nextInt();
			if (numeroComple < 0 || numeroComple > MAX_NUM) {
				System.out.println("Numero Complementario introducido no valido");
			}
		} while (numeroComple < 0 || numeroComple > MAX_NUM);
		return numeroComple;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int[] getNumerosGanadores() {
		return numerosGanadores;
	}

	public void setNumerosGanadores(int[] numerosGanadores) {
		this.numerosGanadores = numerosGanadores;
	}

	public int getNumeroComplementario() {
		return numeroComplementario;
	}

	public void setNumeroComplementario(int numeroComplementario) {
		if (numeroComplementario >= 0 && numeroComplementario <= MAX_NUM) {
			this.numeroComplementario = numeroComplementario;
		} else {
			System.out.println("Numero Complementario introducido no valido");
		}
	}

	public int getNumeroReintegro() {
		return numeroReintegro;
	}

	public void setNumeroReintegro(int numeroReintegro) {
		this.numeroReintegro = numeroReintegro;
	}

	public static void main(String[] args) {

		Primitiva primitiva = new Primitiva(28, 11, 1998);
		primitiva.setNumeroComplementario(primitiva.rellenarNumeroComplementario());
		primitiva.setNumeroReintegro(primitiva.rellenarNumeroReintegro());
		primitiva.setNumerosGanadores(primitiva.rellenarNumGanador());
		primitiva.mostrarResultado();
	}

}
