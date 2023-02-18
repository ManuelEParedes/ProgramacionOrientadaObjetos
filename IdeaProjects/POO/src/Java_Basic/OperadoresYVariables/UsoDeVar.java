package Java_Basic.OperadoresYVariables;

import java.util.Arrays;

public class UsoDeVar {
    public static void main(String[] args) {
        //Uso de la palabra reservada "var", infiere en los tipos de datos
        var intEntera = 10;
        System.out.println(intEntera);
        var miNombre = "Manuel";
        System.out.println("Mi nombre es = " + miNombre);

        //Concatenación de variables, Ej 2

        var usuario = "Paredes";
        var ocupacion = "QA";
        var perfil = ocupacion + " " + usuario;
        System.out.println("Perfil = " + perfil);

        var i = 3;
        var j = 4;

        System.out.println(i + j);                  //Se realiza la suma
        System.out.println(i + j + " " + perfil);   //De iz a derecha
        System.out.println(perfil + i + j);         //Contexto cadena
        System.out.println(perfil + (i + j));       //hace la suma

    }
}
