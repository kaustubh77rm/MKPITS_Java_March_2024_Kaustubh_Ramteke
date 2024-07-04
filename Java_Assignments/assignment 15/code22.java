package assn_15;

import java.util.ArrayList;
import java.util.Scanner;

public class code22 {
    //22. Write a Java program to print
    // all the elements of an ArrayList using the elements' position.
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(21);
        arrayList.add(35);
        arrayList.add(40);
        arrayList.add(17);
        Scanner s = new Scanner(System.in);
        System.out.print("enter number upto which u wanna display arraylist:");
        int index=s.nextInt();
        System.out.println(arrayList.set(0,index));
    }
}
