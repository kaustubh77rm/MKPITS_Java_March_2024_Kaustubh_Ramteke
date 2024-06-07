//24. **Limit the list to the first 3 elements.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;

public class code24 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(){{
            add("a");add("b");add("c");
            add("d");add("e");add("f");
            add("g");add("h");add("i");
        }};
        List<String> limitedList = list.stream().limit(3).toList();
        limitedList.forEach(System.out::println);
    }
}
