//Creamos la clase Cuidador, que tiene como atributos un nombre, unos apellidos y un booleano que indica si tiene formación o no. 
// //Además, se construye un método para obtener el nombre completo del cuidador.
package modelo;

public class Cuidador{
    private String nombre;
    private String apellidos;
    private boolean formacion;

    public Cuidador(String nombre, String apellidos, boolean formacion){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.formacion=formacion;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public boolean getFormacion(){
        return formacion;
    }

    public String getNombreCompleto(){
        return nombre + " " + apellidos;
    }
}
