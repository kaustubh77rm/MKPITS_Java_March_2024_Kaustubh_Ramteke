package stud;
import java.util.Scanner;

public class StringCode1 {
    public void removeChar() {
        String str = "Practice java string programs";

        Scanner s = new Scanner(System.in);
        String charRem = "abc";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar != charRem.charAt(0)) {
                result.append(currentChar);
            }
        }
        System.out.println("Resulting string after removing '" + charRem + "':\n" + result.toString());
    }
}
/*
        StringCode1 s = new StringCode1();
        s.removeChar();
 */