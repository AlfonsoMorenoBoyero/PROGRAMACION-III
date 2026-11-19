package Ejercicio1;

public class Controller {
    private Model model;
    private View view;

    //Constructor
    public Controller(Model model, View view){
        this.model=model;
        this.view=view;
    }

    public void run(){
        boolean running=true;
        while(running){
            view.mostrarMenu();
            String opcion=view.getOpcion();

            switch(opcion.toLowerCase()){
                case "1":
                    int numero1=view.getNumero("Ingrese el primer número: ");
                    int numero2=view.getNumero("Ingrese el segundo número: ");
                    model.setNumero1(numero1);
                    model.setNumero2(numero2);
                    view.mostrarMensaje("Números leídos correctamente");
                    break;
                
                case "2":
                    model.calcularSuma();
                    view.mostrarMensaje("Suma calculada correctamente");
                    break;

                case "3":
                    int resultado=model.getSuma();
                    view.mostrarResultado(resultado);
                    break;

                case "q":
                    running=false;
                    view.mostrarMensaje("Saiendo del programa. ¡Adiós!");
                    break;

                default:
                    view.mostrarMensaje("Opción inválida, intente nuevamente.");
                    break;

                    }
                    }

            }
        }
    

