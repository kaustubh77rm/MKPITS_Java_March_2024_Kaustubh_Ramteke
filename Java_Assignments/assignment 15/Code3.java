package assn_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        //3. Write a Java program to insert an element into
        // the array list at the first position.
        Scanner s = new Scanner(System.in);
        int first = 0;
        ArrayList<Integer>arrayList=new ArrayList<>();
        System.out.print("enter element at first position:");
        first = s.nextInt();
        arrayList.addFirst(first);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        try{System.out.println(arrayList);}
        catch(Exception e){
            System.out.println(e);
        }

    }
}
