package ejercicio4;

public class PrimitivaTicket {
	private int[] numeros;
	private int numeroReintegro;
	private int numeroComplementario;
	
	public PrimitivaTicket(int[] numeros, int numeroReintegro, int numeroComplementario) {
		this.numeros = numeros;
		this.numeroReintegro = numeroReintegro;
		this.numeroComplementario = numeroComplementario;
	}
	
	public int[] getNumeros() {
		return numeros;
	}
	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	public int getNumeroReintegro() {
		return numeroReintegro;
	}
	public void setNumeroReintegro(int numeroReintegro) {
		this.numeroReintegro = numeroReintegro;
	}
	public int getNumeroComplementario() {
		return numeroComplementario;
	}
	public void setNumeroComplementario(int numeroComplementario) {
		this.numeroComplementario = numeroComplementario;
	}
	
	
	
	
	
}
