//Creamos la clase Refugio, que tiene como atributos un array de animales, un precio de alimento y un número de animales.
package modelo;
public class Refugio{
    private Animal[] animales;
    private double precioAlimento;
    private int numeroAnimales;

    public Refugio(int capacidad){
        this.animales=new Animal[capacidad];
        this.precioAlimento=3.0;
        this.numeroAnimales=0;
    }
    //Creamos los métodos getters y setters para poder acceder a los atributos de la clase Refugio desde otras clases.
    public Animal[] getAnimales(){
        return animales;
    }
    public double getPrecioAlimento(){
        return precioAlimento;
    }
    public void setPrecioAlimento(double precioAlimento){
        this.precioAlimento=precioAlimento;
    }
    public int getNumeroAnimales(){
        return numeroAnimales;
    }
    //Por último, creamos un método para añadir un animal al refugio, comprobando primero si hay espacio suficiente en el array de animales.
    public boolean agregarAnimal(Animal animal){
        if(numeroAnimales<animales.length){
            animales[numeroAnimales]=animal;
            numeroAnimales++;
            return true;
        }
        return false;
    }
}