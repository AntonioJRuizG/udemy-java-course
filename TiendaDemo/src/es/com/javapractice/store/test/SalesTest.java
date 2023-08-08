package es.com.javapractice.store.test;

import es.com.javapractice.store.Order;
import es.com.javapractice.store.Product;

public class SalesTest {
    public static void main(String[] args) {
        Product product1 = new Product("T-Shirt", 20.00);
        Product product2 = new Product("Short", 15.00);
        Product product3 = new Product("Jeans", 10.00);
        Product product4 = new Product("Trousers", 5.00);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        order1.showOrder();

        Order order2 = new Order();
        order2.addProduct(product1);
        order2.addProduct(product2);
        order2.addProduct(product3);
        order2.addProduct(product4);

        order2.showOrder();
    }
}
