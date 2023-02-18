package Java_Advanced.This;

public class Rectangulo {
    private int base, altura, area;
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public void CalculaArea(){
        area = base * altura;
    }
    public void Imprimir(){
        CalculaArea();
        System.out.println("El Area es: " + area);
    }
}
