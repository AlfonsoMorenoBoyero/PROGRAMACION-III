public class App2 {
    public static void main(String[] args){
        //Llamamos al método estático pasando los argumentos de la consola
        Usuario user=Usuario.datosUsuario(args);

        if(user==null){
            System.out.println("Error. Parámetros incorrectos. Escriba java App2 \"Nombre\" Peso Altura con datos determinados");
            return;
        }
    //Hacemos la tabla alineada por columnas
    System.out.println("+----------------------+------------+------------+------------+");
        System.out.printf("| %-20s | %-10s | %-10s | %-10s |%n", "NOMBRE", "ALTURA (m)", "PESO (kg)", "IMC");
        System.out.println("+----------------------+------------+------------+------------+");
        System.out.printf("| %-20s | %10.2f | %10.2f | %10.2f |%n", 
                user.getNombre(), 
                user.getAltura(), 
                user.getPeso(), 
                user.calcularIMC());
        System.out.println("+----------------------+------------+------------+------------+");
    }
}
