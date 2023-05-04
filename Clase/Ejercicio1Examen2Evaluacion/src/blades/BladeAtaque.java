package blades;

public class BladeAtaque extends Blade{
	
	private int poderAtaque;

	public BladeAtaque() {
		
	}

	public BladeAtaque(String id, String nombre, String color, String tipo, int poderAtaque) {
		super(id, nombre, color, tipo);
		this.poderAtaque=poderAtaque;
	}

	public int getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	@Override
	public void lanzaBlade(int velocidad) {
		this.velocidadGiro = velocidad;
		this.totalPower = (this.velocidadGiro*this.poderAtaque);
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
			this.totalPower -=10;
			blade.setTotalPower(blade.getTotalPower()-25);
		}*/
		if(blade instanceof BladeAtaque) {
			System.out.println("No podemos luchar entre nosotros. Somos del mismo tipo de Blade");
		}else {
			System.out.println("Comienza el ataque");
			this.totalPower -=10;
			blade.setTotalPower(blade.getTotalPower()-25);
		}
	}

	@Override
	public void mostrarDatosBlade() {
		System.out.println("id: "+id+" nombre: "+nombre+" color: "+color+" tipo: "+tipo+ " poder de ataque: "+poderAtaque
				+" velocidad de giro: "+velocidadGiro+" total de power: "+totalPower);
		
	}
	
	
	
	

}
