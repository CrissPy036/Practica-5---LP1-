// Práctica 05 -- Ej01 -- Herencia //
// @author  Cristhian Abel Aguilar González //

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
    }

    public String toString() {
        return "Persona [Nombre => " + nombre + ", Edad => " + edad + "]";
    }
}
