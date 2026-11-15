public class PersonEj3 {
    private String nombre;
    private double altura;
    private double peso;
    //Constructor sin parámetros
    public PersonEj3(){
        nombre="Fulanito";
        altura=1.70;
        peso=70.0;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setAltura(double altura){
        this.altura=altura;}
    public double getAltura(){
        return altura;
    }


    public void setPeso(double peso){
        this.peso=peso;
    }
    public double getPeso(){
        return peso;
    }
    public double calcularIMC(){
        //Descartamos alturas o pesos inverosímiles (negativos por ejemplo) o equivocaciones en las unidades (altura en cm)
        if(altura<=0||altura>=2.5||peso<=0||peso>=300.0){
            return -1.0; //Para asegurarnos que no divida entre 0
        }
        return peso/(altura*altura);
    }
}
