package assgn_14;
import java.util.*;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class Inventory {
    private List<Product> inventoryList;

    public Inventory() {
        this.inventoryList = new ArrayList<>();
    }

    // Add new product to inventory
    public void addProduct(int id, String name, int quantity, double price) {
        Product newProduct = new Product(id, name, quantity, price);
        inventoryList.add(newProduct);
    }

    // Update the quantity of a product in inventory
    public void updateProductQuantity(int productId, int newQuantity) {
        for (Product product : inventoryList) {
            if (product.id == productId) {
                product.quantity = newQuantity;
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    // Remove product from inventory
    public void removeProduct(int productId) {
        inventoryList.removeIf(product -> product.id == productId);
    }

    // Display all products sorted by price
    public void displayProductsSortedByPrice() {
        Collections.sort(inventoryList, Comparator.comparingDouble(product -> product.price));
        for (Product product : inventoryList) {
            System.out.println("ID: " + product.id + ", Name: " + product.name + ", Quantity: " + product.quantity + ", Price: " + product.price);
        }
    }

    public static void main(String[] args) {
        Inventory ims = new Inventory();

        ims.addProduct(1, "Pen", 10, 25.0);
        ims.addProduct(2, "Rubber", 5, 15.0);
        ims.addProduct(3, "Sharpener", 20, 10.0);

        ims.displayProductsSortedByPrice();

        ims.updateProductQuantity(1, 15);
        ims.removeProduct(2);

        ims.displayProductsSortedByPrice();
    }
}
