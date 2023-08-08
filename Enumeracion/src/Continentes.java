public enum Continentes {
    EUROPA(46),
    ASIA(44),
    OCEANIA(14),
    AMERICA(34),
    AFRICA(53);

    private final int paises;

    Continentes(int paises){
        this.paises = paises;
    }

    public int getPaises(){
        return this.paises;
    }
}
