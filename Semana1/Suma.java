import java.util.Scanner; //Importamos la clase Scanner para poder leer datos desde la consola

public class Suma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Creamos un objeto teclado para leer datos desde la consola
       
        //Pedimos el primer número al usuario
        System.out.print("Ingresa el primer número: ");
        int numero1 = teclado.nextInt(); // Guardamos el número entero introducido.

        //Pedimos el segundo número al usuario
        System.out.print("Ingresa el segundo número: ");
        int numero2 = teclado.nextInt(); // Leemos el segundo número entero introducido.

        int suma = numero1 + numero2; // Calculamos la suma

        //Por último, mostramos el resultado de la suma por pantalla
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        teclado.close(); // Y cerramos el objeto teclado
    }
}
