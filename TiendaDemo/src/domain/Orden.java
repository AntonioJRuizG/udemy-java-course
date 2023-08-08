package domain;

public class Orden {
    public int idOrden;
    public Producto productos[];

    public void addProduct(Producto producto){
        this.productos[productos.length-1] = producto;
    }

    public double computeTotal(){
        double totalPrice = 0;
        for (int i = 0; i < productos.length; i++) {
            totalPrice += productos[i].getPrice();
        }

        return totalPrice;
    }
    public Orden(){}

}
