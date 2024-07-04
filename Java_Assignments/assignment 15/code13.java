package assn_15;

import java.util.ArrayList;

public class code13 {
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        ArrayList<Integer>a2=new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        if(a1.equals(a2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}