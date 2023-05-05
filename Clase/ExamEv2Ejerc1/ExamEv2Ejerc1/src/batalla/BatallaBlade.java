package batalla;

import blades.*;

//Clase que implementa una batalla entre Blades.
public class BatallaBlade {

	private String idBatalla;
	private String nombreEstadio;
	private Blade blade1;
	private Blade blade2;
	int[] ordenAtaques;

	// Constructor vacio de una batalla
	public BatallaBlade() {

	}

	// Constructor parametrizado de una batalla
	public BatallaBlade(String idBatalla, String nombreEstadio, Blade blade1, Blade blade2) {
		super();
		this.idBatalla = idBatalla;
		this.nombreEstadio = nombreEstadio;
		this.blade1 = blade1;
		this.blade2 = blade2;

	}

	// se procede al lanzamiento de los Blade, pasando su la velocidad
	// respectivamente, del blade1 y del blade2
	// se invocará al método lanzarBlade de cada uno de los blade, ya que calculará
	// el total power de cada uno de los blade
	public void ejecutarLanzamientoBlades(int velBlade1, int velBlade2) {
		blade1.lanzarBlade(velBlade1);
		blade2.lanzarBlade(velBlade1);
	}

	// Método en el que establecemos el orden de los ataques, es decir, quien
	// atacará a quien. Será un array de enteros {1 o 2}
	// por ejemplo si el array es [1,1,2] significará que el blade1 ataca una vez,
	// una segunda vez y luego ataca el blade2.
	public void establecerOrdenAtaques(int[] ordenAtaques) {
		this.ordenAtaques = ordenAtaques;
	}

	// Metodo que ejecuta los ataques en la batalla.
	public void ejecutarAtaques() {
		blade1.mostrarDatosBlade();
		blade2.mostrarDatosBlade();
		for (int i = 0; i < ordenAtaques.length; i++) {
			System.out.println("*********ataque " + (i + 1) + " **************");
			if (ordenAtaques[i] == 1) {
				System.out.println("El Blade considerado el 1 ataca al blade 2");
				blade1.atacarABlade(blade2);
			} else {
				System.out.println("El Blade considerado el 2 ataca al blade 1");
				blade2.atacarABlade(blade1);
			}
			blade1.mostrarDatosBlade();
			blade2.mostrarDatosBlade();
			
			//Si alguno de los dos blades tiene totalPower menor o igual a 0, se sale de la batalla.
			if ((blade1.getTotalPower()<=0)||blade2.getTotalPower()<=0) {
				break;
			}
		}

	}

	//Metodo para comprobar quien ha ganado la partida.
	public void comprobarGanador() {
		if (blade1.getTotalPower() < blade2.getTotalPower()) {
			System.out.println("El Blade 2 ha ganado la partida");

		} else {
			if (blade2.getTotalPower() < blade1.getTotalPower()) {
				System.out.println("El Blade 1 ha ganado la partida");
			} else {
				System.out.println("Ha habido un empate");

			}

		}
	}

	//Método principal donde simulamos las batallas.
	public static void main(String[] args) {

		//Caso de prueba 1, donde los dos blade son de distinto tipo. Uno es un blade ataque y otro un blade defensa.
		System.out.println("****-----Comienza la batalla 1------******");
		BladeDefensa bd1 = new BladeDefensa("BD1", "Guerrero", "Negro", "Defensa", 3); //blade1
		BladeAtaque bd2 = new BladeAtaque("BD2", "Luchador", "Blanco", "Ataque", 4); //blade2
		int[] ordenAtaques = { 2, 2, 1, 2 }; //El orden de ataques se establece de manera manual por medio de este array
		BatallaBlade battle = new BatallaBlade("B1", "Estadio Blade 1", bd1, bd2); // se crea la batalla
		battle.ejecutarLanzamientoBlades(10, 10);     	//Se ejecuta el lanzamiento de los blades.
		battle.establecerOrdenAtaques(ordenAtaques);  	//Se establece el orden de ataquen en la batalla.
		battle.ejecutarAtaques();						//Se ejecutan los ataques.
		battle.comprobarGanador();						//Se comprueba el ganador.
		
		
		//Caso de prueba 2. En este caso. Los blade son de la misma clase.
		System.out.println("****-----Comienza la batalla 2------******");
		BladeDefensa bd3 = new BladeDefensa("BD3", "Pacificador", "Verde", "Defense", 3); //blade3
		BladeDefensa bd4 = new BladeDefensa("BD4", "Armadura", "Azul", "Defense", 4); //blade4
		int[] ordenAtaques2 = { 1, 1, 1, 2 }; //El orden de ataques se establece de manera manual por medio de este array
		BatallaBlade battle2 = new BatallaBlade("B2", "Estadio Blade 2", bd3, bd4); // se crea la batalla
		battle2.ejecutarLanzamientoBlades(10, 10);     	//Se ejecuta el lanzamiento de los blades.
		battle2.establecerOrdenAtaques(ordenAtaques2);  	//Se establece el orden de ataquen en la batalla.
		battle2.ejecutarAtaques();						//Se ejecutan los ataques.
		battle2.comprobarGanador();						//Se comprueba el ganador.
		
		

	}

}
