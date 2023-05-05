package olimpiadas;

import java.util.ArrayList;

import atletas.Atleta;
import atletas.SaltadorLongitud;
import atletas.Velocista;

public class JordanaOlimpica implements GestionPruebas{

	private PruebaVelocidad pruebaVelocidad;
	private PruebaSalto pruebaSalto;
	
	public JordanaOlimpica() {
		
	}

	@Override
	public void distribuirAtletas(ArrayList<Atleta> atletas) {
		ArrayList<Velocista> velocistas = new ArrayList<Velocista>();
		ArrayList<SaltadorLongitud> saltadorLongitud = new ArrayList<SaltadorLongitud>();
		for (Atleta atleta : atletas) {
			if(atleta instanceof Velocista) {
				velocistas.add((Velocista) atleta);
				pruebaVelocidad = new PruebaVelocidad("PruebaVelocidad1", velocistas);
			}
			if(atleta instanceof SaltadorLongitud) {
				saltadorLongitud.add((SaltadorLongitud) atleta);
				pruebaSalto = new PruebaSalto("PruebaSalto1", saltadorLongitud);
			}
		}	
	}
	
	public static void main(String[] args) {
		JordanaOlimpica jordana1 = new JordanaOlimpica();
		
		ArrayList<Atleta> registroAtletas = new ArrayList<Atleta>();
		
		Velocista velocista1 = new Velocista("Aitor", "Sabin Prol", "Galicia", 1998, 9.8);
		registroAtletas.add(velocista1);
		Velocista velocista2 = new Velocista("Juan", "Estevez Blanco", "Galicia", 1989, 10.8);
		registroAtletas.add(velocista2);
		SaltadorLongitud saltador1 = new SaltadorLongitud("Aitor", "Prol Sabin", "Galiza", 1999, 14.3);
		registroAtletas.add(saltador1);
		SaltadorLongitud saltador2 = new SaltadorLongitud("Francisco", "Matamoros Gallardo", "Spain", 1971, 10.3);
		registroAtletas.add(saltador2);
		
		jordana1.distribuirAtletas(registroAtletas);
		
		jordana1.pruebaVelocidad.ejecutarPrueba();
		jordana1.pruebaSalto.ejecutarPrueba();
		
		
		for (Atleta atleta : registroAtletas) {
			System.out.println("");
			System.out.print(atleta.mostrarDatosAtleta());
			System.out.print(atleta.mostrarDatosDeportivos());
			System.out.println("");
		}
	}
}
