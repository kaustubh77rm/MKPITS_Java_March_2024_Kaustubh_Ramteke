package assn_15;

import java.util.LinkedList;

public class code44_2 {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("a"); linkedList.add("b"); linkedList.add("c");
        linkedList.add("d"); linkedList.add("e"); linkedList.add("f");
        System.out.print(linkedList+" ");
        if(linkedList.contains("a")){
            System.out.println("contain");
        }
        else System.out.println("not contain");
    }
}
