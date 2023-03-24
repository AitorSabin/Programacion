package blade;

public class BladeAtaque extends Blade {
	//Atributos
	int poderAtaque;
	
	//Constructores
	public BladeAtaque() {
		super();
	}

	public BladeAtaque(String id, String nombre, String color, String tipo, int poderAtaque) {
		super(id, nombre, color, tipo);
		this.poderAtaque = poderAtaque;
	}
	
	
	//Getters y Setters
	public int getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	@Override
	public void lanzarBlade(int velocidad) {
		setVelocidadGiro(velocidad);
		setPoderAtaque(getVelocidadGiro()*poderAtaque);
	}

	@Override
	public void atacarBlade() {
		// TODO Auto-generated
		
	}

	@Override
	public void mostrarDatosBlade() {
		// TODO Auto-generated method stub
		
	}




	

}
