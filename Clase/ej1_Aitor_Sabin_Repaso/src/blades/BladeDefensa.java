package blades;

public class BladeDefensa extends Blade {

    // Atributos
    protected int poderDefensa;

    // Getters & Setters
    public int getPoderDefensa() {
        return poderDefensa;
    }

    public void setPoderDefensa(int poderDefensa) {
        this.poderDefensa = poderDefensa;
    }

    // Constructor Vacio
    public BladeDefensa() {
    }

    // Contructor Parametrizado
    public BladeDefensa(String id, String nombre, String color, String tipo, int poderDefensa) {
        super(id, nombre, color, tipo);
        this.poderDefensa = poderDefensa;
    }

    @Override
    public void lanzarBlade(int vel) {

        this.velocidadDeGiro = vel;

        this.totalPower = velocidadDeGiro * poderDefensa;

        if (this.totalPower > 100) {
            this.totalPower = 100;
        }

    }

    @Override
    public void atacarAblade(Blade a) {

        if(a instanceof BladeDefensa){
            System.out.println("No podemos luchar entre nosotros, somos del mismo tipo de Blade.");
        }else{
            
            System.out.println("Comienza el ataque");
            this.totalPower -= 15;
            a.totalPower-= 20;

        }
    
    }

    @Override
    public void mostrarDatosBlade() {
        System.out.println("El id de este Blade es: " + this.id);
        System.out.println("El nombre de este Blade es: " + this.nombre);
        System.out.println("El color de este Blade es: " + this.color);
        System.out.println("El tipo de este Blade es: " + this.tipo);
        System.out.println("El poderDefensa de este Blade es: " + this.poderDefensa);
        System.out.println(("El poderTotal de este Blade es: " + this.totalPower));
        System.out.println(" ");
    }

}
