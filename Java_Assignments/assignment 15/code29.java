package assn_15;

import java.util.LinkedList;
import java.util.Scanner;

public class code29 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(12);
        linkedList.add(16);
        linkedList.add(20);
        Scanner s = new Scanner(System.in);
        System.out.print("enter at first:");
        int input=s.nextInt();
        linkedList.addFirst(input);
        System.out.println(linkedList);
    }
}
