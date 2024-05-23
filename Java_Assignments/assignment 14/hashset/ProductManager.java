package assgn_14.hashset;

import java.util.HashSet;
import java.util.Scanner;

class ProductManager1 {
    private HashSet<String> products;

    public ProductManager1() {
        this.products = new HashSet<>();
    }

    public void addProduct(String prodName) {
        if (products.add(prodName)) {
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product already exists.");
        }
    }

    public void checkProduct(String product) {
        if (products.contains(product)) {
            System.out.println("Product exists in the collection.");
        } else {
            System.out.println("Product does not exist in the collection.");
        }
    }

    public void removeProduct(String product) {
        if (products.remove(product)) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found in the collection.");
        }
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in the collection.");
        } else {
            System.out.println("All unique products:");
            for (String p : products) {
                System.out.println(p);
            }
        }
    }
}

public class ProductManager {
    public static void main(String[] args) {
        ProductManager1 productManager = new ProductManager1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Product Manager:");
            System.out.println("1. Add a new product");
            System.out.println("2. Check if a product exists");
            System.out.println("3. Remove a product");
            System.out.println("4. Display all products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter product: ");
                    String product = scanner.nextLine();
                    productManager.addProduct(product.stripLeading());
                    break;
                case 2:
                    System.out.print("Enter product name to check: ");
                    String checkProduct = scanner.nextLine();
                    productManager.checkProduct(checkProduct);
                    break;
                case 3:
                    System.out.print("Enter product name to remove: ");
                    String removeProduct = scanner.nextLine();
                    productManager.removeProduct(removeProduct);
                    break;
                case 4:
                    productManager.displayAllProducts();
                    break;
                case 5:
                    System.out.println("Exited");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
