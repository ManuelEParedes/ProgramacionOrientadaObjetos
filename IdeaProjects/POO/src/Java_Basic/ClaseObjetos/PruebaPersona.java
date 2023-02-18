package Java_Basic.ClaseObjetos;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona objPersona = new Persona();
        objPersona.nombre = "Manuel";
        objPersona.apellido = "Paredes";
        objPersona.edad = 15;
        objPersona.genero = "Masculino";
        objPersona.nacionalidad = "Mexicano";

        objPersona.MostrarInformacion();
    }
}
