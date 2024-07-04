package assn_15;

import java.util.LinkedList;

public class code45 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList1=new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        LinkedList<Integer>linkedList2=new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        if(linkedList1.containsAll(linkedList2)){
            System.out.println("contains");
        }
        else System.out.println("not contains");
    }
}
