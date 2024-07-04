package assn_15;

import java.util.HashSet;

public class code52 {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>(){{
            add("A");
        }};
        if(hashSet.isEmpty()){
            System.out.println("empty");
        }
        else System.out.println("not empty");
    }
}
