package olimpiadas;

import java.util.ArrayList;
import java.util.Scanner;

import atletas.SaltadorLongitud;

public class PruebaSalto {

	static Scanner sc = new Scanner(System.in);
	
	private String id;
	private ArrayList<SaltadorLongitud> participante;
	
	public PruebaSalto() {
		
	}

	public PruebaSalto(String id, ArrayList<SaltadorLongitud> participante) {
		this.id = id;
		this.participante = participante;
	}
	
	public void ejecutarPrueba() {
		for (SaltadorLongitud saltadorLongitud : participante) {
			System.out.println("Introduce el salto de la prueba: "+saltadorLongitud.getNombre());
			saltadorLongitud.setSaltoPrueba(sc.nextDouble());
			saltadorLongitud.actualizarMejorSalto();
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<SaltadorLongitud> getParticipante() {
		return participante;
	}

	public void setParticipante(ArrayList<SaltadorLongitud> participante) {
		this.participante = participante;
	}
	
	
}
