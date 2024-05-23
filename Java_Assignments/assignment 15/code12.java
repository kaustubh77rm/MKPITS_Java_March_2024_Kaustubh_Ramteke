package assn_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class code12 {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        List<Integer>l = a.subList(0,5);
        System.out.print(l+" ");
    }
}
