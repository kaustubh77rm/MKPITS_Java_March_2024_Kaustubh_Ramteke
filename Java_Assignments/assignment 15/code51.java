package assn_15;

import java.util.HashSet;

public class code51 {
    public static void main(String[] args) {
        HashSet<Integer>hashSet=new HashSet<>(){{
            add(13); add(19); add(15); add(11);
        }};
        System.out.println(hashSet);
        hashSet.removeAll(hashSet);
        System.out.println(hashSet);
    }
}
