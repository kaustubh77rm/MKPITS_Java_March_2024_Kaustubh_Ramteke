package assn_15;

import java.util.HashSet;
import java.util.TreeSet;

public class code55 {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>(){{
            add("Maharashtra");
            add("Tamil Nadu");
            add("Punjab");
            add("Bengal");
            add("Maharashtra");
        }};
        System.out.print("hashSet:");
        System.out.print(hashSet+" ");

        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.addAll(hashSet);
        System.out.println("");
        System.out.print("treeSet:");
        System.out.print(treeSet+" ");
    }
}
