package Ejercicio1;
public class Model {
    private int numero1;
    private int numero2;
    private int suma;

    public void calcularSuma(){
        this.suma=this.numero1+this.numero2;
    }

    //Getters
    public int getNumero1(){
        return numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    public int getSuma(){
        return suma;
    }

    //Setters
    public void setNumero1(int numero1){
        this.numero1=numero1;
    }
    public void setNumero2(int numero2){
        this.numero2=numero2;
    }
    public void setSuma(int suma){
        this.suma=suma;
    }
}   
