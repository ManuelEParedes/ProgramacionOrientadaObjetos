package Java_Advanced.Polimorfismo.Tarea;

public class ClaseRopa extends ClaseGeneral{
    @Override          // A esto se le conoce como sobreescribir metodos, es decir estamos utilizando el polimorfismo
    public void Busqueda() {
        switch (articulo){
            case "playera":
                if(talla.equals("mediana")){
                    System.out.println("Hay cuatro playeras medianas");
                }
                else if(talla.equals("chica")){
                    System.out.println("Hay una playera chica");
                }
                break;
            case "falda":
                if(talla.equals("mediana")){
                    System.out.println("Hay tres faldas medianas");
                }
                else if(talla.equals("chica")){
                    System.out.println("Hay dos faldas chicas");
                }
                break;

            case "pantalon":

                if(talla.equals("mediana")){
                    System.out.println("Hay tres pantalones medianas");
                }
                else if(talla.equals("chica")){
                    System.out.println("Hay un pantalon");
                }

                break;
        }

    }
}
