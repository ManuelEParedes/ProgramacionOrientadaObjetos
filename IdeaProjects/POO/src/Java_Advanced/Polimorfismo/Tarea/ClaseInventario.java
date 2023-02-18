package Java_Advanced.Polimorfismo.Tarea;

import Java_Advanced.Polimorfismo.PolimorfismoEjemploDos.ClaseHijaResta;
import Java_Advanced.Polimorfismo.PolimorfismoEjemploDos.ClaseHijaSuma;
import Java_Advanced.Polimorfismo.PolimorfismoEjemploDos.ClasePadre;

public class ClaseInventario {
    public static void main(String[] args) {
        ClaseGeneral articulo = new ClaseRopa();
        articulo.pedirDatos();
        articulo.Busqueda();

    }
}
