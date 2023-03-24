package ejercicio1Repaso;

public class Cuadrilatero {
	
	private double lado1;
	private double lado2;
	
	public Cuadrilatero(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public Cuadrilatero(double lado1) {
		this.lado1 = this.lado2= lado1;
	}
	
	public double getPerimetro() {
		double perimetro = (lado1+lado2)*2;
		return perimetro;
	}
	
	public double getArea() {
		double area = lado1+lado2;
		return area;
	}
}
