package assn_15;

import java.util.ArrayList;

public class code9 {
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<>();
        a1.add(21);
        a1.add(46);
        System.out.println("arraylist 1: "+a1);
        ArrayList<Integer>a2=new ArrayList<>();
        a2.addAll(a1);
        System.out.println("arraylist 1 copying into arraylist 2");
        System.out.println("arraylist 2: "+a2);
    }
}
