package stud;

import java.util.Scanner;

public class Temparature
{
    public void celTo()
    {
        double fahrenheit, celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter celsius to convert into fahrenheit:");
        celsius = scanner.nextInt();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("fahrenheit: " +fahrenheit);
    }
    public void fahTo()
    {
        double fahrenheit, celsius;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter fahrenheit to convert into celsius:");
        fahrenheit = scanner.nextInt();

        celsius = (fahrenheit - 32) * 5/9 ;

        System.out.println("celsius: " +celsius);
    }
}
/*
                Scanner scanner = new Scanner(System.in);
                System.out.println("1 celsius to fahrenheit\n2 fahrenhiet to celsius\n");
                int choice = scanner.nextInt();
                Temparature t = new Temparature();

                switch (choice)
                {
                        case 1:
                                t.celTo();
                                break;
                        case 2:
                                t.fahTo();
                                break;
                        default:
                                return;
                }
*/