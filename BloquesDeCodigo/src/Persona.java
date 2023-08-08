public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    // Esto es un bloque de codigo de inicializacion estatico:
    static{
        System.out.println("Ejecucion bloque estatico");
        ++contadorPersonas;
    }

    {
        System.out.println("Ejecución de bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona (){
        System.out.println("Ejecución del constructor");
    }
}
