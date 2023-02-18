package Java_Basic.OperadoresYVariables;

import java.util.Arrays;

public class OperadoresCondicionales
{
        public static void main(String[] args) {
            var a = 5;
            var resultado = a >= 0 && a<= 10;

            if (resultado){
                    System.out.println("Dentro del rango");
            }
            else{
                    System.out.println("Fuera del rango");
            }

            var vacaciones  = false;
            var diaDescanso = false;
            var domingo     = false;

            if(vacaciones || diaDescanso || domingo){
                System.out.println("Puedo beber cerveza");
            }
            else{
                System.out.println("No Puedo beber cerveza");
            }
        }
}
