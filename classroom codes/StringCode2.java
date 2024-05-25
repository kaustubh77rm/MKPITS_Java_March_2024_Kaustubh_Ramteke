package stud;

import java.util.Scanner;

public class StringCode2 {
    //ABBCCCD=ABCD
    public static String StringC2() {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter string:");
        str= scanner.next();

        StringBuilder sb = new StringBuilder();
        int j=0;
        for (int i=0; i<str.length(); i++) {
            if (i==0 || str.charAt(i)!= str.charAt(i-1)) {
                sb.append(str.charAt(i));
                j++;
            }
        }
        return sb.toString();
    }
}
/*
        StringCode2 s = new StringCode2();
        String result = s.StringC2();
        System.out.println("Result: " + result);
 */