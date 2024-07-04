package assn_15;

import java.util.LinkedList;

public class code40 {
    public static void main(String[] args) {
        LinkedList<String>linkedList1=new LinkedList<>();
        linkedList1.add("A");
        LinkedList<String>linkedList2=new LinkedList<>();
        linkedList2.add("B");
        linkedList1.addAll(linkedList2);
        System.out.print(linkedList1+" ");
    }
}
