
public class Alumno {
    
    //Atributos 
    private String nombre;
    private double parcial1;
    private double parcial2;
    private double examenFinal;
    
    //Constructor
    public Alumno(String nombre, double parcial1, double parcial2,double examenFinal){
        this.nombre=nombre;
        this.parcial1=parcial1;
        this.parcial2=parcial2;
        this.examenFinal=examenFinal;
    }

    //Métodos
    public double calcularNotaFinal(){
        return(this.parcial1*0.1)+(this.parcial2*0.1)+(this.examenFinal*0.8);
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    public double getParcial1(){
        return parcial1;
    }
    public double getParcial2(){
        return parcial2;
    }
    public double getExamenFinal(){
        return examenFinal;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setParcial1(double parcial1){
        this.parcial1=parcial1;
    }
    public void setParcial2(double parcial2){
        this.parcial2=parcial2;
    }
    public void setExamenFinal(double examenFinal){
        this.examenFinal=examenFinal;
    }

}   

