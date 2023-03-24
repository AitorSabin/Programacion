package blade;

public abstract class Blade implements Guerreable {
	
	//Atributos
	protected String id;
	protected String nombre;
	protected String color;
	protected String tipo;
	protected int velocidadGiro;
	protected int totalPower;
	
	//Constructores
	public Blade() {
	}

	public Blade(String id, String nombre, String color, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
		this.velocidadGiro = 0;
		this.totalPower = 0;
	}
	
	//Metodos Abstractos
	public abstract void mostrarDatosBlade();
	
	// Getter y Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVelocidadGiro() {
		return velocidadGiro;
	}

	public void setVelocidadGiro(int velocidadGiro) {
		this.velocidadGiro = velocidadGiro;
	}

	public int getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(int totalPower) {
		this.totalPower = totalPower;
	}

	public void atacarBlade() {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
