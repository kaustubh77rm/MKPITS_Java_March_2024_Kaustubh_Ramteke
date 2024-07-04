//40. **Filter and collect only positive numbers from a list.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code40 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>(){{
            add(42);add(53);add(-35);add(24);add(-1);
        }};
        List<Integer> positiveNumbers = arrayList.stream()
                .filter(num->num>0)
                .collect(Collectors.toList());

        System.out.println(positiveNumbers);
    }
}