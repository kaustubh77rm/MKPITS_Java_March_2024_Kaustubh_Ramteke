package assn_15;

import java.util.ArrayList;
import java.util.Collections;

public class code10 {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(11);
        a.add(25);
        a.add(46);
        a.add(67);
        a.add(54);
        Collections.shuffle(a);
        System.out.println(a);
    }
}
