package stud;

import java.util.Scanner;

public class StringCode4 {
    public void smallBig() {
        String bigStr = "", smallStr = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");

        if (words.length > 0) {
            bigStr = smallStr = words[0];
            for (int i = 1; i < words.length; i++) {
                if (words[i].length() > bigStr.length()) {
                    bigStr = words[i];
                }
                if (words[i].length() < smallStr.length()) {
                    smallStr = words[i];
                }
            }
        }

        System.out.println("Biggest: " + bigStr);
        System.out.println("Smallest: " + smallStr);
    }
}