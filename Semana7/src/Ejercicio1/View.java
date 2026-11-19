package Ejercicio1;
import es.usal.progiii.tools.Esdia;

public class View{
    public void mostrarMenu(){
        System.out.println("\nMenú: ");
        System.out.println("1. Leer los números");
        System.out.println("2. Calcular la suma");
        System.out.println("3. Mostrar el resultado");
        System.out.println("q. Salir");
    }
    public int getNumero(String prompt){
        return Esdia.readInt(prompt);
    }
    public String getOpcion(){
        return Esdia.readString_ne("Seleccione una opción: ");
    }
    public void mostrarResultado(int resultado){
        System.out.println("El resultado de la suma es: "+resultado);
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}   
