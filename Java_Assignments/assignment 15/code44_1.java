package assn_15;

import anonymous_library.LibraryItems;
import java.util.ArrayList;
import java.util.LinkedList;

public class code44_1 {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("Mumbai");
        linkedList.add("Nagpur");
        linkedList.add("Pune");
        linkedList.add("Amravati");
        System.out.println(linkedList);
        Object[] o=linkedList.toArray(new String[0]);
        for(int i=0;i<linkedList.size();i++){
            System.out.println(o[i]);
        }
    }
}