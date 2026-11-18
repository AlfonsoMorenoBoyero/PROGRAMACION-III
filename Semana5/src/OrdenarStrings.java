import java.util.Arrays;
import es.usal.progiii.tools.Esdia;

public class OrdenarStrings {
    public static void main(String[] args) {

        //Creamos el array para almacenar 5 cadenas de texto
        String[] palabras = new String[5];

        // Solicitamos los 5 Strings al usuario
        System.out.println("ORDENACIÓN DE 5 TEXTOS");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = Esdia.readString_ne("Introduzca el texto " + (i + 1) + ": ");
        }

        Arrays.sort(palabras);

        System.out.println("\nTextos ordenados alfabéticamente");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}