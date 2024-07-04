//9. **Check if any string in the list contains the letter 'a'.
package assignment_20;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("kaustubh");
            add("ved");
            add("prakash");
            add("sonu");
        }};

        List<String> stringsWithA = arrayList.stream().filter(s->s.contains("a")).collect(Collectors.toList());
        System.out.println(stringsWithA);
    }
}
