//19. **Check if all strings in the list are non-empty.**
package assignment_20;

import java.util.ArrayList;

public class code19 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("a");add("c");add("e");add("d");add("b");add("");
        }};

        boolean allNonEmpty = arrayList.stream().allMatch(str -> !str.isEmpty());
        if (allNonEmpty) {
            System.out.println("all strings are non-empty");
        } else {
            System.out.println("empty strings in the list");
        }
    }
}
