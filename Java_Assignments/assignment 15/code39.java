package assn_15;
import java.util.LinkedList;

public class code39 {
    public static void main(String[] args) {
    //join 2 linked lists
        LinkedList<String>linkedList1=new LinkedList<>();
        linkedList1.add("A"); linkedList1.add("B"); linkedList1.add("C");
        LinkedList<String>linkedList2=new LinkedList<>();
        linkedList2.add("X"); linkedList2.add("Y"); linkedList2.add("Z");
        LinkedList<String>linkedList3=new LinkedList<>();
        linkedList3.addAll(linkedList1);
        linkedList3.addAll(linkedList2);
        System.out.println(linkedList3);

    }
}