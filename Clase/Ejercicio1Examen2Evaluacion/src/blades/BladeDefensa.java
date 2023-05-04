package blades;

public class BladeDefensa extends Blade{
	
	private int poderDefensa;

	public BladeDefensa() {
		
	}

	public BladeDefensa(String id, String nombre, String color, String tipo, int poderDefensa) {
		super(id, nombre, color, tipo);
		this.poderDefensa= poderDefensa;
	}

	public int getPoderDefensa() {
		return poderDefensa;
	}

	public void setPoderDefensa(int poderDefensa) {
		this.poderDefensa = poderDefensa;
	}

	@Override
	public void lanzaBlade(int velocidad) {
		this.velocidadGiro = velocidad;
		this.totalPower = (this.velocidadGiro*this.poderDefensa);
		if(totalPower>100) {
			totalPower=100;
		}
		
	}

	@Override
	public void atacarBlade(Blade blade) {
		/*if(this.tipo.equalsIgnoreCase(blade.getTipo())) {
			System.out.println("No podemos luchar entre nosotros. Somos del mismo tipo de Blade");
		}else {
			System.out.println("Comienza el ataque");
			this.totalPower -=15;
			blade.setTotalPower(blade.getTotalPower()-20);
		}*/
		if(blade instanceof BladeDefensa) {
			System.out.println("No podemos luchar entre nosotros. Somos del mismo tipo de Blade");
		}else {
			System.out.println("Comienza el ataque");
			this.totalPower -=15;
			blade.setTotalPower(blade.getTotalPower()-20);
		}
	}

	@Override
	public void mostrarDatosBlade() {
		System.out.println("id: "+id+" nombre: "+nombre+" color: "+color+" tipo: "+tipo+ " poder de defensa: "+poderDefensa
				+" velocidad de giro: "+velocidadGiro+" total de power: "+totalPower);
		
	}
	
	
	
}
