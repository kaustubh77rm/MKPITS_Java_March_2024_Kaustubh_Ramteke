//34. **Reverse the order of a list of strings.**
package assignment_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class code34 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("daabra"); add("ka"); add("aabra");
        }};
        List<String> reverseList = arrayList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),lst-> {
                 Collections.reverse(lst);
                 return lst;
                }));
        reverseList.forEach(System.out::println);
    }
}