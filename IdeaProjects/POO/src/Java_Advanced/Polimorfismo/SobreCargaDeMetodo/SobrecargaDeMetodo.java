package Java_Advanced.Polimorfismo.SobreCargaDeMetodo;

public class SobrecargaDeMetodo {
    public void suma (int a, int b){
        System.out.println("resultado = " + (a + b) );
    }

    public void suma(int a, int b, int c){
        System.out.println("resultado = " + (a + b + c));
    }

    public void suma(String variablesASumar, int a, int b, int c){
        switch(variablesASumar) {
            case "dos":
                System.out.println("resultado = " + (a + b) );
                break;

            case "tres":
                System.out.println("resultado = " + (a + b + c) );
                break;
        }
    }

    public static void main(String[] args) {
        SobrecargaDeMetodo objSobreCarga = new SobrecargaDeMetodo();
        objSobreCarga.suma(2,3);
        objSobreCarga.suma(2,3,4);
        objSobreCarga.suma("tres",1000,100,200);
        objSobreCarga.suma("dos",1000,100,200);
    }
}
