package Shopping;

public class Customers
{
    private final String name;
    private final String email;
    private final String address;
    private double balance;

    public Customers(String name, String email, String address, double balance) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
    }
}
/*
                // Creating a customer
                Customers customer = new Customers("Rahul", "rahul@gmail.com", "123 Main St", 100.0);

                // Creating some products
                Products product1 = new Products("Book", 10.0, 5);
                Products product2 = new Products("Pen", 2.0, 10);

                // Creating a user and associating the customer
                Users user = new Users(customer);

                // Adding products to the user's cart
                user.addProduct(product1);
                user.addProduct(product2);

                // Checking out
                Users.checkout();

*/