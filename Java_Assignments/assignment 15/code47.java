package assn_15;

import java.util.LinkedList;

public class code47 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
        }};
        linkedList.set(0,5);
        System.out.println(linkedList);
    }
}
