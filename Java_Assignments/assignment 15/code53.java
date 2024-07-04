package assn_15;

import java.util.HashSet;

public class code53 {
    public static void main(String[] args) {
        HashSet<Integer>hashSet=new HashSet<>(){{
           add(1);
           add(2);
           add(3);
        }};
        System.out.println(hashSet.clone());
    }
}
