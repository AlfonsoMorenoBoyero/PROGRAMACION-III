public class Coche {
    //Atributos privados
    private String matricula;
    private String marca;
    private String modelo;
    private double precio;

    //Constructor
    public Coche(String matricula, String marca,String modelo, double precio){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    
    // Método para imprimir el coche en formato fila de tabla
    public String toString() {
        return String.format("| %-10s | %-12s | %-15s | %10.2f € |",
                matricula, marca, modelo, precio);
    }
    

    //Getters
    public String getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getPrecio(){
        return precio;
    }

    //Setters
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
}
