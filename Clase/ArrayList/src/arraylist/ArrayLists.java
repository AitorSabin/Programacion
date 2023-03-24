package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
		List <Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona(1, "Aitor", 24));
		lista.add(new Persona(2, "Aito", 23));
		lista.add(new Persona(3, "Ait", 22));
		lista.add(new Persona(4, "Ai", 21));
		
		for(int i= 0; i<lista.size(); i++) {
			System.out.println("Prueba "+ lista.get(i).getNombre());
		}
		
		for(Persona personas:lista) {
			System.out.println("Prueba "+ personas.getEdad());
		}
		
	}

}
