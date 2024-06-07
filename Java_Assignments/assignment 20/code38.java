//38. **Create a map of string lengths and their corresponding strings.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class code38 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("kaustubh"); add("rahul"); add("ashuba");
        }};
        Map<Integer,List<String>> lengthToStringsMap = arrayList.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(lengthToStringsMap);
    }
}
