package assn_15;

import java.util.LinkedList;
import java.util.Scanner;

public class code37 {
    public static void main(String[] args) {
        //swap 2 elements
        LinkedList<Integer>linkedList= new LinkedList<>();
        linkedList.add(1);
        linkedList.add(6);
        linkedList.add(9);
        linkedList.add(3);
        System.out.println(linkedList);
        Scanner s = new Scanner(System.in);
        System.out.print("enter element 1:");
        int swap1= s.nextInt();
        System.out.print("enter element 2:");
        int swap2= s.nextInt();
        int index1=linkedList.indexOf(swap1);
        int index2= linkedList.indexOf(swap2);
        linkedList.set(index1,swap2);
        linkedList.set(index2,swap1);
        System.out.println(linkedList);
    }
}
