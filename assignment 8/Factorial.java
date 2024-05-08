package stud;

import java.util.Scanner;

public class Factorial
{
   public static int factorialIterative(int n)
   {
        int result = 1;
        for (int i=1; i<=n; i++)
        {
            result *= i;
        }
        return result;
   }

    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        n = scanner.nextInt();
        System.out.println("Factorial of " + n + ": " + factorialIterative(n));
    }
}