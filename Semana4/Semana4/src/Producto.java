public class Producto {
    // Constante de clase (static final) para el IVA
    public static final double IVA = 0.21;

    // Atributos de instancia
    private String nombre;
    private double precioSinIva;

    // Constructor
    public Producto(String nombre, double precioSinIva) {
        this.nombre = nombre;
        this.precioSinIva = precioSinIva;
    }

    // Métodos
    public double calcularPrecioConIva() {
        return this.precioSinIva * (1.0 + IVA);
    }

    public double calcularPrecioTotal(double cantidadKg) {
        return calcularPrecioConIva() * cantidadKg;
    }


    // Getters y setter
    public String getNombre() {
        return nombre;
    }

         public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }
    
    
}
