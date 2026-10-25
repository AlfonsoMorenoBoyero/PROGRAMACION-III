// Primero, importamos la clase Scanner para poder leer la entrada del usuario desde el teclado y la clases Refugio, Animal y Cuidador que se encuentran en el paquete modelo.
import java.util.Scanner;
import modelo.Refugio;
import modelo.Animal;
import modelo.Cuidador;
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
                //Si el usuario no introduce correctamente el número, se le pedirá que introduzca un número válido.
                System.out.println("Por favor, introduzca un número válido.");
                scanner.nextLine(); // Volvemos a limpiar la línea
                continue;
            }

            // Con este switch-case, ejecutaremos la opción que el usuario ha elegido. En este commit, solo se muestra un mensaje inicial, que indica al usuario la opción que ha elegido.
            // En los siguientes commits, se incluirá la función completa de cada opción.
            switch (opcion) {
                case 1:
                    //En la opción 1, creamos un nuevo registro.
                    System.out.print("Ingrese la capacidad máxima de animales del refugio: ");
                    int capacidad=scanner.nextInt();
                    scanner.nextLine();
                    //Vamos a exigir que la capacidad sea mayor que 0.
                    if(capacidad<=0){
                        System.out.println("La capacidad debe ser mayor que 0. Por favor, inténtelo de nuevo.");
                    }else{
                        refugio= new Refugio(capacidad);
                        System.out.println("Ha creado con éxito el nuevo refugio, con capacidad para " + capacidad + " animales.");
                    }
                    break;
                case 2:
                    //Para el caso 2, primero exigimos que el refugio haya sido creado, porque el precio del alimento es un atributo de la clase Refugio.
                    if (refugio == null) {
                        System.out.println("Primero debe crear el refugio (Opción 1).");
                    } else {
                        //Vamos a pedir al usuario que inserte el nuevo precio, que se leerá con el scanner, y comprobaremos que sea un valor mayor que 0 (lógicamente el precio no puede ser negativo ni cero)
                        System.out.print("Ingrese el nuevo precio del kilogramo de alimento (en €): ");
                        double nuevoPrecio = scanner.nextDouble();
                        scanner.nextLine();

                        if (nuevoPrecio <= 0) {
                            System.out.println("El precio debe ser un valor positivo mayor que 0. Por favor, inténtelo de nuevo.");
                        } else {
                            refugio.setPrecioAlimento(nuevoPrecio);
                            System.out.println("Precio del alimento actualizado a: " + refugio.getPrecioAlimento() + " €/kg.");
                        }
                    }
                    break;
                case 3:
                    //De nuevo, primero hemos de corroborar y exigir que el refugio haya sido creado.
                    if (refugio == null) {
                        System.out.println("Primero debe crear el refugio (Opción 1).");
                        //Ahora, comprobamos que el refugio no está lleno, o sea que el número de animales que hay registrados en el refugio es menor que la capacidad máxima de este.
                    } else if (refugio.getNumeroAnimales() >= refugio.getAnimales().length) {
                        System.out.println("El refugio está lleno. No se pueden añadir más animales.");
                    } else {
                        //Pasamos a realizar el registro, solicitando al usuario que introduzca los datos del animal y cuidador.
                        System.out.println("\n--- REGISTRO DE NUEVO ANIMAL ---");
                        System.out.print("Nombre del animal: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Especie (Por ejemplo: Perro, Gato,...): ");
                        String especie = scanner.nextLine();

                        System.out.print("Alimento consumido al día (en kg): ");
                        double consumoAlimento = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Peso del animal (en kg): ");
                        double peso = scanner.nextDouble();
                        scanner.nextLine();

                        // Solcitamos los datos del cuidador.
                        System.out.println("\n--- DATOS DEL CUIDADOR ---");
                        System.out.print("Nombre del cuidador: ");
                        String nombreCuidador = scanner.nextLine();

                        System.out.print("Teléfono de contacto: ");
                        String telefonoCuidador = scanner.nextLine();

                        System.out.print("Formación del cuidador (sí/no): ");
                        String respuestaFormacion=scanner.nextLine().toLowerCase();//Así, aunque el usuario escriba "Si", "SI" o "si" se aceptarán por igual.
                        boolean formacion=respuestaFormacion.equals("sí") || respuestaFormacion.equals("si");//En este caso, acepatamos "sí" y "si" (con o sin tilde) como respuesta True, y cualquier otra respuesta como False.

                        //Creamos los objetos Cuidador y Animal con los datos que acabamos de recopilar.
                        Cuidador cuidador = new Cuidador(nombreCuidador, telefonoCuidador, formacion);
                        Animal animal = new Animal(cuidador,nombre, especie, peso, consumoAlimento);

                        //Por último, intentamos añadir el animal al refugio y mostramos por pantalla un mensaje de éxito o error según corresponda.
                        if (refugio.agregarAnimal(animal)) {
                            System.out.println("El animal " + nombre + " ha sido registrado con éxito");
                        } else {
                            System.out.println("Error al registrar el animal.");
                        }
                    }
                    break;
                    //Aquí seguiremos en el commit 4.
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
}//En el siguiente commit seguiremos implementando las funcionalidades de las últimas opciones y si nos da tiempo, añadiremos los comentarios que nos faltaban por poner del primer commit.