import es.usal.progiii.tools.Esdia;

public class Ejercicio1_Arrays {
    public static void main(String[] args) {
        final int numeroMaximo = 10;
        Coche[] coches = new Coche[numeroMaximo];
        int numero = 0;
        int opcion;

        do {
            System.out.println("\nCONCESIONARIO");
            System.out.println("Opción 1: Dar de alta un nuevo coche");
            System.out.println("Opción 2: Mirar stock");
            System.out.println("Opción 3: Modificar precio de coche");
            System.out.println("Opción 4: Eliminar un coche");
            System.out.println("Opción 5: Salir");
            opcion = Esdia.readInt("Seleccione una opción: ", 1, 5);

            switch (opcion) {
                case 1:
                    // CREATE. Dar de alta un nuevo coche
                    if (numero < coches.length) {
                        String matricula = Esdia.readString_ne("Introduzca la matrícula: ").toUpperCase();

                        // Comprobamos que no esté repetida
                        boolean existe = false;
                        for (int i = 0; i < numero; i++) {
                            if (coches[i].getMatricula().equalsIgnoreCase(matricula)) {
                                existe = true;
                                break;
                            }
                        }

                        if (existe) {
                            System.out.println("Ya existe un coche con esa matrícula.");
                        } else {
                            String marca = Esdia.readString_ne("Introduzca la marca: ");
                            String modelo = Esdia.readString_ne("Introduzca el modelo: ");
                            double precio = Esdia.readDouble("Introduzca el precio (€): ", 0.0, 1000000.0);

                            coches[numero] = new Coche(matricula, marca, modelo, precio);
                            numero++;
                            System.out.println("Coche dado de alta correctamente.");
                        }
                    } else {
                        System.out.println("El concesionario está lleno (máximo " + numeroMaximo + " coches).");
                    }
                    break;

                case 2:
                    // READ. Mirar stock
                    if (numero == 0) {
                        System.out.println("No hay coches en el stock.");
                    } else {
                        System.out.println("\n+------------+--------------+-----------------+--------------+");
                        System.out.printf("| %-10s | %-12s | %-15s | %-12s |%n",
                                "Matrícula", "Marca", "Modelo", "Precio");
                        System.out.println("+------------+--------------+-----------------+--------------+");
                        for (int i = 0; i < numero; i++) {
                            System.out.println(coches[i]);
                        }
                        System.out.println("+------------+--------------+-----------------+--------------+");
                    }
                    break;

                case 3:
                    // UPDATE. Modificar precio de coche
                    if (numero == 0) {
                        System.out.println("No hay coches en el stock.");
                    } else {
                        String matBuscar = Esdia.readString_ne("Matrícula del coche a modificar: ").toUpperCase();
                        int posicion = -1;
                        for (int i = 0; i < numero; i++) {
                            if (coches[i].getMatricula().equalsIgnoreCase(matBuscar)) {
                                posicion = i;
                                break;
                            }
                        }

                        if (posicion == -1) {
                            System.out.println("No se ha encontrado ningún coche con esa matrícula.");
                        } else {
                            double nuevoPrecio = Esdia.readDouble("Introduzca el nuevo precio (€): ", 0.0, 1000000.0);
                            coches[posicion].setPrecio(nuevoPrecio);
                            System.out.println("Precio modificado correctamente.");
                        }
                    }
                    break;

                case 4:
                    // DELETE. Eliminar un coche
                    if (numero == 0) {
                        System.out.println("No hay coches en el stock.");
                    } else {
                        String matEliminar = Esdia.readString_ne("Matrícula del coche a eliminar: ").toUpperCase();
                        int posicionEliminar = -1;
                        for (int i = 0; i < numero; i++) {
                            if (coches[i].getMatricula().equalsIgnoreCase(matEliminar)) {
                                posicionEliminar = i;
                                break;
                            }
                        }

                        if (posicionEliminar == -1) {
                            System.out.println("No se ha encontrado ningún coche con esa matrícula.");
                        } else {
                            // Desplazamos a la izquierda para no dejar huecos null
                            for (int i = posicionEliminar; i < numero - 1; i++) {
                                coches[i] = coches[i + 1];
                            }
                            coches[numero - 1] = null;
                            numero--;
                            System.out.println("Coche eliminado correctamente.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 5);
    }
}
