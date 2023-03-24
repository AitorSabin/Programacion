package ejercicio6;

public class NumeroComplejo {
	// Ejemplos: 3 + 4i
	private double a;//Parte real
	private double b;//Parte imaginaria
	
	public NumeroComplejo(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public NumeroComplejo calcularSuma(NumeroComplejo c) {
		NumeroComplejo suma = new NumeroComplejo(a+c.getA(),b+c.getB());
		return suma;
	}
	
	public NumeroComplejo calcularMult(NumeroComplejo c) {
		NumeroComplejo mult = new NumeroComplejo((a*c.getA() - b*c.getB()), (a*c.getB()- b*c.getA())); 
		return mult;
	}
	
	public boolean compararIgualdad(NumeroComplejo c) {
		boolean igualdad = false;
		
		if((a==c.getA() && (b==c.getB()))) {
			igualdad = true;
		}
		return igualdad;
	}
	
	
	public NumeroComplejo multPorEntero(int x) {
		NumeroComplejo mult = new NumeroComplejo(a*x,b*x);
		return mult;
	}
}
