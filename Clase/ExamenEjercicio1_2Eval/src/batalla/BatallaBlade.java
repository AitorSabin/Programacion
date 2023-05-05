package batalla;

import blades.Blade;
import blades.BladeAtaque;
import blades.BladeDefensa;

public class BatallaBlade {
    
    // Atributos
    String idBatalla;
    String nombreEstadio;
    Blade blade1;
    Blade blade2;
    int [] ordenAtaques;

    // Getters & Setters
    public String getIdBatalla() {
        return idBatalla;
    }

    public void setIdBatalla(String idBatalla) {
        this.idBatalla = idBatalla;
    }

    public String getNombreEstado() {
        return nombreEstadio;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstadio = nombreEstado;
    }

    public Blade getBlade1() {
        return blade1;
    }

    public void setBlade1(Blade blade1) {
        this.blade1 = blade1;
    }

    public Blade getBlade2() {
        return blade2;
    }

    public void setBlade2(Blade blade2) {
        this.blade2 = blade2;
    }

    public int[] getOrdenAtaques() {
        return ordenAtaques;
    }

    public void setOrdenAtaques(int[] ordenAtaques) {
        this.ordenAtaques = ordenAtaques;
    }

    // Constructor Vacio
    public BatallaBlade(){

    }

    // Constructor Parametrizado
    public BatallaBlade(String idBatalla, String nombreEstadio, Blade blade1, Blade blade2) {
        this.idBatalla = idBatalla;
        this.nombreEstadio = nombreEstadio;
        this.blade1 = blade1;
        this.blade2 = blade2;
    }

    // Metodo ejecutarLanzamientoBlades
    public void ejecutarLanzamientoBlades(int a, int b){

        this.blade1.setVelocidadDeGiro(a);
        this.blade2.setVelocidadDeGiro(b);

        blade1.lanzarBlade(blade1.getVelocidadDeGiro());
        blade2.lanzarBlade(blade2.getVelocidadDeGiro());

    }

    // Metodo establecerOrdenAtaques
    public void establecerOrdenAtaques(int[]a){

        this.ordenAtaques = a;

    }

    // Metodo ejecutarAtaques
    public void ejecutarAtaques(){

        blade1.mostrarDatosBlade();
        blade2.mostrarDatosBlade();

        

        for (int i = 0; i< ordenAtaques.length;i++) {

            System.out.println("****** Ataque ! ******* " + i );

            if(ordenAtaques[i] == 1){
                blade1.atacarAblade(blade2);
            }

            if(ordenAtaques[i] == 2){
                blade2.atacarAblade(blade1);
            }
            
            
            if (blade1.getTotalPower() <= 0 || blade2.getTotalPower() <= 0){
                System.out.println("Uno de los Blades no tiene totalPower! \n");
                 break;
            }

        }

    }

    // Metodo comprobarGanador
    public void comprobarGanador(){

        if(blade1.getTotalPower()==blade2.getTotalPower()){
            System.out.println("*****Empate*****");
        }

        if(blade1.getTotalPower()>blade2.getTotalPower()){
            System.out.println("El blade 1 es el ganador con: ");
            blade1.mostrarDatosBlade();
        }else{
            System.out.println("El blade 2 es el ganador con: ");
            blade2.mostrarDatosBlade();
        }

    }

    //Metodo Main
    public static void main(String[] args) {

        //Instanciacion de objetos Blade ataque
        BladeAtaque bladeAtaque1 = new BladeAtaque("ba1", "bladeAtaque1", "Blanco", "Ataque", 10);
        BladeAtaque bladeAtaque2 = new BladeAtaque("ba2", "bladeAtaque2", "Rojo", "Ataque", 5);

        //Instanciacion de objetos Blade defensa
        BladeDefensa bladeDefensa1 = new BladeDefensa("bd1", "bladeDefensa1", "Negro", "Defensa", 15);

        //Instanciacion del array de ataques
        int [] orden = {1,2,1,2,1,1};

        //Instanciacion del objeto batalla1
        BatallaBlade batalla1 = new BatallaBlade("Batalla1", "Bernabeu de BeyBlades", bladeAtaque1, bladeDefensa1);

        //Llamada a metodos
        batalla1.ejecutarLanzamientoBlades(10, 8);

        batalla1.establecerOrdenAtaques(orden);

        batalla1.ejecutarAtaques();

        batalla1.comprobarGanador();


        //Instanciacion del objeto batalla2 para comprobar la comparacion entre clases
        BatallaBlade batalla2 = new BatallaBlade("Batalla2", "Bernabeu de BeyBlades", bladeAtaque1, bladeAtaque2);

        //Llamada a metodos
        batalla2.ejecutarLanzamientoBlades(5, 5);

        batalla2.establecerOrdenAtaques(orden);

        batalla2.ejecutarAtaques();


    }
}
