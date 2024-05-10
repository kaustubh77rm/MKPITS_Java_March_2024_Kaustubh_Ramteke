package employeecode;

public class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String name, double paymentPerHour, double monthlySalary) {
        super(name, paymentPerHour);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}