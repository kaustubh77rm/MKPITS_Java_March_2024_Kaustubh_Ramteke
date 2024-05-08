package onlineshoppingsystem;
import java.util.*;

class ShoppingCart implements Cart {
    private Map<Product, Integer> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    @Override
    public void addProduct(Product product, int quantity) {
        cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
    }

    @Override
    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    @Override
    public void viewCart() {
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println("Product: " + entry.getKey().getName() + ", Quantity: " + entry.getValue());
        }
    }
}