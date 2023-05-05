package banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CopiaDeSeguridad {

    // Atributos
    private static FileInputStream in;
    private static FileOutputStream out;
    private static Scanner sc = new Scanner(System.in);

    //Contructor Vacio
    public CopiaDeSeguridad(){

    }

    public void hacerCopiaDeSeguridad(File a, File b, ArrayList <Cuenta> c) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter(a,true));

        for (int i = 0; i < c.size();i++){
            bw.write("IBAN: " + (c.get(i)).getIBAN()+ "\n");
            bw.write("Nombre: " +(c.get(i)).getNombreTitular()+ "\n");
            bw.write("Apellidos: " +(c.get(i)).getApellidosTitular()+ "\n");
            bw.write("Saldo: " +(c.get(i)).getSaldo()+ "\n");
        }

        bw.close();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(b,true));
			
        for(int i=0;i<c.size();i++) {
            
            dos.writeUTF((c.get(i)).getIBAN());
            dos.writeUTF((c.get(i)).getNombreTitular());
            dos.writeUTF((c.get(i)).getApellidosTitular());
            dos.writeDouble((c.get(i)).getSaldo());
            
        }
        
        dos.close();
        
        System.out.println("Copia de seguridad realizada con exito.");
    }

    public void mostrarContenido(File a, File b) throws ClassNotFoundException, IOException{

        System.out.println("----ficheroTexto.txt----");

        BufferedReader br = new BufferedReader(new FileReader(a));

        String linea;
        while ((linea = br.readLine()) != null) {

            System.out.println(linea);
        }
        br.close();

        System.out.println("----ficheroBinario.bin----");

        DataInputStream dis = new DataInputStream(new FileInputStream(b));
    
        try {
            while (true) {
                String iba = dis.readUTF();
                String nom = dis.readUTF();
                String ape = dis.readUTF();
                Double sal = dis.readDouble();
                System.out.println("IBAN: "+ iba);
                System.out.println("Nombre: "+ nom);
                System.out.println("Apellidos: "+ ape);
                System.out.println("Saldo: "+ sal);
            }
        } catch (EOFException e) {

        }

    }

    public void crearFichero(File a, File b) throws IOException {
        if (a.exists()){
            a.delete();
        }

        if (b.exists()){
            b.delete();
        }
        
		if (a.createNewFile()) {
			System.out.println("Fichero Creado Correctamente");
		}
        
        if (b.createNewFile()) {
			System.out.println("Fichero Creado Correctamente");
		}
	}

    public void borrarFicheroTxt(File a){

        if (a.exists()){
            a.delete();
        }

    }

     

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String rutaTexto = "./ej2_Diego_Gonzalez/seguridad/ficheroTexto.txt";
        String rutaBinario = "./ej2_Diego_Gonzalez/seguridad/ficheroBinario.bin";
        
        File fichero1 = new File(rutaTexto);
        File fichero2 = new File(rutaBinario);

        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

        Cuenta cuenta1 = new Cuenta("NL76INGB5766671156", "Ali", "Harve", 1000);
        Cuenta cuenta2 = new Cuenta("ES0620955983005493534376", "Narciso", "Francisca", 5000);
        Cuenta cuenta3 = new Cuenta("ES9601823894749955332564", "Miguel Angel", "Adriana", 10000);

       cuentas.add(cuenta1);
       cuentas.add(cuenta2);
       cuentas.add(cuenta3);

       CopiaDeSeguridad copy = new CopiaDeSeguridad();

       copy.crearFichero(fichero1, fichero2);
       copy.hacerCopiaDeSeguridad(fichero1, fichero2, cuentas);
       copy.mostrarContenido(fichero1, fichero2);   
       
       System.out.println("Desea eliminar la copia de texto? " + "Solo aceptara valor * si * de caso contrario saldra del programa." );

       String respuesta;
       respuesta = sc.nextLine();
       
       switch(respuesta){

        case "si" :
        copy.borrarFicheroTxt(fichero1);
        break;

        default:
        System.out.println("Saldra del programa");
        break;
       }

    }
}
