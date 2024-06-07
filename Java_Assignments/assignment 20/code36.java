//36. **Create a comma-separated string from a list of integers.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code36 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>() {{
            add(1);add(2);add(3);
        }};
        String commaSeparated=integerList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(commaSeparated);
    }
}
