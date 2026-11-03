import java.util.Scanner; //Para leer datos del teclado

public class Mayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Primero, pedimos al usuario que introduzca los 3 números enteros.
        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = teclado.nextInt();

        // Pensamos ahora en los posibles casos.

        // Primer caso: los 3 números son exactamente iguales
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Los tres números son iguales, y su valor es: " + numero1);
        } 
        // Segundo caso: el primer número es mayor que el segundo y el tercero.
        else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es el primer número, con un valor de: " + numero1);
        } 
        // Tercer caso: el segundo número es mayor que el primer y el tercero
        else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El mayor es el segundo número, con un valor de: " + numero2);
        } 
        // Cuarto caso: el tercer número es mayor que el primer y el segundo.
        else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El mayor es el tercer número, con un valor de: " + numero3);
        } 
        // Quinto caso: hay empates entre dos números como los mayores.
        else if (numero1 == numero2 && numero1 > numero3) {
            System.out.println("El primer y el segundo número están empatados como los mayores, con valor: " + numero1);
        } 
        else if (numero1 == numero3 && numero1 > numero2) {
            System.out.println("El primer y el tercer número están empatados como los mayores, con valor: " + numero1);
        } 
        else if (numero2 == numero3 && numero2 > numero1) {
            System.out.println("El segundo y el tercer número están empatados como los mayores, con valor: " + numero2);
        }

        teclado.close(); // Cerramos el scanner para optimizar recursos.
    }
}
