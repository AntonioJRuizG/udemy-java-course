public class TestEnumeracion {
    public static void main(String[] args) {
        // System.out.println("Dia 1: " + Dias.LUNES);
        // indicarDiasSemana(Dias.MARTES);

        System.out.println("Nº de países en África: " + Continentes.AFRICA.getPaises());
    }

    private static void indicarDiasSemana (Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            default:
                System.out.println("Entrada no válida.");
                break;
        }
    }
}
