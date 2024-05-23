package assn_15;

import java.util.*;
public class code58 {
    public static void main(String[] args) {
        //compare 2 sets and retain elements which are same
        Set<Integer> set1=new TreeSet<>(){{
            add(1); add(2); add(3); add(4);
        }};
        Set<Integer> set2=new TreeSet<>(){{
            add(1); add(2); add(5); add(6);
        }};
        set1.retainAll(set2);
        System.out.println("same elements: "+set1);
    }
}