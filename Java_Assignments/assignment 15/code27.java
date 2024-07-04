package assn_15;

import java.util.LinkedList;
import java.util.Scanner;

public class code27 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        System.out.println(linkedList);
        Scanner s = new Scanner(System.in);
        System.out.println("enter index:");
        int index=s.nextInt();
        linkedList.remove(index);
        System.out.println("enter element:");
        int enter=s.nextInt();
        linkedList.add(index,enter);
        System.out.println(linkedList);
    }
}
