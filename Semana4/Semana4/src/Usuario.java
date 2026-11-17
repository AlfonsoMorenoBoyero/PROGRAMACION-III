public class Usuario {
    //Atributos
    private String nombre;
    private double altura;
    private double peso;

    //Constructor con parámetros
    public Usuario(String nombre, double altura,double peso){
        this.nombre=nombre;
        this.altura=altura;
        this.peso=peso;
    }

    //Método estático
    public static Usuario datosUsuario(String[] datos){
        if(datos==null||datos.length!=3){
            System.out.println("Error. Se deben dar 3 datos: nombre, altura y peso.");
            return null;
        }
        try{
            String nombre=datos[0];
            double altura=Double.parseDouble(datos[1]);
            double peso=Double.parseDouble(datos[2]);

            if(altura<=0 || altura>=2.5 || peso<=0 || peso>=300){
                return null;
            }
        return new Usuario(nombre,altura,peso);
        } catch (NumberFormatException e){
            //No hemos podido convertir a número peso o altura
            return null;
        }
    }

    //Método para calcular el IMC
    public double calcularIMC(){
        if(this.altura<=0||this.altura>=2.5||this.peso<=0||this.peso>300){
            return -1.0;
        }
        return this.peso/(this.altura*this.altura);
    }

    //Por último, getters
    public String getNombre(){
        return this.nombre;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getPeso(){
        return this.peso;
    }
}

