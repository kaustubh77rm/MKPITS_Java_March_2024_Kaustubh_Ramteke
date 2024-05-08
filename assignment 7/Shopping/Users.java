package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Users
{
    public static Customers customers;
    public static List<Products> products;

    public Users(Customers customers) {
        this.customers = customers;
        this.products = new ArrayList<>();
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public static void checkout() {
        double totalCost = 0;
        for (Products product : products) {
            totalCost += product.getPrice();
            product.decreaseQuantity(1); // Assuming one quantity per product in this simple example
        }
        if (totalCost <= customers.getBalance()) {
            customers.deductBalance(totalCost);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Insufficient balance to place the order!");
        }
    }
}
