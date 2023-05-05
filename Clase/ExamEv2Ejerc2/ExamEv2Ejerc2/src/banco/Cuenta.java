package banco;

//Clase cuenta que representa una cuenta bancaria con sus datos.
public class Cuenta {
	
	private String iban;
	private String nombreTitular;
	private String apellidosTitular;
	private double saldo;

	// Constructor vacio
	public Cuenta() {
		
	}

	//Constructor con parámetros
	public Cuenta(String iban, String nombreTitular, String apellidosTitular, double saldo) {
		super();
		this.iban = iban;
		this.nombreTitular = nombreTitular;
		this.apellidosTitular = apellidosTitular;
		this.saldo = saldo;
	}

	//Métodos getter y setter.
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getApellidosTitular() {
		return apellidosTitular;
	}

	public void setApellidosTitular(String apellidosTitular) {
		this.apellidosTitular = apellidosTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Sobrescritura del método toString para mostrar los datos.
	@Override
	public String toString() {
		return "Cuenta [iban=" + iban + ", nombreTitular=" + nombreTitular + ", apellidosTitular=" + apellidosTitular
				+ ", saldo=" + saldo + "]";
	}
	
	
	

}
