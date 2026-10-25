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
                   
                case 4:
                    //Primero, avisamos al usuario si antes de pulsar la opción 1 ha pulsado esta, es decir, si no ha creado todavía un registro.
                    //Además, le apercibimos si no hay animales registrados para no hacer divisiones por cero ni mostrar una tabla vacía.
                    if (refugio == null) {
                        System.out.println("Primero debe crear el refugio (Opción 1).");
                    } else if (refugio.getNumeroAnimales() == 0) {
                        System.out.println("No hay animales registrados aún en el refugio.");
                    } else {
                        //Ahora, preparamos las variables necesarias.
                       Animal[] lista = refugio.getAnimales();
                       int n = refugio.getNumeroAnimales(); //Recuperamos el array de animales y el número de ellos registrados en el refugio.

                       double costeTotal = 0.0;
                       double sumaPesos = 0.0; //Van a ser dos acumuladores, a los que iremos sumando el coste de cada animal y su peso, para luego calcular la media de peso.
                       //Recorremos el array de animales y vamos sumando el coste diario de cada animal y su peso.
                       for (int i = 0; i < n; i++) {
                       costeTotal += lista[i].costeAlimento(refugio.getPrecioAlimento());
                       sumaPesos += lista[i].getPeso();
                    }

                       double pesoMedio = sumaPesos / n;
                       
                       //Comensamos la tabla, dibujando la cabecera y los títulos de las columnas.
                       System.out.printf("%n|-----------------------------------------------------------------------------------------|%n");
                       System.out.printf("| %-87s |%n", "ANIMALES DEL REFUGIO"); //Esto centra el título de la tabla, que ocupa 87 caracteres, y lo coloca entre dos barras verticales.
                       System.out.printf("|-----------------------------------------------------------------------------------------|%n");
                       System.out.printf("| %-10s | %-10s | %-18s | %-9s | %-9s | %-10s | %-9s |%n", //este printf nos permite alinear los títulos de las columnas y establecer un ancho fijo para cada una de ellas.
                       "Nombre", "Especie", "Cuidador", "Formación", "Peso (kg)", "Consumo kg", "Coste EUR");
                       System.out.printf("|-----------------------------------------------------------------------------------------|%n");
                    
                      //Vamos a escribir ahora las filas, en las que cada una es un animal, y vamos a mostrar sus datos alineados con los títulos de las columnas.
                       for (int i = 0; i < n; i++) {
                       Animal a = lista[i];
                       double costeAnimal = a.costeAlimento(refugio.getPrecioAlimento());
                       String formacionTexto = a.getCuidador().getFormacion() ? "Sí" : "No";

                       System.out.printf("| %-10s | %-10s | %-18s | %-9s | %-9.2f | %-10.2f | %-9.2f |%n",
                       a.getNombre(),
                       a.getEspecie(),
                       a.getCuidador().getNombreCompleto(),
                       formacionTexto,
                       a.getPeso(),
                       a.getConsumoAlimento(),
                       costeAnimal);
                          }
                       
                       //Por último, mostramos los dos datos finales, el coste total de alimentación y el peso medio de los animales, y cerramos la tabla.
                       System.out.printf("|-----------------------------------------------------------------------------------------|%n");
                       System.out.printf("| Coste diario total de alimentación: %.2f EUR |%n", costeTotal);
                       System.out.printf("| Peso medio de los animales: %.2f kg  |%n", pesoMedio);
                       System.out.printf("|-----------------------------------------------------------------------------------------|%n%n");
                        }
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
}//Nos falta detallar más los comentarios y comprobar si todo el código está correcto.