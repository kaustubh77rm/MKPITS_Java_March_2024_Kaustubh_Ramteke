package assn_15;

import java.util.Iterator;
import java.util.LinkedList;

public class code33 {
    public static void main(String[] args) {
        //Write a Java program to display elements
        //and their positions in a linked list.
        LinkedList<Integer>l=new LinkedList<>();
        l.add(11);
        l.add(18);
        l.add(15);
        l.add(13);
        Iterator<Integer>iterator=l.iterator();
        while(iterator.hasNext()){
            System.out.print(l.indexOf(iterator.next())+" ");
        }
    }
}
