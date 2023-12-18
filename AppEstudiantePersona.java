// Práctica 05 -- Ej01 -- Herencia //
// @author  Cristhian Abel Aguilar González //

public class AppEstudiantePersona {

    public static void main(String[] args) {
        Persona p = new Persona("Luís García", 20);
        Estudiante e = new Estudiante("Paola López", 20);

        System.out.println(p);
        System.out.println(e);
    }
}
