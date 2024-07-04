package Bank;
public class Customers
{
    private String name;
    private double balance, savings;

    public String setName(String name)
    {
        this.name = name;
        return name;
    }

    public double getBalance(double balance)
    {
        this.balance = balance;
        return balance;
    }

    public double getSavings(double savings)
    {
        this.savings=savings;
        return savings;
    }

    public String setName()
    {
        return name;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getSavings()
    {
        return savings;
    }
}