import java.util.Scanner; // Importamos la herramienta Scanner para leer datos por teclado.

public class CalculoEdad {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario su año de nacimiento.
        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = teclado.nextInt(); // Lee un número entero

        // Pedimos también el año actual
        System.out.print("Introduce el año actual: ");
        int anioActual = teclado.nextInt(); // Lee un número entero

        // Calculamos la edad restando el año de nacimiento al año actual (suponiendo que el usuario ya ha cumplido años este año)
        int edad = anioActual - anioNacimiento;

        // Primero, mostramos el resultado usando System.out.printf
        System.out.printf("Si naciste en el año %d y estamos en el año %d, tu edad es: %d años.%n", 
                          anioNacimiento, anioActual, edad); // %d ahí irá un número entero, y %n es un salto de línea.

        // Segundo, mostramos el resultado usando System.out.println
        System.out.println("Si naciste en el año " + anioNacimiento + " y estamos en el año " + anioActual + ", tu edad es: " + edad + " años.");                  
        
        //Podemos ver la diferencia de sintaxis entre printf y println. En printf usamos %d para indicar que ahí irá un número entero, mientras que en println mezclamos texto con variables usando el operador +.
        //Además, el salto de línea se puede agregar con %n en printf o automáticamente al final de println.

        // Cerramos el scanner por buena práctrica. 
        teclado.close();
    }
}