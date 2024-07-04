//1. **Filter out even numbers from a list of integers.
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code1 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(){{
            add(1);
            add(3);
            add(2);
            add(4);
            add(5);
        }};
        System.out.println(list.stream().filter(l->l%2==0).collect(Collectors.toSet()));
    }
}
