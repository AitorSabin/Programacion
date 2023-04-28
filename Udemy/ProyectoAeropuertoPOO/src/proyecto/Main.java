package proyecto;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	final static int num = 4; //Numero Aeropuertos
	static Aeropuerto[] aeropuertos = new Aeropuerto[num];
	
	public static void insertaDatosAeropuerto(Aeropuerto[] aero) {
		aero[0] = new AeropuertoPublico("Barajas", "Madrid", "España", 80000000);
		aero[0].insertarCompañia(new Compañia("AeroMadrid"));
		aero[0].insertarCompañia(new Compañia("AeroRepublica"));
		aero[0].getCompañia("AeroRepublica").insertarVuelo(new Vuelo("IB20", "Madrid", "Mexico", 150.90, 150));
		aero[0].getCompañia("AeroMadrid").insertarVuelo(new Vuelo("IB21", "Madrid", "Buenos Aires", 180.99, 120));
		aero[0].getCompañia("AeroRepublica").insertarVuelo(new Vuelo("FC12", "Madrid", "Londres", 500.90, 180));
		aero[0].getCompañia("AeroRepublica").getVuelo("IB20").insertarPasajero(new Pasajero("Aitor", "12345678D", "Gallego"));
		aero[0].getCompañia("AeroRepublica").getVuelo("IB20").insertarPasajero(new Pasajero("Marcela", "987654321C", "Gallega"));
		aero[0].getCompañia("AeroMadrid").getVuelo("IB21").insertarPasajero(new Pasajero("Aitor", "12345ASDF", "Gallego"));
		
		aero[1] = new AeropuertoPublico("Rosalia", "Ourense", "Galicia", 200000000);
		aero[1].insertarCompañia(new Compañia("AeroGaliza"));
		aero[1].insertarCompañia(new Compañia("AeroRepublicanoGallego"));
		aero[1].getCompañia("AeroGaliza").insertarVuelo(new Vuelo("GZ34", "Ourense", "URSS", 100.90, 250));
		aero[1].getCompañia("AeroRepublicanoGallego").insertarVuelo(new Vuelo("GZ34", "Ourense", "Cuba", 190.99, 100));
		aero[1].getCompañia("AeroGaliza").insertarVuelo(new Vuelo("ZG12", "Ourense", "Holanda", 1100.90, 115));
		aero[1].getCompañia("AeroGaliza").getVuelo("GZ34").insertarPasajero(new Pasajero("Aitor", "12345678D", "Gallego"));
		aero[1].getCompañia("AeroRepublicanoGallego").getVuelo("GZ34").insertarPasajero(new Pasajero("Marcela", "987654321C", "Gallega"));
		aero[1].getCompañia("AeroGaliza").getVuelo("ZG12").insertarPasajero(new Pasajero("Juan", "12345ASDF", "Gallego"));
		
		aero[2] = new AeropuertoPublico("PelotaVasca", "Bilbao", "España", 60000000);
		aero[2].insertarCompañia(new Compañia("AeroBilbao"));
		aero[2].insertarCompañia(new Compañia("Republica"));
		aero[2].getCompañia("Republica").insertarVuelo(new Vuelo("WX99", "Bilbao", "Japon", 150.90, 150));
		aero[2].getCompañia("AeroBilbao").insertarVuelo(new Vuelo("WX98", "Bilbao", "Korea", 180.99, 120));
		aero[2].getCompañia("Republica").insertarVuelo(new Vuelo("ZD45", "Japon", "Londres", 500.90, 180));
		aero[2].getCompañia("Republica").getVuelo("WX99").insertarPasajero(new Pasajero("Antonio", "12345678D", "Gallego"));
		aero[2].getCompañia("Republica").getVuelo("WX99").insertarPasajero(new Pasajero("Pepa", "987654321C", "Gallega"));
		aero[2].getCompañia("AeroBilbao").getVuelo("WX98").insertarPasajero(new Pasajero("Mario", "12345ASDF", "Gallego"));
		
		aero[3] = new AeropuertoPublico("Lennin", "Moscu", "URSS", 180000000);
		aero[3].insertarCompañia(new Compañia("AeroRojo"));
		aero[3].insertarCompañia(new Compañia("MoscuAeroRepublica"));
		aero[3].getCompañia("AeroRojo").insertarVuelo(new Vuelo("SS99", "Moscu", "Alemania", 0.90, 1500));
		aero[3].getCompañia("MoscuAeroRepublica").insertarVuelo(new Vuelo("SS98", "Moscu", "Italia", 80.99, 1200));
		aero[3].getCompañia("AeroRojo").insertarVuelo(new Vuelo("JK95", "Moscu", "Japon", 500.90, 180));
		aero[3].getCompañia("AeroRojo").getVuelo("WX99").insertarPasajero(new Pasajero("Stalin", "12345678S", "Gallego"));
		aero[3].getCompañia("AeroRojo").getVuelo("WX99").insertarPasajero(new Pasajero("Mussolini", "987654321C", "Gallega"));
		aero[3].getCompañia("MoscuAeroRepublica").getVuelo("WX98").insertarPasajero(new Pasajero("Franco", "12345ASDF", "Cagao"));
		
	}
	
	
	public static void main(String[] args) {
		//Insertar datos de los aeropuertos
	}

}
