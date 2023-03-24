package ejercicio6;

public class Examen {

	public Examen() {
	
	}
	public static double acceso_por_indice(double[] v, int j) throws RuntimeException{
		try {
			if((0<=j) && (j <= v.length)) {
				return v[j];
			}else {
				throw new RuntimeException("El indice " +j+ " no existe en el vector");
			}
		}catch(RuntimeException exc) {
			throw exc;
		}
		finally {
			System.out.println("Mensaje del finally");
		}
	}
	public static void main(String[] args) {
		double[] v= new double[15];
		try {
			acceso_por_indice(v, 16);
		}catch(Exception e) {
			System.out.println("He fallado " + e.getMessage());
		}

	}

}
