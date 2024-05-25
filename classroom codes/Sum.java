package sum;
import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        int arr[] = {};
        int sum = 0;

        System.out.println("enter 6 numbers:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
        {
            sum = sum + arr[i];
        }
        System.out.print("Sum:" + sum);
    }
}