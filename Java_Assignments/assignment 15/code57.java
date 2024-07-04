package assn_15;

import java.util.HashSet;

public class code57 {
    public static void main(String[] args) {
        HashSet<Integer>hashSet1=new HashSet<>(){{
           add(1);
           add(2);
           add(3);
        }};
        HashSet<Integer>hashSet2=new HashSet<>(){{
            add(1);
            add(2);
        }};
        System.out.println(hashSet2.equals(hashSet1));
    }
}