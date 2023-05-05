package blades;

public class BladeAtaque extends Blade {

    // Atributos
    protected int poderAtaque;


    // Getters & Setters
    public int getPorderAtaque() {
        return poderAtaque;
    }

    public void setPorderAtaque(int porderAtaque) {
        this.poderAtaque = porderAtaque;
    }

    // Constructor Vacio
    public BladeAtaque(){
        
    }

    // Contructor Parametrizado
    public BladeAtaque(String id, String nombre, String color, String tipo, int porderAtaque) {
        super(id, nombre, color, tipo);
        this.poderAtaque = porderAtaque;
    }

    // Sobreescritura del metodo mostrarDatosBlade
    @Override
    public void mostrarDatosBlade() {
       System.out.println("El id de este Blade es: " + this.id);
       System.out.println("El nombre de este Blade es: " + this.nombre);
       System.out.println("El color de este Blade es: " + this.color);
       System.out.println("El tipo de este Blade es: " + this.tipo);
       System.out.println("El poderAtaque de este Blade es: " + this.poderAtaque);
       System.out.println(("El poderTotal de este Blade es: " + this.totalPower));
       System.out.println(" ");
    }


    // Sobreescritura del metodo lanzarBlade
    @Override
    public void lanzarBlade(int vel) {

        this.velocidadDeGiro = vel;

        this.totalPower = velocidadDeGiro * poderAtaque;

        if (this.totalPower > 100){
            this.totalPower = 100;
        } 
        
    }

    // Sobreescritura del metodo atacarAblade
    @Override
    public void atacarAblade(Blade blade) {

        if(blade instanceof BladeAtaque){
            System.out.println("No podemos luchar entre nosotros, somos del mismo tipo de Blade.");
        }else{
            
            System.out.println("Comienza el ataque");
            this.totalPower -= 10;
            blade.totalPower-= 25;

        }
    
    }

    

    
}
