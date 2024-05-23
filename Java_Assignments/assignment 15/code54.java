package assn_15;

import java.util.HashSet;

public class code54 {
    public static void main(String[] args) {
        int i;
        HashSet<Integer>hashSet=new HashSet<>(){{
            add(2); add(1); add(4); add(3); add(5);
        }};
        Object[]o=hashSet.toArray();
        for(i=0;i< hashSet.size();i++){
            System.out.print(o[i]+" ");
        }
    }
}
