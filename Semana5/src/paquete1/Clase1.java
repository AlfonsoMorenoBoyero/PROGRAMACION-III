package paquete1;
public class Clase1{

    //4 atributos con los 4 niveles de visibilidad
    public int atributoPublic;
    int atributoDefault;
    protected int atributoProtected;
    private int atributoPrivate;

    //4 métodos con los 4 niveles de visibilidad
    public void metodoPublic(){
        System.out.println("Método public");
    }
    void metodoDefault(){
        System.out.println("Método default");
    }
    protected void metodoProtected(){
        System.out.println("Método protected");
    }
    private void metodoPrivate(){
        System.out.println("Método private");
    }
}