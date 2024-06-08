//41. **Concatenate a list of lists of strings into a single list of strings.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code41 {
    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(new ArrayList<String>() {{
            add("volkswagen");
            add("maruti");
        }});
        listOfLists.add(new ArrayList<String>() {{
            add("tata");
            add("audi");
        }});

        List<String> concatenatedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(concatenatedList);
    }
}