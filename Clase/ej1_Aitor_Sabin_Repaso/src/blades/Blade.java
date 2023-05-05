package blades;

public abstract class Blade implements Guerreable {

    // Atributos
    protected String id;
    protected String nombre;
    protected String color;
    protected String tipo;
    protected int velocidadDeGiro;
    protected int totalPower;
    
    

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidadDeGiro() {
        return velocidadDeGiro;
    }

    public void setVelocidadDeGiro(int velocidadDeGiro) {
        this.velocidadDeGiro = velocidadDeGiro;
    }

    public int getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(int totalPower) {
        this.totalPower = totalPower;
    }

    // Constructor vacio
    public Blade() {
    }
    
    // Contructor parametrizado
    public Blade(String id, String nombre, String color, String tipo) {

        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;

    }

    // Metodo Abstracto
    public abstract void mostrarDatosBlade();


    
}
