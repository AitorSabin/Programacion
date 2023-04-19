package ejercicio4;

public class PrimitivaTicket {
	private int[] numeros;
	private int numeroReintegro;
	
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
	public PrimitivaTicket(int[] numeros, int numeroReintegro) {
		this.numeros = numeros;
		this.numeroReintegro = numeroReintegro;
	}
	
	
}
