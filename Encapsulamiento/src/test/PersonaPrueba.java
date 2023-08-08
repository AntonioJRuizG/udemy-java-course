package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Antonio", 5000.00, false);
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        persona1.setNombre("Juan");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());

        System.out.println(persona1.toString());
    }
}
