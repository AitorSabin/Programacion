package ejercicio16;

public class Ejercicio {

	public static void main(String[] args) {
		int[][] tablero = new int[8][8];
		
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero.length; j++) {
				if((i+j)%2==0) {
					tablero[i][j] = 0;
				}else {
					tablero[i][j]=1;
				}
			}
		}
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero.length; j++) {
			System.out.print("["+tablero[i][j]+"]");
			}
			System.out.println("");
		}
	}

}
