//28. **Join a list of strings with a custom separator.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code28 {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>() {{
        add("Sanjay");
        add("Kumar");
    }};
        String joinedString = list.stream().collect(Collectors.joining(""));
        System.out.println(joinedString);
    }
}
