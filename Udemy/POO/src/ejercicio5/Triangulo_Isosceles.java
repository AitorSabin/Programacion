package ejercicio5;

public class Triangulo_Isosceles {
	private double lado;
	private double base;
	private double perimetro;
	private double area;
	
	public Triangulo_Isosceles(double lado, double base) {
		this.lado = lado;
		this.base = base;
	}
	
	public double perimetro() {
		perimetro = (this.lado*this.lado)+this.base;
		return perimetro;
	}
	
	public double area() {
		area = (this.base*Math.sqrt((this.lado*this.lado)-((this.base*this.base)/4)))/2;
		return area;
	}
	
//	public String mostrarDatos() {
//		return "Base: "+this.base+"\nLado: "+this.lado+"\nPerimetro: "+perimetro()+"\nArea: "+area();
//	}
}
