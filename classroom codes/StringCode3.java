package stud;
import java.util.Scanner;

public class StringCode3 {
    public void revStr() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String inputString = s.nextLine();

        String[] words = inputString.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        System.out.println("Result: " + result.toString().trim());
    }
}
/*
StringCode3 s = new StringCode3();
s.revStr();
 */