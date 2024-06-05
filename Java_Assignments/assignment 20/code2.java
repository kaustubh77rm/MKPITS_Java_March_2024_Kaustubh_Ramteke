//2. **Find the maximum number in a list of integers.
package assignment_20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class code2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{
            add(10);
            add(2);
            add(22);
        }};
        int maxElement= list.stream().max(Integer::compare).get();
        System.out.println("maximum no:"+maxElement);
    }
}