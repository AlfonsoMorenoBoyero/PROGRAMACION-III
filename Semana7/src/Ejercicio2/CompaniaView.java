package Ejercicio2;

import es.usal.progiii.tools.Esdia;

public class CompaniaView {
    // Método para mostrar el menú y leer la opción del usuario
    public String mostrarMenuYLeerOpcion() {
        
        System.out.println("\n=== GESTIÓN DE INGRESOS DE LA COMPAÑÍA ===");
        System.out.println("1.- Leer tabla de ventas");
        System.out.println("2.- Leer tabla de precios");
        System.out.println("3.- Calcular ingresos totales");
        System.out.println("4.- Mostrar resultados");
        System.out.println("q.- Salir");
        return Esdia.readString_ne("Seleccione una opción: ").trim().toLowerCase();
    }

    public int[][] pedirTablaVentas() {
        
        int[][] ventas = new int[CompaniaModel.NUM_ALMACENES][CompaniaModel.NUM_PRODUCTOS];
        System.out.println("\n--- LECTURA DE TABLA DE VENTAS (UNIDADES) ---");

        for (int i = 0; i < CompaniaModel.NUM_ALMACENES; i++) {
            System.out.println("Almacén " + (i + 1) + ":");

            for (int j = 0; j < CompaniaModel.NUM_PRODUCTOS; j++) {
                ventas[i][j] = Esdia.readInt("  Unidades vendidas del Producto " + (j + 1) + ": ", 0, Integer.MAX_VALUE);
            }
        }
        return ventas;
    }

    public double[] pedirTablaPrecios() {
        double[] precios = new double[CompaniaModel.NUM_PRODUCTOS];
        System.out.println("\n--- LECTURA DE TABLA DE PRECIOS ---");
        for (int j = 0; j < CompaniaModel.NUM_PRODUCTOS; j++) {
            precios[j] = Esdia.readDouble("Precio unitario del Producto " + (j + 1) + " (€): ", 0.0, Double.MAX_VALUE);
        }
        return precios;
    }

    public void mostrarResultados(int[][] ventas, double[] precios,
                                  double[][] ingresosDetalle, double[] ingresosAlmacen,
                                  double totalCompania) {
        System.out.println("\n=== RESULTADOS DE INGRESOS ===");
        System.out.printf("Precios unitarios -> Producto 1: %.2f € | Producto 2: %.2f €%n%n",
                precios[0], precios[1]);

        String sep = "+------------+--------------+--------------+----------------+----------------+----------------+";
        System.out.println(sep);
        System.out.printf("| %-10s | %-12s | %-12s | %-14s | %-14s | %-14s |%n",
                "Almacén", "Uds. Prod 1", "Uds. Prod 2", "Ing. Prod 1", "Ing. Prod 2", "Total Almacén");
        System.out.println(sep);

        for (int i = 0; i < CompaniaModel.NUM_ALMACENES; i++) {
            System.out.printf("| Almacén %-2d | %12d | %12d | %12.2f € | %12.2f € | %12.2f € |%n",
                    (i + 1),
                    ventas[i][0],
                    ventas[i][1],
                    ingresosDetalle[i][0],
                    ingresosDetalle[i][1],
                    ingresosAlmacen[i]);
        }
        System.out.println(sep);
        System.out.printf("INGRESOS TOTALES DE LA COMPAÑÍA: %.2f €%n", totalCompania);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}