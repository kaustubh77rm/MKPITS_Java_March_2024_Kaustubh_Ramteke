package stud;
import java.util.Scanner;

public class InvalidAgeException extends Exception{
    public static void validateAge() throws InvalidAgeException {
        Scanner s = new Scanner(System.in);
        System.out.print("enter age ");
        int age= s.nextInt();

        if (age<0 || age>100){
            throw new InvalidAgeException();
        }
    }
}
/*
InvalidAgeException i = new InvalidAgeException();

        try{
            i.validateAge();
            System.out.println("valid age");
        }
        catch (InvalidAgeException e) {
            System.out.println(e);
        }
 */