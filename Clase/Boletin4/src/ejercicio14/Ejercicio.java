package ejercicio14;

public class Ejercicio {

	public static void main(String[] args) {
		int[] ventasAnuales = { 2000, 1000, 30000, 2100 };
		int tiendaMas = ventasAnuales[0];
		int tiendaMenos = ventasAnuales[0];
		int total = ventasAnuales[0];

		for (int i = 1; i < ventasAnuales.length; i++) {
			if (tiendaMas < ventasAnuales[i]) {
				tiendaMas = ventasAnuales[i];
			}
			if (tiendaMenos > ventasAnuales[i]) {
				tiendaMenos = ventasAnuales[i];
			}
			total += ventasAnuales[i];

		}
		System.out.println("La tienda que mas vende es: " + tiendaMas);
		System.out.println("La tienda que menos vende es: " + tiendaMenos);
		System.out.println("El total que venden todas las tiendas es: " + total);
	}

}
