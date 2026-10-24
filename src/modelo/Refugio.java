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

    public boolean agregarAnimal(Animal animal){
        if(numeroAnimales<animales.length){
            animales[numeroAnimales]=animal;
            numeroAnimales++;
            return true;
        }
        return false;
    }
}