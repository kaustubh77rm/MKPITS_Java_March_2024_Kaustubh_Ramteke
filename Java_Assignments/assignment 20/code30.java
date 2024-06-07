//30. **Convert a list of integers to a list of their squares.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code30 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(1);add(2);add(3);add(4);add(5);
        }};

        List<Integer> squaresList = arrayList.stream().map(k->k*k).collect(Collectors.toList());
        squaresList.forEach(System.out::println);
    }
}