//Program 4
//Write a Java Program to check whether a given year is a leap year or not.
package assignment_21;

import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        //leap year is evenly divisible by 4
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter a year:");
        int year = scanner.nextInt();
        if(year%4==0){
            System.out.println("leap year");
        }
        else System.out.println("not a leap year");
    }
}
