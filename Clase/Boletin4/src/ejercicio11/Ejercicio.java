package ejercicio11;

import java.util.Scanner;

public class Ejercicio {
	private static Scanner sc;
    
    public static void main(String[] args) {
        int filas, num = 1;
        System.out.print("Introduce el número de líneas del triángulo de Floyd: ");
        sc = new Scanner(System.in);
        filas = sc.nextInt();
        for(int i=1; i<=filas; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

