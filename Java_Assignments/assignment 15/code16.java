package assn_15;

import java.util.ArrayList;

public class code16 {
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        System.out.println("arraylist 1: "+a1);
        System.out.println("after cloning");
        ArrayList a2=(ArrayList) a1.clone();
        System.out.println("arraylist 2: "+a2);
    }
}
