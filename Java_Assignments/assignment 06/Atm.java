package stud;

import java.util.Scanner;

public class Atm
{
    //check bal, withdraw, deposit
    int balance=7500, deposit=0, withdraw=0;

    Scanner scanner = new Scanner(System.in);

    public int checkBalance()
    {
        System.out.print("balance: "+balance);
        System.out.println();
        return balance;
    }

    public int getDeposit()
    {
        System.out.print("enter money to deposit:");
        deposit = scanner.nextInt();
        if(deposit<0)
        {throw new RuntimeException();}
        balance = balance + deposit;
        return balance;
    }

    public int getWithdraw()
    {
        System.out.print("enter money to withdraw:");
        withdraw = scanner.nextInt();
        balance = balance - withdraw;
        return balance;
    }
}
/*
                int input;
                boolean exit = false;
                Atm a = new Atm();

                Scanner scanner = new Scanner(System.in);

                while(!exit)
                {
                        System.out.println("1 check balance 2 deposit 3 withdraw 4 exit");
                        input = scanner.nextInt();

                        switch (input)
                        {
                                case 1:
                                        a.checkBalance();
                                        break;
                                case 2:
                                        a.getDeposit();
                                        break;
                                case 3:
                                        a.getWithdraw();
                                        break;
                                case 4:
                                        exit = true;
                                        break;
                                default:
                                        System.out.println("Invalid choice");
                        }
                }
 */