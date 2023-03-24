package matrices;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[][] marco = new int[5][5];
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
//				marco[0][j]=1;
//				marco[4][j]=1;
//				marco[i][4]=1;
//				marco[i][0]=1;
				if(i==0 || i==4) {
					marco[i][j]=1;
				}else if(j==0 || j==4) {
					marco[i][j]=1;
				}else {
					marco[i][j]=0;
				}
			}
		}
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
			System.out.print(marco[i][j]+" ");	
			}
			System.out.println("");
		}

	}

}
