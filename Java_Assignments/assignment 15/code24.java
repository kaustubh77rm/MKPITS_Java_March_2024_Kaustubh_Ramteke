package assn_15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class code24 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList= new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        Iterator<Integer>iterator=linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}