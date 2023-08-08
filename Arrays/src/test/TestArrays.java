package test;

import domain.Persona;

public class TestArrays {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Antonio");
        personas[1] = new Persona("Lorena");
        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[0] = " + personas[1]);
        for (int i = 0; i < personas.length; i++) {
            System.out.println("persona" + i + " = " + personas[i]);
        }

        String fruits[] = {"Apple", "Strawberry", "Pinapple"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + i + "= " + fruits[i]);
        }
    }
}
