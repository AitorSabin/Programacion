package ejercicio4;


public class Primitiva2 {

	private final int TOTAL_NUMEROS = 6;
	private final int MAX_NUM = 49;
	private final int MAX_REINT_NUM = 9;

	private int dia;
	private int mes;
	private int ano;
	private int[] numerosGanadores = new int[TOTAL_NUMEROS];
	private int numeroComplementario;
	private int numeroReintegro;

	public Primitiva2(int dia, int mes, int ano) {
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

	public void hacerSorteo() {
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
			if(existe(numeroAleatorio, numeroGanador)) {
				numeroReintegro=(int) (Math.random() *(MAX_REINT_NUM-0));
			}
		}
		setNumerosGanadores(numeroGanador);
		setNumeroComplementario(numeroComplementario);
		setNumeroReintegro(numeroReintegro);
	}
	
	public static boolean existe(int numeroAleatorio,int[] numeroGanador) {
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

	public static void main(String[] args) {

		Primitiva2 primitiva = new Primitiva2(28, 11, 1998);
		primitiva.hacerSorteo();
		primitiva.mostrarResultado();
	}
}
