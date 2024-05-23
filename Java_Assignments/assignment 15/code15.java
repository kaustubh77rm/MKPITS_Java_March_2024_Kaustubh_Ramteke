package assn_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class code15 {
    public static void main(String[] args) {
        ArrayList<String>a1=new ArrayList<>();
        a1.add("A");
        a1.add("B");
        a1.add("C");
        System.out.println(a1);
        ArrayList<String>a2=new ArrayList<>();
        a2.add("X");
        a2.add("Y");
        a2.add("Z");
        System.out.println(a2);
        a1.addAll(a2);
        System.out.println(a1);
    }
}
