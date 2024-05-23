package assn_15;

import java.util.LinkedList;
import java.util.Scanner;

public class code28 {
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        Scanner s = new Scanner(System.in);
        l.removeFirst();
        System.out.println("enter at 1st position:");
        int first=s.nextInt();
        l.addFirst(first);

        l.removeLast();
        System.out.println("enter at last position:");
        int last=s.nextInt();
        l.addLast(last);
        System.out.print(l+" ");
    }
}