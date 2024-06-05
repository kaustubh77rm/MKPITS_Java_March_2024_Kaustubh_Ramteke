//10. **Concatenate all strings in the list, separated by commas.
package assignment_20;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class code10 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("abc");add("pqr");add("xyz");
        }};
        System.out.println(arrayList.stream().map(k -> k).collect(Collectors.joining(",")));
    }
}
