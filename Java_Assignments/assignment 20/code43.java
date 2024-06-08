//43. **Create a list of the first letters of each string in a list.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code43 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("ashoka");
            add("the");
            add("king");
        }};
                List<Character> firstLetters = arrayList.stream()
                .map(str -> str.charAt(0))
                .collect(Collectors.toList());

        System.out.println(firstLetters);
    }
}