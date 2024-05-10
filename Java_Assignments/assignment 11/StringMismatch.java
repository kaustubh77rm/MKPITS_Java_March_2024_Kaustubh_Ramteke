package stud;
import java.util.Scanner;

public class StringMismatch {
    public void dispMM() {
        Scanner s = new Scanner(System.in);
        String str1, str2;

        System.out.print("Enter string 1: ");
        str1 = s.next();

        System.out.print("Enter string 2: ");
        str2 = s.next();

        if(!str1.equals(str2)){
            throw new IllegalArgumentException("StringsMismatch");
        } else{
            System.out.println("Match");
        }
    }
}
//new StringMismatch().dispMM();