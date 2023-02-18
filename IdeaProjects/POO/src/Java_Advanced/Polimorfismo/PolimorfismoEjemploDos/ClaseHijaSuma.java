package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

public class ClaseHijaSuma extends ClasePadre{
    @Override          // A esto se le conoce como sobreescribir metodos, es decir estamos utilizando el polimorfismo
    public void Operaciones() {

        resultado = valorUno + valorDos;
    }



}
