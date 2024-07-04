public interface Product {
public double calculate();
public void display();
}

public static void main(String[] args) {
    Product p1 = new Product() {
    private String item="Electronics";
    private double price=20000;
    private double quantity=11;

    @Override
    public double calculate() {
        return price*quantity;
    }

    @Override
    public void display() {
        System.out.print("Item: "+item);
        System.out.print("\nTotal: ₹"+calculate());
    }
};
Product p2 = new Product() {
    private String item="Clothing";
    private double price=750;
    private double quantity=15;

    @Override
    public double calculate() {
        return price*quantity;
    }

    @Override
    public void display() {
        System.out.print("\nItem: "+item);
        System.out.print("\nTotal: ₹"+calculate());
    }
};
Product p3 = new Product() {
    private String item="Books";
    private double price=350;
    private double quantity=12;

    @Override
    public double calculate() {
        return price*quantity;
    }

    @Override
    public void display() {
        System.out.print("\nItem: "+item);
        System.out.print("\nTotal: ₹"+calculate());
    }
};
        p1.display();
        p2.display();
        p3.display();
}