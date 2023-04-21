package ejercicio15;

import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner (System.in);

    public static boolean comprobarLongitud (String a){

        if (a.length() == 9) return true;

        System.out.println("La longitud del dni no es correcta.");
        
        return false;

    }

    public static boolean comprobarLetra (String a){
    
        if (Character.isLetter(a.charAt(a.length()-1))) return true;
        
        System.out.println("No se encuentra una letra en la posicion que corresponde.");
        return false;

    }

    public static boolean comprobarNumeros (String a){

        boolean acum = true;

        for(int i = 0; i < (a.length()-2);i++){

            if (Character.isDigit(a.charAt(i))== false){
                 acum = false; 
                 System.out.println("Los numeros no son correctos.");
            }

        }

        return acum;
        
    }
    
    public static boolean comprobarValidez(String a){

        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";

        String dniString = a.substring(0, a.length()-1);

        int dni = Integer.parseInt(dniString);

        char letraCorrespondiente = tabla.charAt(dni % 23);

        if (a.charAt(a.length()-1) == letraCorrespondiente) return true;

        System.out.println("La letra no concuerda con la correspondiente.");

        return false;
    }

    public static void main(String[] args) {
        
        String dni = sc.nextLine();
        dni = dni.toUpperCase();

        if (comprobarLongitud(dni) && comprobarLetra(dni) && comprobarNumeros(dni) && comprobarValidez(dni)){
            System.out.println("El dni es válido");
        }else{
            System.out.println("El dni no es válido");
        }

    }

}