package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Primitiva3{
	
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
	

	public Primitiva3(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		hacerSorteo();
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
	
	@Override
	public String toString() {
		return "El resultado del sorteo realizado el " + dia + " del " + mes + " del " + ano
				+ " fue el siguiente:\r\n" + "Números premiados: " + Arrays.toString(numerosGanadores).replace("[", "").replace("]","") + "\r\n"
				+ "Complementario: " + numeroComplementario + "\r\n" + "Reintegro: " + numeroReintegro + "\r\n" + "";
	}
	

	private void hacerSorteo() {
		int[] numeroGanador = new int[TOTAL_NUMEROS];
		int numeroAleatorio;
		int numeroComplementario=(int) (Math.random() * (MAX_NUM-1)+1);
		int numeroReintegro=(int) (Math.random() *(MAX_REINT_NUM-0));
		
		for (int i = 0; i < numeroGanador.length; i++) {

			do {
				numeroAleatorio= (int) (Math.random() * (MAX_NUM-1)+1);
			}while(existe(numeroAleatorio, numeroGanador));
			numeroGanador[i] = numeroAleatorio;
			if (numeroGanador[i] < 1 || numeroGanador[i] > MAX_NUM) {
				System.out.println("ERROR. Numero introducido incorrecto");
				i -= 1;
			}
			if(existe(numeroComplementario, numeroGanador)) {
				numeroComplementario =(int) (Math.random() * (MAX_NUM-1)+1);
			}
		}
		setNumerosGanadores(numeroGanador);
		setNumeroComplementario(numeroComplementario);
		setNumeroReintegro(numeroReintegro);
	}
	
	private static boolean existe(int numeroAleatorio,int[] numeroGanador) {
		for(int i=0; i< numeroGanador.length; i++) {
			if(numeroAleatorio == numeroGanador[i]) {
				return true;
			}
		}
		return false;
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
			this.numeroComplementario = numeroComplementario;
	}

	public int getNumeroReintegro() {
		return numeroReintegro;
	}

	public void setNumeroReintegro(int numeroReintegro) {
		this.numeroReintegro = numeroReintegro;
	}
	
	public PrimitivaTicket generarBoleto() {
		int[] numeros = new int[TOTAL_NUMEROS];
		int numeroReintegro;
		int numeroComplementario;
		for(int i =0; i<numeros.length; i++) {
			do {
				System.out.println("Introduce un numero: ["+i+"]");;
				numeros[i]= sc.nextInt();
			}while(numeros[i]<0 || numeros[i]>MAX_NUM);
		}
		do {
			System.out.println("Introduce un numero de Reintegro: ");
			numeroReintegro= sc.nextInt();
		}while(numeroReintegro <0 && numeroReintegro >MAX_REINT_NUM);
		System.out.println("Introduce un numero Complementario: ");
		numeroComplementario = sc.nextInt();
		
		return new PrimitivaTicket(numeros, numeroReintegro, numeroComplementario);
	}
	
	public void mostrarPremio(PrimitivaTicket ticket) {
		int contador=0;
		for(int i=0; i<TOTAL_NUMEROS;i++) {
			if(existe(ticket.getNumeros()[i], numerosGanadores)) {
				contador++;
			}
		}
		if(contador == TOTAL_NUMEROS) {
			System.out.println("El boleto tiene los 6 números premiados: Premio de 500000€!");
		}else if(contador == TOTAL_NUMEROS-1 && getNumeroComplementario() == ticket.getNumeroComplementario()) {
			System.out.println( "El boleto tiene 5 números premiados y el complementario: Premio de 10000€!");
		}else if(contador == TOTAL_NUMEROS-1) {
			System.out.println("El boleto tiene 5 números premiados: Premio de 500€!");
		}else if(contador == TOTAL_NUMEROS-2 && getNumeroComplementario() == ticket.getNumeroComplementario()) {
			System.out.println("El boleto tiene 4 números premiados y el complementario: Premio de 20€!");
		}else if(getNumeroReintegro() == ticket.getNumeroReintegro()) {
			System.out.println("El boleto tiene el número del reintegro: Reintegro del boleto!");
		}else {
			System.out.println("El billete no tiene premio");
		}
	}
	
	public static void main(String[] args) {
		Primitiva3 primitiva3 = new Primitiva3(28, 11, 1998);
		primitiva3.mostrarResultado();
		System.out.println(primitiva3.toString());
		System.out.println("\n");
		primitiva3.mostrarPremio(primitiva3.generarBoleto());
	}
	
}
