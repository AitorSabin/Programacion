package blades;

//Clase abstracta Blade que implementa la interface Guerreable.
public abstract class Blade implements Guerreable {
	
	//Atributos
	protected String id;
	protected String nombre;
	protected String color;
	protected String tipo;
	protected int velocidadGiro;
	protected int totalPower;
	
	
	//Constructor vacío
	public Blade() {
		
	}
	
	//Constructor parametrizado
	public Blade(String id, String nombre, String color,String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
		this.velocidadGiro = 0; //velocidad con la que gira en la batalla se inicia a 0
		this.totalPower=0;		//total power en la batalla
			
	}	

	//metodo abstracto que calcula el total del Power del blade
	//Se calcula en función de la velocidad de lanzamiento, en el momento de lanzarlo y un atributo específico de cada uno
	//de los tipos de Blade.
	public abstract void mostrarDatosBlade();
	
	//Getters y setters
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

	public double getVelocidadGiro() {
		return velocidadGiro;
	}

	public void setVelocidadGiro(int velocidadGiro) {
		this.velocidadGiro = velocidadGiro;
	}

	public double getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(int totalPower) {
		this.totalPower = totalPower;
	}
	
	
}
