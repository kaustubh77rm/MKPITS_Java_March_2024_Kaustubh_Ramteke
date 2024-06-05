//15. **Calculate the product of all integers in a list.**
package assignment_20;

import java.util.ArrayList;
import java.util.Arrays;

public class code15 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>(){{
            add(5);add(2);add(10); //100
        }};
        System.out.println(arrayList.stream().reduce(1,(n1,n2)->n1*n2));
    }
}