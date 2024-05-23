package assn_15;

import java.util.ArrayList;
import java.util.Collections;

public class code17 {
    public static void main(String[] args) {
        //empty an arraylist
        ArrayList<Integer>a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println("arraylist: "+a);
        System.out.println("after deleting all elements");
        a.removeAll(a);
        System.out.println("arraylist: "+a);
    }
}
