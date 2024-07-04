package assn_15;

import java.util.LinkedList;

public class code35 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        System.out.println("after deleting 1st and last elements");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
