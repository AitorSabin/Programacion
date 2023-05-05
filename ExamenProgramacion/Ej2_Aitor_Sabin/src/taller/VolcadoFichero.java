package taller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class VolcadoFichero {

	public VolcadoFichero() {
	}
	 
	public void guardarObjetos(File pathTexto, ArrayList<Vehiculo> vehiculos) throws FileNotFoundException, IOException {
		Vehiculo vehiculo1 = new Vehiculo("1111aaa", "Toyota", "Corolla", 2, 2004);
		vehiculos.add(vehiculo1);
		Vehiculo vehiculo2 = new Vehiculo("2222bbb", "Audi", "A8", 3, 2000);
		vehiculos.add(vehiculo2);
		
		try(ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("\\Volcado/Vehiculos.bin"))){
			dos.writeObject(vehiculo1);
			dos.writeObject(vehiculo2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
