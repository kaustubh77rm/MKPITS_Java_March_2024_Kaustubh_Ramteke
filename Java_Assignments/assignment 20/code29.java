//29. **Find the frequency of each string in a list.**
package assignment_20;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class code29 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("anuj");add("amit");add("anu");
            add("anuj");add("anuj");add("shlok");
            add("shlok");add("amit");add("anu");
        }};
        Map<String, Long> frequencyMap = arrayList.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        frequencyMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
