package modelo;
public class Animal{
    private Cuidador cuidador;
    private String nombre;
    private String especie;
    private double peso;
    private double consumoAlimento;

    public Animal(Cuidador cuidador, String nombre, String especie, double peso, double consumoAlimento){
        this.cuidador=cuidador;
        this.nombre=nombre;
        this.especie=especie;
        this.peso=peso;
        this.consumoAlimento=consumoAlimento;
    }

    public Cuidador getCuidador(){
        return cuidador;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEspecie(){
        return especie;
    }
    public double getPeso(){
        return peso;
    }
    public double getConsumoAlimento(){
        return consumoAlimento;
    }
    public double costeAlimento(double precioAlimento){
        return consumoAlimento*precioAlimento;
    }
}