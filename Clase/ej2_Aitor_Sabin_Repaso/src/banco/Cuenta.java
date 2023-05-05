package banco;

public class Cuenta {
    
    //Atributos
    private String IBAN;
    private String nombreTitular;
    private String apellidosTitular;
    private double saldo;

    //Getters & Setters
    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String iBAN) {
        IBAN = iBAN;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public void setApellidosTitular(String apellidosTitular) {
        this.apellidosTitular = apellidosTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Constructor Vacio
    public Cuenta(){

    }

    //Contructor Parametrizado
    public Cuenta(String iBAN, String nombreTitular, String apellidosTitular, double saldo) {
        this.IBAN = iBAN;
        this.nombreTitular = nombreTitular;
        this.apellidosTitular = apellidosTitular;
        this.saldo = saldo;
    }

 
    // Sobreescritura del metodos to string para sacar los datos de la cuenta cuando sea necesario
    @Override
    public String toString() {
        
        System.out.println( "El IBAN de la cuenta es :" + this.IBAN);
        System.out.println( "El nombre del titular de la cuenta es :" + this.IBAN);
        System.out.println( "Los apellidos del titular de la cuenta es:" + this.IBAN);
        System.out.println( "El saldo de la cuenta es de :" + this.IBAN);

        return super.toString();

    }




}
