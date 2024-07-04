//20. **Flatten a list of lists into a single list.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class code20 {
    public static void main(String[] args) {
        ArrayList<String>arrayList1=new ArrayList<>(){{
            add("a");add("b");add("c");
        }};
        ArrayList<String>arrayList2=new ArrayList<>(){{
            add("p");add("q");add("r");
        }};
        ArrayList<String>arrayList3=new ArrayList<>(){{
            add("x");add("y");add("z");
        }};
        List<String> flattenedList = Stream.of(arrayList1, arrayList2, arrayList3).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flattenedList);
    }
}