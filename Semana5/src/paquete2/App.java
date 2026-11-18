package paquete2;
import paquete1.Clase1; //Esta la podemos importar
//import paquete1.Clase2; //Esta nos da error de compilación, the type paquete1.Clase2 is not visible
public class App {
    public static void main(String[] args) throws Exception {
    
        Clase1 objeto1=new Clase1();

        //Intentamos acceder a atributos de Clase1 desde otro paquete
        System.out.println("Atributo público: "+objeto1.atributoPublic);
        //Las tres siguientes dan error de compilación

        // System.out.println(objeto1.atributoDefault);   // Error: not visible (solo mismo paquete)
        // System.out.println(objeto1.atributoProtegido); // Error: not visible (solo mismo paquete o desde subclases)
        // System.out.println(objeto1.atributoPrivado);   // Error: not visible (solo dentro de Clase1)
    }
}
