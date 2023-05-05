package olimpiadas;

import java.util.ArrayList;
import java.util.Scanner;

import atletas.Velocista;

public class PruebaVelocidad {

	static Scanner sc = new Scanner(System.in);
	
	private String id;
	private ArrayList<Velocista> participantes;
	
	public PruebaVelocidad() {
		
	}

	public PruebaVelocidad(String id, ArrayList<Velocista> participantes) {
		this.id = id;
		this.participantes = participantes;
	}
	
	public void ejecutarPrueba() {
		for (Velocista velocista : participantes) {
			System.out.println("Introduce el tiempo del velocista: "+velocista.getNombre());
			velocista.setTiempoPrueba(sc.nextDouble());
			velocista.actualizarMejorTiempo();
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Velocista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Velocista> participantes) {
		this.participantes = participantes;
	}
	
}
