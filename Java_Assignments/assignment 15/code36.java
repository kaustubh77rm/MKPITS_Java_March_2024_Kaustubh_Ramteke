package assn_15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class code36 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        Iterator<Integer>iterator=linkedList.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(linkedList);
        System.out.println(linkedList);
    }
}