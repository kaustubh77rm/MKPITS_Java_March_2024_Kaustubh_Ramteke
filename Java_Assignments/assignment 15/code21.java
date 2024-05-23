package assn_15;

import java.util.ArrayList;
import java.util.Scanner;

public class code21 {
    public static void main(String[] args) {
        // Write a Java program to replace the second element of an ArrayList
        // with the specified element.
        ArrayList<Integer>a=new ArrayList<>();
        a.add(42);
        a.add(15);
        a.add(26);
        a.add(37);
        Scanner s = new Scanner(System.in);
        System.out.println(a);
        System.out.print("enter number at 2nd place: ");
        int input=s.nextInt();
        a.add(1,input);
        a.remove(1+1);
        System.out.println(a);
    }
}
