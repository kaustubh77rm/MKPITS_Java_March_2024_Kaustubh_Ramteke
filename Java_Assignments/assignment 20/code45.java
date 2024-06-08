//45. **Remove duplicates from a list of strings while preserving order.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code45 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("a");add("b");add("a");add("c");add("b");add("d");
        }};
        List<String> uniqueList = arrayList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}