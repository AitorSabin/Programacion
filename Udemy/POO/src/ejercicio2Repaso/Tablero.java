package ejercicio2Repaso;

public class Tablero {

	private int ejeY;
	private int ejeX;
	
	public Tablero(int ejeY, int ejeX) {
		this.ejeY = ejeY;
		this.ejeX = ejeX;
	}
	
	public void arriba(int incremento) {
		this.ejeY += incremento;
	}
	
	public void abajo(int incremento) {
		this.ejeY -= incremento;
	}
	
	public void izquierda(int incremento) {
		this.ejeX -= incremento;
	}
	
	public void derecha(int incremento) {
		this.ejeX += incremento;
	}

	public int getEjeY() {
		return ejeY;
	}

	public int getEjeX() {
		return ejeX;
	}
}
