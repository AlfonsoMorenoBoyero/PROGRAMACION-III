import es.usal.progiii.tools.Esdia;


public class Fruteria {
    public static void main(String[] args) {
        // Array de productos
        Producto[] productos = new Producto[2];
        productos[0] = new Producto("Peras", 0.0);
        productos[1] = new Producto("Manzanas", 0.0);

        System.out.println("=== INICIO ===");

        // Pedimos al tendero el precio/kg sin IVA al comenzar el día
        for (int i = 0; i < productos.length; i++) {
            double precio = Esdia.readDouble(
                "Introduzca el precio/kg SIN IVA para " + productos[i].getNombre() + " (€): ", 
                0.01, 1000.0
            );
            productos[i].setPrecioSinIva(precio);
        }

        // Bucle continuo de atención a clientes
        int numeroCliente = 1;
        boolean continuarJornada;

        do {
            System.out.println("\n--- ATENDIENDO AL CLIENTE Nº " + numeroCliente + " ---");
            
            // Array paralelo para guardar los kilos que compra este cliente de cada fruta
            double[] cantidadesKg = new double[productos.length];

            for (int i = 0; i < productos.length; i++) {
                cantidadesKg[i] = Esdia.readDouble(
                    "Cantidad de " + productos[i].getNombre() + " (kg): ", 
                    0.0, 500.0
                );
            }

            // Ticket en formato de tabla
            double totalFactura = 0.0;
            String separador = "+--------------+------------+------------------+-----------------+";

            System.out.println("\n" + separador);
            System.out.println(String.format("| %-62s |", "TICKET DE COMPRA - CLIENTE Nº " + numeroCliente));
            System.out.println(separador);
            System.out.println(String.format("| %-12s | %10s | %16s | %15s |", 
                    "Fruta", "Cant. (kg)", "Precio/kg c/IVA", "Total (EUR)"));
            System.out.println(separador);

            for (int i = 0; i < productos.length; i++) {
                double precioKgConIva = productos[i].calcularPrecioConIva();
                double totalFruta = productos[i].calcularPrecioTotal(cantidadesKg[i]);
                totalFactura += totalFruta;

                System.out.println(String.format("| %-12s | %10.2f | %16.2f | %15.2f |",
                        productos[i].getNombre(),
                        cantidadesKg[i],
                        precioKgConIva,
                        totalFruta));
            }

            System.out.println(separador);
            System.out.println(String.format("| %-62s |", 
                    String.format("TOTAL FACTURA (IVA %.0f%% incl.): %.2f EUR", Producto.IVA * 100, totalFactura)));
            System.out.println(separador + "\n");

            // Incrementamos el contador de cliente para el siguiente ticket
            numeroCliente++;

            // Preguntamos al tendero si quiere atender a otro cliente o salir
            continuarJornada = Esdia.yesOrNo("¿Desea atender a otro cliente? (sí/no): ");

        } while (continuarJornada);

        System.out.println("\nJornada finalizada. ¡Hasta mañana!");
    }
}