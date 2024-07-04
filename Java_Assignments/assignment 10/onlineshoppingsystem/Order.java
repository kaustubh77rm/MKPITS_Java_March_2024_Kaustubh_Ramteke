package onlineshoppingsystem;
import java.util.*;

interface Order {
    double calculateTotal();
}

// Class representing an order
class ConcreteOrder implements Order {
    private List<Product> products;

    public ConcreteOrder(List<Product> products) {
        this.products = products;
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}