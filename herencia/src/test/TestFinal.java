package test;

import domain.PersonaFinal;

public class TestFinal {
    public static void main(String[] args) {
        final int variable = 10;
        System.out.println("variable = " + variable);

        System.out.println("Persona: " + PersonaFinal.CONSTANTE);
        
        final PersonaFinal persona1 = new PersonaFinal();
        persona1.setNombre("Antonio");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
    }
}
