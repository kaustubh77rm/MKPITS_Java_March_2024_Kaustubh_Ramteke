//49. **Convert a list of strings to a map where the
// key is the string and the value is its reversed form.**
package assignment_20;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class code49 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("kaustubh");
            add("tanay");
            add("ashay");
        }};
        Map<String, String> stringToReversedMap = arrayList.stream()
                .collect(Collectors.toMap(
                 str -> str,
                 str -> new StringBuilder(str).reverse().toString()
                ));
        System.out.println(stringToReversedMap);
    }
}