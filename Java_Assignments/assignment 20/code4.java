//4. **Convert a list of strings to uppercase.
package assignment_20;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class code4 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("a");add("b");add("c");add("d");
        }};
        System.out.println(arrayList.stream().map(a->a.toUpperCase()).collect(Collectors.toSet()));
    }
}