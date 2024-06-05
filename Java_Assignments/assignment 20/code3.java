//3. **Find the sum of all numbers in a list.
package assignment_20;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class code3 {
    public static void main(String[] args) {
    ArrayList<Integer>arrayList=new ArrayList<>(){{
        add(1);add(3);add(5);add(6);add(4);add(2);
    }};
    int sumOfAll= arrayList.stream().mapToInt(a->a).sum();
        System.out.println("sum:"+sumOfAll);
    }
}