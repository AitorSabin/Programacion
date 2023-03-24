package ejercicio8;

public class Ejercicio {

	public static void main(String[] args) {
		String palabra = "palabra";
		String palabra2 = "Cucu";

		//
		if(palabra.charAt(0)>='A' && palabra.charAt(0)<='Z') {
			System.out.println("La primera letra es mayuscula");
		} else {
			System.out.println("La primera letra NO esta en mayuscula");
		}
		
		//Wrappers
		if(Character.isUpperCase(palabra2.charAt(0))) {
			System.out.println("La primera letra es mayuscula\"");
		} else {
			System.out.println("La primera letra NO esta en mayuscula");
		}
		
		
	}

}
