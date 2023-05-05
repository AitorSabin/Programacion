package blades;

//clase BladeAtaque que extiende a la clase Blade
public class BladeAtaque extends Blade {

	private int poderAtaque; //poder de ataque del blade

	// Constructor vacío
	public BladeAtaque() {
	}

	// Constructor Parametrizado
	public BladeAtaque(String id, String nombre, String color, String tipo, int poderAtaque) {
		super(id, nombre, color, tipo);
		this.poderAtaque = poderAtaque;

	}

	// Getters y Setters
	public double getPoderDefensa() {
		return poderAtaque;
	}

	public void setPoderDefensa(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	// Metodo que lanza el Blade y le asigna la velocidad. Además calcula el Power
	// del Blade
	// El power del Blade es el resultado de multiplicar la velocidad de
	// lanzamiento*su poder de ataque.
	// Eso si, no puede superar 100. Si es mayor que 100, se le dará el máximo, es
	// decir, 100
	@Override
	public void lanzarBlade(int velocidad) {
		int power;

		// asignamos el valor al atributo velocidadGiro
		this.velocidadGiro = velocidad;
		// calculamos el totalPower y lo asignamos al Blade.
		power = this.poderAtaque * this.velocidadGiro;
		if (power > 100) {
			this.totalPower = 100;
		} else {
			this.totalPower = power;
		}

	}

	// Define el comportamiento de cuando el blade ataca a otro.
	@Override
	public void atacarABlade(Blade oponente) {
		// TODO Auto-generated method stub
		if (this.getClass() == oponente.getClass()) {
			System.out.println("No podemos luchar entre nosostros, somos el mismo tipo de BLADE");

		} else {
		
				System.out.println("Comienza el ataque");
				// Como el que lanza el ataque es un blade de ataque, hará perder 25 de power a
				// su contrincante y el perdera 10
				this.totalPower = this.totalPower - 10;
				oponente.totalPower = oponente.totalPower - 25;
			
		}
	}

	//Implementación del método abstracto mostrarDatosBlade()
	//Muestra todos los datos del BladeAtaque.
	@Override
	public void mostrarDatosBlade() {

		System.out.println("BladeAtaque [poderAtaque=" + poderAtaque + ", id=" + id + ", nombre=" + nombre + ", color="
				+ color + ", tipo=" + tipo + ", velocidadGiro=" + velocidadGiro + ", totalPower=" + totalPower + "]");
	}

}
