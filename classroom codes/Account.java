package stud;
import java.lang.String;

class Account
{
public String acno;
public String name;
public double balance;

    public Account()    //default constructor
    {
     acno="1001";
     name="Kaustubh";
     balance=9999;
    }

    public String getAcno()
    {
        return acno;
    }
    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }

    public void depositAmt(double amt)
    {
    balance=balance+amt;
    }

    public void withdrawAmt(double amt)
    {
        balance=balance-amt;
    }

    //parameterized constructor
    public Account (String acno, String name, double balance)
    {
        this.acno=acno;
        this.name=name;
        this.balance=balance;
    }
}