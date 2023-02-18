package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        ClasePadre suma = new ClaseHijaSuma();
        suma.pedirDatos();
        suma.Operaciones();
        suma.MostrarResultados();

        ClasePadre resta = new ClaseHijaResta();
        resta.pedirDatos();
        resta.Operaciones();
        resta.MostrarResultados();


    }


}
