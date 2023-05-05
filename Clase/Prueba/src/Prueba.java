
public class Prueba {
	public static double operarConMatriz(double[] v, int j, int n) throws Exception {
		try {
			if ((0 <= j) && (j <= v.length)) {
				return (double)v[j];
			} else {
				if(n!=0) {
					return (double)v[3]/n;
				}else throw new RuntimeException("No se puede dividir por 0");
			}
		} catch (Exception exc) {
			throw exc;
		} finally {
			System.out.println("Estoy en el finally.....");
		}
	}

	public static void main(String[] args) {
		double[] v = {1,2,3,4,5,6,7,8};
		int i = 15;
		int j = 0;
		try {
			System.out.println("El valor devuelto por el metodo es: ");
			operarConMatriz(v, i,j);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
