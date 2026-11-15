public class PersonEj2 {

    private String nombre;
    private double altura;
    private double peso;
    //Constructor sin parámetros
    public PersonEj2(){
        nombre="Fulanito";
        altura=1.70;
        peso=70.0;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;}
    public String getNombre(){
        return nombre;}

    public void setAltura(double altura){
        this.altura=altura;}
    public double getAltura(){
        return altura;}


    public void setPeso(double peso){
        this.peso=peso;}
    public double getPeso(){
        return peso;}

}
