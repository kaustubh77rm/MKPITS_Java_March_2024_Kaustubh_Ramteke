//8. **Find the average of a list of integers.
package assignment_20;

import java.util.ArrayList;

public class code8 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>(){{
            add(2);add(1);add(4);add(5);add(3);add(7);
        }};
        System.out.println(arrayList.stream().mapToDouble(k->k).average());
    }
}
