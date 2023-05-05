package blades;

//clase BladeDefensa que extiende a la clase Blade
public class BladeDefensa extends Blade {

	private int poderDefensa; // poder de defensa del blade

	// Constructor Vacío
	public BladeDefensa() {

	}

	// Constructor parametrizado
	public BladeDefensa(String id, String nombre, String color, String tipo, int poderDefensa) {
		super(id, nombre, color, tipo);
		this.poderDefensa = poderDefensa;

	}

	// Getters y Setters
	public double getPoderDefensa() {
		return poderDefensa;
	}

	public void setPoderDefensa(int poderDefensa) {
		this.poderDefensa = poderDefensa;
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
		power = this.poderDefensa * this.velocidadGiro;
		if (power > 100) {
			this.totalPower = 100;
		} else {
			this.totalPower = power;
		}
	}

	@Override
	public void atacarABlade(Blade oponente) {
		// TODO Auto-generated method stub
		if (this.getClass() == oponente.getClass()) {
			System.out.println("No podemos luchar entre nosostros, somos el mismo tipo de BLADE");

		} else {

			System.out.println("Comienza el ataque");
			// Como el que lanza el ataque es un blade de defensa, hará perder 20 de power a
			// su contrincante y el perdera 15
			this.totalPower = this.totalPower - 15;
			oponente.totalPower = oponente.totalPower - 20;

		}
	}

	//Implementación del método abstracto mostrarDatosBlade() 
	@Override
	public void mostrarDatosBlade() {
		// TODO Auto-generated method stub
		System.out.println(
				"BladeDefensa [poderDefensa=" + poderDefensa + ", id=" + id + ", nombre=" + nombre + ", color=" + color
						+ ", tipo=" + tipo + ", velocidadGiro=" + velocidadGiro + ", totalPower=" + totalPower + "]");
	}

}
