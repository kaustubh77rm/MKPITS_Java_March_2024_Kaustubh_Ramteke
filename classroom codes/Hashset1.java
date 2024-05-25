package stud;

import java.util.*;

public class Hashset1 {
    public static void main(String[] args) {
        Set<Integer>set1= new HashSet<>(){{
         add(1);
         add(2);
         add(3);
         add(4);
        }};
        System.out.println("set 1:"+set1);
        Set<Integer>set2= new HashSet<>(){{
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        Set<Integer>set3= new HashSet<>();
        System.out.println("set 2:"+set2);
        set3.addAll(set1);
        set3.addAll(set2);
        //in set duplicates are not allowed
        System.out.println("union:"+set3);
        set1.retainAll(set2);
        System.out.println("intersection:"+set1);
    }
}