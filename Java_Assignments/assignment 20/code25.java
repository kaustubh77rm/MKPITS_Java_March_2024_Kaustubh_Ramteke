//25. **Skip the first 2 elements in a list.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;

public class code25 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(){{
            add("a");add("b");add("c");
            add("d");add("e");add("f");
            add("g");add("h");add("i");
        }};
        List<String>newList=list.stream().skip(2).toList();
        newList.forEach(System.out::println);
    }
}
