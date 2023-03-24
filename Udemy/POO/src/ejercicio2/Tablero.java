 package ejercicio2;

public class Tablero {

	private int ejeY;
	private int ejeX;
	
	public Tablero(int ejeY, int ejeX) {
		this.ejeY=ejeY;
		this.ejeX=ejeX;
	}
	
	public void moverArriba(int incremento) {
		this.ejeY += incremento;
	}
	
	public void moverAbajo(int incremento) {
		this.ejeY -= incremento;
	}
	
	public void moverDerecha(int incremento) {
		this.ejeX += incremento;
	}
	
	public void moverIzquierda(int incremento) {
		this.ejeX -= incremento;
	}
	
	public int getEjeY() {
		return ejeY;
	}
	
	public int getEjeX() {
		return ejeX;
	}
	
	public void mostrarPosicion() {
		System.out.println("La posicion del ejeY es: "+ejeY);
		System.out.println("La posicion del ejeX es: "+ejeX);
	}
}
