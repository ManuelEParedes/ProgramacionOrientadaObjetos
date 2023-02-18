package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

import java.util.Scanner;

public abstract class ClasePadre {
    //Para el poliformismo debemos crear metodos abstractos, y, por
    //ende, la clase tambien debe ser abstracta.
    protected int valorUno, valorDos, resultado;
    Scanner entrada = new Scanner(System.in);

    public void pedirDatos(){
        System.out.println("Dame el primer valor = ");
        valorUno = entrada.nextInt();
        System.out.println("Dame el segundo valor = ");
        valorDos = entrada.nextInt();
    }
    public abstract void Operaciones();
    public void MostrarResultados(){
        System.out.println("El resultado es : " + resultado);
    }

}
