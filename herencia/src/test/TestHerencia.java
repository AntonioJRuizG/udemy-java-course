package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Antonio", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        Empleado empleado2 = new Empleado("Antonio", 5000.0);
        System.out.println("empleado2 = " + empleado2);

        Cliente cliente1 = new Cliente(new Date(), true, "Antonio", 'F', 28, "Málaga 4");
        System.out.println("cliente1 = " + cliente1);
    }
}
