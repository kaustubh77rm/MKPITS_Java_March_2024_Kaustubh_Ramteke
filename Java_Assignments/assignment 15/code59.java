package assn_15;

import java.util.HashSet;

public class code59 {
    public static void main(String[] args) {
        //Write a Java program to remove all elements from a hash set
        HashSet<Integer>hashSet=new HashSet<>(){{
            add(12); add(10); add(45); add(75); add(87);
        }};
        System.out.println(hashSet);
        hashSet.removeAll(hashSet);
        System.out.println(hashSet);
    }
}