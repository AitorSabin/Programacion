package batalla;

import blades.Blade;
import blades.BladeAtaque;
import blades.BladeDefensa;

public class BatallaBlade {

	private String idBatalla;
	private String nombreEstadio;
	private Blade blade1;
	private Blade blade2;
	private int[] ordenAtaques;
	
	public BatallaBlade() {
		
	}

	public BatallaBlade(String idBatalla, String nombreEstadio, Blade blade1, Blade blade2) {
		this.idBatalla = idBatalla;
		this.nombreEstadio = nombreEstadio;
		this.blade1 = blade1;
		this.blade2 = blade2;
	}
	
	public void ejecutarLanzamientoBlades(int velocidadBlade1, int velocidadBlade2) {
		this.blade1.lanzaBlade(velocidadBlade1);
		this.blade2.lanzaBlade(velocidadBlade2);
	}
	
	public void establecerOrdenAtaques(int[] ordenAtaques) {
		this.ordenAtaques= ordenAtaques;
	}
	
	public void ejecutarAtaques() {
		this.blade1.mostrarDatosBlade();
		this.blade2.mostrarDatosBlade();
		for(int i=0; i<ordenAtaques.length; i++) {
			System.out.println("****** Ataque "+i+" ********");
			if(ordenAtaques[i]==1) {
				this.blade1.atacarBlade(this.blade2);//blade1 ataca a blade2
			}else if(ordenAtaques[i]==2) {
				this.blade2.atacarBlade(this.blade1);//blade2 ataca a blade1
			}
			this.blade1.mostrarDatosBlade();
			this.blade2.mostrarDatosBlade();
			if(this.blade1.getTotalPower()<=0 || this.blade2.getTotalPower()<=0) {
				break;
			}
		}
	}
	
	public void comprobarGanador() {
		System.out.println("El Blade ganador es: ");
		if(blade1.getTotalPower()>blade2.getTotalPower()) {
			blade1.mostrarDatosBlade();
		}else if(blade2.getTotalPower()>blade1.getTotalPower()){
			blade2.mostrarDatosBlade();
		}else {
			System.out.println("Empate entre los dos Blades");
		}
	}
	
	public static void main(String[] args) {
		Blade bladeAtaque1 = new BladeAtaque("a1", "Tornillo", "Negro", "Ataque", 15);
		Blade bladeDefensa1 = new BladeDefensa("d1", "Destornillador", "Blanco", "Defensa", 14);
		int[] ordenAtaque = {1,2,1,2,1,1,2};
		BatallaBlade batallaBlade1 = new BatallaBlade("b1","Hoth", bladeAtaque1, bladeDefensa1);
		batallaBlade1.ejecutarLanzamientoBlades(13, 5);
		batallaBlade1.establecerOrdenAtaques(ordenAtaque);
		batallaBlade1.ejecutarAtaques();
		batallaBlade1.comprobarGanador();
		System.out.println("");
		Blade bladeAtaque2 = new BladeAtaque("a2", "Tornillo2", "Negro2", "Ataque", 15);
		Blade bladeAtaque3 = new BladeAtaque("a3", "Destornillador3", "Blanco3", "aTaques", 14);
		int[] ordenAtaque2 = {1,2,1,2,1,1,2};
		BatallaBlade batallaBlade2 = new BatallaBlade("b1","Hoth", bladeAtaque2, bladeAtaque3);
		batallaBlade2.ejecutarLanzamientoBlades(13, 5);
		batallaBlade2.establecerOrdenAtaques(ordenAtaque2);
		batallaBlade2.ejecutarAtaques();
		batallaBlade2.comprobarGanador();
	}
}
