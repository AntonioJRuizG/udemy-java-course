package es.com.javapractice.store;

public class Order {
    private int idOrder;
    private Product products[];
    private static int counterOrders;
    private int counterProducts;
    private static final int MAX_PRODUCTS = 10;

    public Order(){
        this.idOrder = ++Order.counterOrders;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product){
        if(this.counterProducts < Order.MAX_PRODUCTS){
            this.products[this.counterProducts++] = product;
        } else{
            System.out.println("Max products amount reached: " + Order.MAX_PRODUCTS);
        }
    }

    public double computeTotal (){
        double total = 0;
        for (int i = 0; i < this.counterProducts; i++) {
            total += this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder(){
        System.out.println("Id Order: " + this.idOrder);
        System.out.println("Total price €: " + this.computeTotal());
        System.out.println("List of products of the Order: ");
        for (int i = 0; i < this.counterProducts; i++) {
            System.out.println(this.products[i]);
        }
    }
}
