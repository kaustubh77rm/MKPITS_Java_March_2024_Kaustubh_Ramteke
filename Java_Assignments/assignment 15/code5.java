package assn_15;

import java.util.ArrayList;
import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(13);
        arrayList.add(11);
        System.out.println(arrayList);
        Scanner s = new Scanner(System.in);
        System.out.print("enter number:");
        int number=s.nextInt();
        arrayList.add(number);
        System.out.println(arrayList);
    }
}