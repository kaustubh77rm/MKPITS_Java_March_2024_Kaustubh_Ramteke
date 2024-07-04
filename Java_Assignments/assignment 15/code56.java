package assn_15;

import java.util.Iterator;
import java.util.TreeSet;

public class code56 {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet=new TreeSet<>(){{
            add(1);
            add(3);
            add(5);
            add(7);
            add(8);
            add(9);
        }};
        System.out.println(treeSet);
        System.out.print("numbers <7 are ");
        TreeSet<Integer>treeSet2=new TreeSet<>();
        treeSet2=(TreeSet)treeSet.headSet(7);
        Iterator iterator;
        iterator=treeSet2.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
