// Primero, importamos la clase Scanner para poder leer la entrada del usuario desde el teclado y la clase Refugio para gestionar los animales del refugio.
import java.util.Scanner;
import modelo.Refugio;
//Ahora, defnimos la clase principal App, que contiene el método main.
public class App {
    public static void main(String[] args) {
        // Declaramos un objeto Scanner para leer la entrada del usuario, un objeto Refugio para gestionar los animales y una variable opción para guardar la elección del usuario
        Scanner scanner = new Scanner(System.in);
        Refugio refugio = null; //El compilador dice que el valor de la variable local refugio no se ha usado, pero en el commit 3 se usará y ya no dará ese error.
        int opcion = 0;

        // Inicializamos el bucle do-while que mostratá el menú al usuario con las distintas opciones hasta que elija salir.
        do {
            //Estas son las opciones que se mostrarán en el menú princiapl 
            System.out.println("\n=== GESTIÓN DEL REFUGIO ===");
            System.out.println("1. Crear un nuevo registro de animales");
            System.out.println("2. Configurar el precio del alimento por kg");
            System.out.println("3. Añadir un nuevo animal al refugio");
            System.out.println("4. Mostrar información de los animales");
            System.out.println("5. Salir(se borrará toda la información)");
            System.out.print("Seleccione una opción (1-5): ");

            // Leemos la opción que ha elegido el usuario y comprobamos que sea un número válido.
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Con esto limpiamos la línea después de leer el número.
            } else {
                //Si el usuario no introduce correctamente el número, se le pedirá que introduzca un número va´lido.
                System.out.println("Por favor, introduzca un número válido.");
                scanner.nextLine(); // Volvemos a limpiar la línea
                continue;
            }

            // Con este switch-case, ejecutaremos la opción que el usuario ha elegido. En este commit, solo se muestra un mensaje inicial, que indica al usuario la opción que ha elegido.
            // En los siguientes commits, se incluirá la función completa de cada opción.
            switch (opcion) {
                case 1:
                    System.out.println("-> Opción 1 seleccionada (Crear nuevo registro)");
                    break;
                case 2:
                    System.out.println("-> Opción 2 seleccionada (Configurar precio del alimento)");
                    break;
                case 3:
                    System.out.println("-> Opción 3 seleccionada (Añadir animal)");
                    break;
                case 4:
                    System.out.println("-> Opción 4 seleccionada (Mostrar información de los animales)");
                    break;
                case 5:
                    System.out.println("Opción 5 seleccionada. Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Elija un número entre 1 y 5.");
            }

        } while (opcion != 5);
           
        scanner.close(); //Cerramos el scanner para liberar recursos
    }
}//En el siguiente commit seguiremos implementando la funcionalidad de cada opción y si nos da tiempo, añadiremos los comentarios que nos faltaban por poner del primer commit.