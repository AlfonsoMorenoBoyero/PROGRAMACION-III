public class App {
    public static void main(String[] args) throws Exception {
        if(args.length!=2){
            System.out.println("Error. Debes introducir exactamente dos argumentos. Por ejemplo, java App 10 20");
            return;
        }
        //Si no da error intentamos convertir los textos a números con los Wrapper
        try{
            double numero1=Double.parseDouble(args[0]);
            double numero2=Double.parseDouble(args[1]);

            double suma=numero1+numero2;
            System.out.println("La suma de "+numero1+" + "+numero2+" es "+suma);
        }

    //Si alguno de los argumentos no es válido
    catch(NumberFormatException e){
        System.out.println("Errror. Ambos valores tienen que ser números válidos");
    }
    }
}
