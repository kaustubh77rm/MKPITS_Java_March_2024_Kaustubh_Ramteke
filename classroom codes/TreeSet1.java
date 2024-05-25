package stud;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String>treeSet= new TreeSet<>();
        //duplicates not allowed
        //follows sequential order
        treeSet.add("B"); treeSet.add("C"); treeSet.add("A"); treeSet.add("A");
        System.out.println(treeSet);
    }
}