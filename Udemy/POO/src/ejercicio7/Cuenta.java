package ejercicio7;

public class Cuenta {
	private double saldo;
	private int idNumeroCuenta;
	
	public Cuenta(double saldo, int numeroCuenta) {
		this.saldo = saldo;
		this.idNumeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
			return saldo;
	}

	public int getIdnumeroCuenta() {
		return idNumeroCuenta;
	}

	public double ingresarDinero(double cantidad) {
			saldo += cantidad;
			return saldo;
	}	
	
	public double retirarDinero(double cantidad) {
			saldo -= cantidad;
			return saldo;
	}
	
}
