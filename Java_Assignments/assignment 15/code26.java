package assn_15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class code26 {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        ListIterator<String>l=linkedList.listIterator();
        while(l.hasNext()){
            l.next();
        }
        while(l.hasPrevious()){
            System.out.print(l.previous()+" ");
        }
    }
}
