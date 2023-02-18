package Java_Advanced.Polimorfismo.Tarea;

import java.util.Scanner;

public abstract class ClaseGeneral {
    protected String  articulo, talla;
    protected int resultado;
    Scanner entrada = new Scanner(System.in);

    public void pedirDatos(){
        System.out.println("Que articulo buscas = ");
        articulo = entrada.next();
        System.out.println("Que talla = ");
        talla = entrada.next();
    }
    public abstract void Busqueda();

}
