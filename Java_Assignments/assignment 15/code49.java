package assn_15;

import java.util.HashSet;
import java.util.Iterator;

public class code49 {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>(){{
            add("D"); add("B"); add("A"); add("E"); add("C"); add("C");
        }};
        Iterator<String>iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}