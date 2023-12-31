package domain;

public class Producto {
    private String name;
    private double price;

    private int contadorProductos;
    private final int MAX_PRODUCTS = 10;

    private Producto() {
        contadorProductos++;
    }

    public Producto(String name, double price){
        new Producto();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
