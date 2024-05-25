package stud;
import java.util.Scanner;

public class great
{
    void sumThree()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;
        System.out.println("Sum of the three numbers: " + sum);

        // Remember to close the Scanner to prevent resource leaks
        scanner.close();
    }
}