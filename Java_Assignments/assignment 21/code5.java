//Program 5
//Java Program to Find the Sum of n Square Numbers.
//sum = n*(n+1)*(2n+1)/6
package assignment_21;

import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        long sum = n*(n+1)*(2*n+1)/6;
        System.out.println("sum of the first " + n + " square numbers is: " + sum);
    }
}