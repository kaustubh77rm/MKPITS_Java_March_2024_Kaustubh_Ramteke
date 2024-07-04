//39. **Calculate the average length of strings in a list.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class code39 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("mumbai indians"); add("kolkata knight riders");
            add("liverpool fc"); add("manchester united");
        }};
        Map<Integer, List<String>> lengthToStringsMap = arrayList.stream()
                .collect(Collectors.
                        groupingBy(String::length));

        double averageLength = arrayList.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.println(averageLength);
    }
}