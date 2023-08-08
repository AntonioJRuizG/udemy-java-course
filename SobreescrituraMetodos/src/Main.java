public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Antonio", "20", "Logistica");

        System.out.println("empleado1 detalles = " + empleado1.obtenerDetalles());
        // Polimorfismo
        Persona persona1 = new Persona("Lorena", "24");
        System.out.println("persona1 = " + persona1.obtenerDetalles());
        imprimir(persona1);
        determinarTipo(persona1);
        persona1 = new Empleado("Karla", "20", "Produccion");
        System.out.println("persona1 = " + persona1.obtenerDetalles());
        imprimir(persona1);

        determinarTipo(persona1);

    }

    public static void imprimir (Persona persona) {
        String detalles = persona.obtenerDetalles();
        System.out.println("detalles = " + detalles);
    }

    // Instanceof

    public static void  determinarTipo (Persona persona){
        if (persona instanceof Empleado){
            System.out.println("Es tipo empleado");
        }
        if (persona instanceof Persona){
            System.out.println("Es tipo persona");
        }
        if (persona instanceof Object) {
            System.out.println("Es tipo object");
        }
    }
}