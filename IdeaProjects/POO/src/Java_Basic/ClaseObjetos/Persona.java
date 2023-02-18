package Java_Basic.ClaseObjetos;

public class Persona {
    //Atributos
    String nombre;
    String apellido;
    int edad;
    String nacionalidad;
    String genero;

    public void MostrarInformacion(){
        System.out.println("nombre= " + nombre);
        System.out.println("apellido= " + apellido);
        System.out.println("edad= " + edad);
        System.out.println("nacionalidad= " + nacionalidad);
        System.out.println("genero= " + genero);
        System.out.println("Informacion de usuario= " + nombre + " " + apellido + "," + edad + "," + nacionalidad + "," + genero);
    }
}
