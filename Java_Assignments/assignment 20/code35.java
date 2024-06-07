//35. **Get a list of unique characters from a list of strings.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class code35 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("Do");add("One");add("More");add("Thing");
        }};
        Set<Character> uniqueChars = arrayList.stream()
                .flatMapToInt(String::chars)
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toSet());

        List<Character> uniqueCharList = new ArrayList<>(uniqueChars);
        System.out.println(uniqueCharList);
    }
}
