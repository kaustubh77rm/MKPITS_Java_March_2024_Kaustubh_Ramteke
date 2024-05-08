package employeecode;

public abstract class Employee {
    private String name;
    private double paymentPerHour;

    public Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public double getPaymentPerHour() {
        return paymentPerHour;
    }

    public abstract double calculateSalary();
}