package assn_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Code2 {
    public static void main(String[] args) {
        //2. Write a Java program to iterate through all elements in an array list.
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        Iterator<Integer> i=arrayList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
