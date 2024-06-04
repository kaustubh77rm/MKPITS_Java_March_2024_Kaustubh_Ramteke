//2. Mapping:
//Create a list of integers and use a stream to double each integer in the list.
package assignment_19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleusingMapping {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        System.out.println(list);
        List<Integer>doubledList = list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(doubledList);
    }
}