package Ejercicio2;


public class CompaniaController {
    // Atributos
    private CompaniaModel model;
    private CompaniaView view;

    // Constructor
    public CompaniaController(CompaniaModel model, CompaniaView view) {
        this.model = model;
        this.view = view;
    }
    // Método principal para ejecutar la aplicación
    public void run() {
        String opcion;
        do {
            opcion = view.mostrarMenuYLeerOpcion();

            switch (opcion) {
                
                case "1":
                
                    int[][] ventas = view.pedirTablaVentas();
                    model.setVentas(ventas);
                    view.mostrarMensaje("Tabla de ventas registrada correctamente.");
                    break;

                case "2":
                    double[] precios = view.pedirTablaPrecios();
                    model.setPrecios(precios);
                    view.mostrarMensaje("Tabla de precios registrada correctamente.");
                    break;

                case "3":
                    if (!model.puedeCalcularIngresos()) {
                        view.mostrarMensaje("ERROR: No se pueden calcular los ingresos aún.");
                        if (!model.isVentasLeidas()) {
                            view.mostrarMensaje(" - Falta leer la tabla de ventas (Opción 1).");
                        }
                        if (!model.isPreciosLeidos()) {
                            view.mostrarMensaje(" - Falta leer la tabla de precios (Opción 2).");
                        }
                    } else {
                        model.calcularIngresosTotales();
                        view.mostrarMensaje("Ingresos totales calculados correctamente.");
                    }
                    break;

                case "4":
                    if (!model.puedeMostrarResultados()) {
                        view.mostrarMensaje("ERROR: No hay resultados disponibles para mostrar.");
                        if (!model.puedeCalcularIngresos()) {
                            view.mostrarMensaje(" - Primero debe introducir ventas (Opción 1) y precios (Opción 2).");
                        } else {
                            view.mostrarMensaje(" - Debe ejecutar primero el cálculo de ingresos (Opción 3).");
                        }
                    } else {
                        view.mostrarResultados(
                                model.getVentas(),
                                model.getPrecios(),
                                model.getIngresosPorAlmacenYProducto(),
                                model.getIngresosTotalesPorAlmacen(),
                                model.getIngresosTotalesCompania()
                        );
                    }
                    break;

                case "q":
                    view.mostrarMensaje("Saliendo de la aplicación...");
                    break;

                default:
                    view.mostrarMensaje("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (!opcion.equals("q"));
    }
}
