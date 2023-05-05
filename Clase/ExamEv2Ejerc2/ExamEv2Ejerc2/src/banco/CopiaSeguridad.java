package banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Clase copia de seguridad.
public class CopiaSeguridad {

	public CopiaSeguridad() {
		// TODO Auto-generated constructor stub
	}

	//Método que hace las copias de seguridad.
	public void hacerCopiaSeguridad(File pathTexto, File pathBin, ArrayList<Cuenta> cuentas) {
		BufferedWriter bw = null;
		DataOutputStream dos = null;

		// recorremos el array list, y vamos guardando los datos en el fichero de texto
		// y en el binario.
		try {
			//para escritura en fichero de texto. Podemos abrir el writter con la opción true para seguir añadiendo a final
			//del ficheo. Si no, cada vez que se escriba, se empieza el fichero.
			bw = new BufferedWriter(new FileWriter(pathTexto,true)); 
			//Lo mismo,para el fichero binario.
			dos = new DataOutputStream(new FileOutputStream(pathBin,true));  

			for (Cuenta ct : cuentas) {
				// guardamos en el fichero de texto.
				bw.write(ct.getIban() + "\n"); // guardamos el iban en el archivo de texto.
				bw.write(ct.getNombreTitular() + "\n"); // guardamos el nombre del titular.
				bw.write(ct.getApellidosTitular() + "\n"); // guardamos los apellidos del titular.
				bw.write(ct.getSaldo() + "\n"); // guardamos el saldo

				// guardamos en el fichero binaro

				dos.writeUTF(ct.getIban());
				dos.writeUTF(ct.getNombreTitular());
				dos.writeUTF(ct.getApellidosTitular());
				dos.writeDouble(ct.getSaldo());
				
			}
		} catch (IOException e) {
			
		} finally {
			//cerramos lo flujos si hay una excepción
			try {
				bw.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}
		
		//cerramos los flujos si la ejecución fue normal.
		if (bw!=null) {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (dos!=null) {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	//Método que recupera los datos de las copias de seguridad y los muestra.
	public void recuperarCopiaSeguridad(File pathTexto, File pathBin) {
		BufferedReader br = null;
		DataInputStream dis = null;
		
		String iban,nombreTitular,apellidosTitular;
		double saldo;
		
		//Recuperamos del fichero de texto y lo mostramos.
		try {
			br = new BufferedReader(new FileReader(pathTexto));
			System.out.println("****- mostramos el contenido del fichero de texto -****");

			while ((iban = br.readLine()) != null) {
				System.out.println("iban: "+ iban);
				nombreTitular = br.readLine();
				System.out.println("nombreTitular" + nombreTitular);
				apellidosTitular=br.readLine();
				System.out.println("apellidosTitular" + apellidosTitular);
				saldo=Double.parseDouble(br.readLine());
				System.out.println(saldo);
				
			}
		} catch (EOFException e) {
			System.out.println("Fin del fichero de texto");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Recuperamos del fichero binario y lo mostramos.
		try {
			dis = new DataInputStream(new FileInputStream(pathBin));
			System.out.println("****- mostramos el contenido del fichero binario -****");
			while (true) {
				System.out.println("iban: "+ dis.readUTF());
				System.out.println("nombreTitular" + dis.readUTF());
				System.out.println("apellidosTitular" + dis.readUTF());
				System.out.println("saldoTitular" + dis.readDouble());
			}
		} catch (EOFException e) {
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (br!=null) {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (dis!=null) {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	//Programa principal
	public static void main(String[] args)  {
		Scanner sc = new Scanner (System.in);
		int opcion;
		String pathTexto = "Seguridad/cuentas.txt";	//Ruta del archivo de texto
		String pathBin = "Seguridad/cuentas.bin";	//Ruta del archivo binario.
		File ftex=new File(pathTexto);
		File fbin = new File(pathBin);
		
		//Comprobamos si los ficheros existen, sino  los creamos.
		if (!ftex.exists()) {
			try {
				if(ftex.createNewFile()) {
					System.out.println ("Fichero de texto creado correctamente");
				}
			} catch (IOException e) {

				System.out.println("Errror al crear el fichero");
			}
		}
		if (!fbin.exists()) {
			try {
				if(fbin.createNewFile()) {
					System.out.println ("Fichero de texto creado correctamente");
				}
			} catch (IOException e) {
				System.out.println("Errror al crear el fichero");
			}
		}
		
		//Creamos un objeto copiaSeguridad.
		CopiaSeguridad cp= new CopiaSeguridad();

		//Creamos un objeto cuentas de tipo ArrayList.
		ArrayList<Cuenta> cuentas = new ArrayList<>();
		Cuenta c1= new Cuenta("C1","Ana","Cepeda Sierra",1520); 		//creamos una cuenta.
		Cuenta c2= new Cuenta("C2","Manuel", "García Rodriguez",652);	//creamos otra cuenta.
		
		//Añadimos las cuentas.
		cuentas.add(c1);cuentas.add(c2);
		cp.hacerCopiaSeguridad(ftex, fbin, cuentas); 	//invocamos al método que hace las copias de seguridad.
		cp.recuperarCopiaSeguridad(ftex, fbin);			//invocamos al método que recupera las copias de seguridad.	
		
		//Lanzamos la pregunta de si deseamos eliminar el fichero de texto.
		System.out.println("Desea eliminar el fichero de texto?? ");
		System.out.println("1. Si");
		System.out.println("2. NO");
		opcion =sc.nextInt();
		
		//Si la respuesta es si, lo eliminamos.
		if (opcion==1) {
			ftex.delete();
			System.out.println("Fichero eliminado");
		}
			

	}

}
