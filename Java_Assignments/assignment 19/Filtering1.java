//Create a list of strings and use a stream to
//filter out strings that start with the letter "A".
//Collect the filtered strings into a new list.
package assignment_19;
import java.util.*;
import java.util.stream.Collectors;

public class Filtering1 {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>() {{
            add("A");
            add("AB");
            add("BC");
            add("ABC");
            add("BCA");
        }};

        List<String> filteredList = originalList.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
