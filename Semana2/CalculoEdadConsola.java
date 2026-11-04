import java.io.Console; // Primero, importamos la clase Console

public class CalculoEdadConsola {
    public static void main(String[] args) {
        // Obtenemos la consola del sistema
        Console consola = System.console();

        // Comprobamos que la consola esté disponible
        if (consola == null) {
            System.out.println("No se puede obtener la consola. Ejecuta el programa directamente desde la terminal (no desde el RUN de VSCode).");
            return;
        }

        // Como antes, primero pedimos al usuario su año de nacimiento (consola.readLine devuelve un String, que necesitamos transformar en entero)
        String textoNacimiento = consola.readLine("Introduce tu año de nacimiento: ");
        
        // Convertimos el String a un entero usando la Wrapper Class (clase envoltorio) de Integer
        int anioNacimiento = Integer.parseInt(textoNacimiento);

        // Y como antes le pedimos al usuario el año actual (nos devolverá un string)
        String textoAnioActual = consola.readLine("Introduce el año actual: ");
        
        // Convertimos el String a entero usando Integer.parseInt
        int anioActual = Integer.parseInt(textoAnioActual);

        // Calculamos la edad restando los enteros.
        int edad = anioActual - anioNacimiento;

        // Por último, mostramos el resultado usando consola.printf (que funciona igual que System.out.printf)
        consola.printf("Si naciste en el año %d y estamos en el año %d, tu edad es: %d años.%n", 
                       anioNacimiento, anioActual, edad);
    }
}
//Podemos ver que podemos correr este programa desde VSCode, debido a que en nuestra extensión de Java la consolo de VSCode está disponible.Pero en otros entornos de desarrollo, la consola no está disponible y nos dará un error. Por eso, es recomendable ejecutar este programa desde la terminal del sistema operativo.