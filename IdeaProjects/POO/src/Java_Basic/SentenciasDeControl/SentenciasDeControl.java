package Java_Basic.SentenciasDeControl;

import java.util.Arrays;

public class SentenciasDeControl {

    public static void main(String[] args) {
        boolean condicion = true;
        if(condicion){
            System.out.println("Condicion Verdadera");

        }
        else {
            System.out.println("Condicion falsa");

        }

        int x = 11;

        if(x <= 10 || x>= 12){
            System.out.println("Condicion correcta");
        }
        else {
            System.out.println("Condicion incorrecta");
        }

        int numero = 8;
        String texto = "";

        if(numero == 1){
            texto = "Numero uno";
        }
        else if(numero == 2){
            texto = "Numero dos";
        }
        else if(numero == 3){
            texto = "Numero tres";
        }
        else{
            System.out.println("Numero desconocido");
        }
        System.out.println(texto);

    }

}
