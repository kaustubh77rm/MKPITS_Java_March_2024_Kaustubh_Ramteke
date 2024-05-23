package assn_15;

import java.util.LinkedList;
import java.util.Scanner;

public class code30 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(12);
        linkedList.add(16);
        linkedList.add(20);
        Scanner s = new Scanner(System.in);
        System.out.print("enter at end:");
        int input=s.nextInt();
        linkedList.addLast(input);
        System.out.println(linkedList);
    }
}
