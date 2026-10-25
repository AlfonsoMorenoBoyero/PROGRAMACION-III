//Creamos la clase Animal, que tiene como atributos un cuidador, un nombre, una especie, un peso y un consumo de alimento. 
// Además, tiene un método para calcular el coste del alimento en función del precio del mismo.
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

    //Creamos los métodos getters para poder acceder a los atributos de la clase Animal desde otras clases.
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