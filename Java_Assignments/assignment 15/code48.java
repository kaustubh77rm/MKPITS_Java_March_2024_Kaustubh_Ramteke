package assn_15;

import java.util.HashSet;

public class code48 {
    public static void main(String[] args) {
        HashSet<Integer>hashSet=new HashSet<>(){{
            add(5);
            add(2);
            add(8);
        }};
        hashSet.add(7);
        System.out.println(hashSet);
    }
}
