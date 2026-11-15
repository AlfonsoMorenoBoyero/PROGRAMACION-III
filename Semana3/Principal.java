import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        PersonEj3 persona1=new PersonEj3();
        PersonEj3 persona2=new PersonEj3();
        PersonEj3 persona3=new PersonEj3();

        //Comprobamos que tenemos unos valores por defecto en el constructor
        System.out.println("Por defecto, tenemos que "+persona1.getNombre()+" mide "+persona1.getAltura()+" m y pesa "+persona1.getPeso()+" kg");


        //PERSONA 1
        System.out.println("Introduzca el nombre de la primera persona: ");
        persona1.setNombre(sc.nextLine());
       
        System.out.println("Introduzca la altura de la primera persona (en metros): ");
        persona1.setAltura(Double.parseDouble(sc.nextLine()));
        
        System.out.println("Introduzca el peso de la primera persona (en kilogramos): ");
        persona1.setPeso(Double.parseDouble(sc.nextLine()));

        System.out.println("El nombre de la primera persona es: " + persona1.getNombre());
        System.out.println("La altura de la primera persona es: " + persona1.getAltura());
        System.out.println("El peso de la primera persona es: " + persona1.getPeso());
        
        if(persona1.calcularIMC()==-1.0){
            System.out.println("No se ha podido calcular el IMC");
        }
        else{
            System.out.println("El IMC de "+persona1.getNombre()+" es "+persona1.calcularIMC());
        }

        //PERSONA 2
        System.out.println("Introduzca el nombre de la segunda persona: ");
        persona2.setNombre(sc.nextLine());

        System.out.println("Introduzca la altura de la segunda persona: ");
        persona2.setAltura(Double.parseDouble(sc.nextLine()));
        
        System.out.println("Introduzca el peso de la segunda persona: ");
        persona2.setPeso(Double.parseDouble(sc.nextLine()));
        
        System.out.println("El nombre de la segunda persona es: " + persona2.getNombre());
        System.out.println("La altura de la segunda persona es: " + persona2.getAltura());
        System.out.println("El peso de la segunda persona es: " + persona2.getPeso());

        if(persona2.calcularIMC()==-1.0){
            System.out.println("No se ha podido calcular el IMC");
        }
        else{
            System.out.println("El IMC de "+persona2.getNombre()+" es "+persona2.calcularIMC());
        }

        //PERSONA 3
        System.out.println("Introduzca el nombre de la tercera persona: ");
        persona3.setNombre(sc.nextLine());

        System.out.println("Introduzca la altura de la tercera persona: ");
        persona3.setAltura(Double.parseDouble(sc.nextLine()));

        System.out.println("Introduzca el peso de la tercera persona: ");
        persona3.setPeso(Double.parseDouble(sc.nextLine()));

        System.out.println("El nombre de la tercera persona es: " + persona3.getNombre());
        System.out.println("La altura de la tercera persona es: " + persona3.getAltura());
        System.out.println("El peso de la tercera persona es: " + persona3.getPeso());

        if(persona3.calcularIMC()==-1.0){
            System.out.println("No se ha podido calcular el IMC");
        }
        else{
            System.out.println("El IMC de "+persona3.getNombre()+" es "+persona3.calcularIMC());
        }

        //Veamos ahora quién es el más alto y quién es el que más pesa (podríamos haber creado variables locales y hubiera sido una notación menos pesada)

        //Primero, contemplamos la posibilidad del triple empate
        if(persona1.getAltura()==persona2.getAltura()&&persona1.getAltura()==persona3.getAltura()){
            System.out.println(persona1.getNombre()+", "+persona2.getNombre()+" y "+persona3.getNombre()+" miden lo mismo, "+persona1.getAltura()+" m");
        }

        //Ahora, las posibilidades de empate simple
        else if(persona1.getAltura()==persona2.getAltura()&&persona1.getAltura()>persona3.getAltura()){
            System.out.println(persona1.getNombre()+" y "+persona2.getNombre()+" son los más altos, con "+persona1.getAltura()+" m");
        }

        else if(persona1.getAltura()==persona3.getAltura()&&persona1.getAltura()>persona2.getAltura()){
            System.out.println(persona1.getNombre()+" y "+persona3.getNombre()+" son los más altos, con "+persona1.getAltura()+" m");
        }


        else if(persona2.getAltura()==persona3.getAltura()&&persona2.getAltura()>persona1.getAltura()){
            System.out.println(persona2.getNombre()+" y "+persona3.getNombre()+" son los más altos, con "+persona2.getAltura()+" m");
        }

        else if(persona1.getAltura()>persona2.getAltura() && persona1.getAltura()>persona3.getAltura()){
            System.out.println("La persona más alta es "+persona1.getNombre()+", con: " + persona1.getAltura()+" m");
        }
        else if(persona2.getAltura()>persona3.getAltura()){
            System.out.println("La persona más alta es "+persona2.getNombre()+", con: "+persona2.getAltura()+" m");
        }
        else {
            System.out.println("La persona más alta es "+persona3.getNombre()+", con: "+persona3.getAltura()+" m");
        }



        //Vamos con el peso:
        if(persona1.getPeso()==persona2.getPeso()&&persona1.getPeso()==persona3.getPeso()){
            System.out.println(persona1.getNombre()+", "+persona2.getNombre()+" y "+persona3.getNombre()+" pesan lo mismo, "+persona1.getPeso()+" kg");
        }

        //Ahora, las posibilidades de empate simple
        else if(persona1.getPeso()==persona2.getPeso()&&persona1.getPeso()>persona3.getPeso()){
            System.out.println(persona1.getNombre()+" y "+persona2.getNombre()+" son los que más pesan, con "+persona1.getPeso()+" kg");
        }

        else if(persona1.getPeso()==persona3.getPeso()&&persona1.getPeso()>persona2.getPeso()){
            System.out.println(persona1.getNombre()+" y "+persona3.getNombre()+" son los que más pesan, con "+persona1.getPeso()+" kg");
        }


        else if(persona2.getPeso()==persona3.getPeso()&&persona2.getPeso()>persona1.getPeso()){
            System.out.println(persona2.getNombre()+" y "+persona3.getNombre()+" son los que más pesan, con "+persona2.getPeso()+" kg");
        }

        else if(persona1.getPeso()>persona2.getPeso() && persona1.getPeso()>persona3.getPeso()){
            System.out.println("La persona que más pesa es "+persona1.getNombre()+", con: " + persona1.getPeso()+" kg");
        }
        else if(persona2.getPeso()>persona3.getPeso()){
            System.out.println("La persona que más pesa es "+persona2.getNombre()+", con: "+persona2.getPeso()+" kg");
        }
        else {
            System.out.println("La persona que más pesa es "+persona3.getNombre()+", con: "+persona3.getPeso()+" kg");
        }

    sc.close();
    }
        
}
