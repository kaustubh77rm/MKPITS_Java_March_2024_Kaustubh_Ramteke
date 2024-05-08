package Shopping;

public class Products
{
    private String name;
    private double price;
    private int quantity;

    public Products(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity(int amount)
    {
        if (quantity >= amount)
        {
            quantity -= amount;
        }
        else
        {
            System.out.println("Insufficient quantity in stock!");
        }
    }
}