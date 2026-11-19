package Ejercicio2;


public class CompaniaModel {

    public static final int NUM_ALMACENES = 5;
    public static final int NUM_PRODUCTOS = 2;

    // Filas = almacenes, Columnas = productos
    //Atributos
    private int[][] ventas;
    private double[] precios;
    private double[][] ingresosPorAlmacenYProducto;
    private double[] ingresosTotalesPorAlmacen;
    private double ingresosTotalesCompania;

    // Estado de lectura de datos y cálculos
    private boolean ventasLeidas;
    private boolean preciosLeidos;
    private boolean ingresosCalculados;
    //Constructor
    public CompaniaModel() {
        this.ventas = new int[NUM_ALMACENES][NUM_PRODUCTOS];
        this.precios = new double[NUM_PRODUCTOS];
        this.ingresosPorAlmacenYProducto = new double[NUM_ALMACENES][NUM_PRODUCTOS];
        this.ingresosTotalesPorAlmacen = new double[NUM_ALMACENES];
        this.ingresosTotalesCompania = 0.0;

        this.ventasLeidas = false;
        this.preciosLeidos = false;
        this.ingresosCalculados = false;
    }

    //Setters
    public void setVentas(int[][] nuevasVentas) {
        this.ventas = nuevasVentas;
        this.ventasLeidas = true;
        // Si se modifican las ventas, invalidamos cálculos anteriores
        this.ingresosCalculados = false;
    }

    public void setPrecios(double[] nuevosPrecios) {
        this.precios = nuevosPrecios;
        this.preciosLeidos = true;
        // Si se modifican los precios, invalidamos cálculos anteriores
        this.ingresosCalculados = false;
    }

    public boolean puedeCalcularIngresos() {
        return ventasLeidas && preciosLeidos;
    }

    public boolean puedeMostrarResultados() {
        return ingresosCalculados;
    }

    public boolean isVentasLeidas() {
        return ventasLeidas;
    }

    public boolean isPreciosLeidos() {
        return preciosLeidos;
    }

    public void calcularIngresosTotales() {
        if (!puedeCalcularIngresos()) {
            return;
        }

        ingresosTotalesCompania = 0.0;

        for (int i = 0; i < NUM_ALMACENES; i++) {
            double sumaAlmacen = 0.0;
            for (int j = 0; j < NUM_PRODUCTOS; j++) {
                ingresosPorAlmacenYProducto[i][j] = ventas[i][j] * precios[j];
                sumaAlmacen += ingresosPorAlmacenYProducto[i][j];
            }
            ingresosTotalesPorAlmacen[i] = sumaAlmacen;
            ingresosTotalesCompania += sumaAlmacen;
        }

        this.ingresosCalculados = true;
    }

    // Getters
    public int[][] getVentas() {
        return ventas;
    }

    public double[] getPrecios() {
        return precios;
    }

    public double[][] getIngresosPorAlmacenYProducto() {
        return ingresosPorAlmacenYProducto;
    }

    public double[] getIngresosTotalesPorAlmacen() {
        return ingresosTotalesPorAlmacen;
    }

    public double getIngresosTotalesCompania() {
        return ingresosTotalesCompania;
    }
}
