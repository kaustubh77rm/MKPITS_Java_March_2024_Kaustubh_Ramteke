package assn_15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class code34 {
    public static void main(String[] args) {
        //Write a Java program to remove a specified element from a linked list
        LinkedList<Integer>l=new LinkedList<>();
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(44);
        System.out.println(l);
        Scanner s = new Scanner(System.in);
        System.out.println("enter integer to remove:");
        int remove = s.nextInt();
        for(Object o:l){
            if(l.element()==remove)
            {
                l.remove(remove);
            }
        }
        System.out.println(l);
    }
}