import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        Person persona1=new Person();
        Person persona2=new Person();
        Person persona3=new Person();

        //PERSONA 1
        System.out.println("Introduzca el nombre de la primera persona: ");
        persona1.setNombre(sc.nextLine());
       
        System.out.println("Introduzca la altura de la primera persona: ");
        persona1.setAltura(Double.parseDouble(sc.nextLine()));
        
        System.out.println("Introduzca el peso de la primera persona: ");
        persona1.setPeso(Double.parseDouble(sc.nextLine()));

        System.out.println("El nombre de la primera persona es: " + persona1.getNombre());
        System.out.println("La altura de la primera persona es: " + persona1.getAltura());
        System.out.println("El peso de la primera persona es: " + persona1.getPeso());


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
