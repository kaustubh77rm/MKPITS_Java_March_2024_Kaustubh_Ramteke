package assn_15;

import java.util.LinkedList;

public class code46 {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>(){{
            add("a");
        }};
        if(linkedList.isEmpty()){
            System.out.println("empty");
        }
        else System.out.println("not empty");
    }
}
