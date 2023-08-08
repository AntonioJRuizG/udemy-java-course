public class Main {
    public static void main(String[] args) {
        // No es asi: Rectangulo rectangulo1 = new Rectangulo("Rectangulo");
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}