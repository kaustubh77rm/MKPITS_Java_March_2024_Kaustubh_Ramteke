package stud;

import java.util.Scanner;

public class Calculator
{
    public int sum(int num1, int num2)
    {
        return num1+num2;
    }
    public int sub(int num1, int num2)
    {
        return num1-num2;
    }
    public int mul(int num1, int num2)
    {
        return num1*num2;
    }
    public int div(int num1, int num2)
    {
        return num1/num2;
    }
}
/*
        int num1,num2;
Scanner scanner = new Scanner(System.in);
           System.out.print("Enter 2 numbers:");
num1 = scanner.nextInt();
num2 = scanner.nextInt();

Calculator c = new Calculator();

        System.out.println("addition:"+c.sum(num1, num2));
        System.out.println("substraction:"+c.sub(num1, num2));
        System.out.println("multiplication:"+c.mul(num1, num2));
        System.out.println("division:"+c.div(num1, num2));

        */