package Ejercicio2;

public class App {
    public static void main(String[] args) {
        CompaniaModel model = new CompaniaModel();
        CompaniaView view = new CompaniaView();
        CompaniaController controller = new CompaniaController(model, view);

        controller.run();
    }
}