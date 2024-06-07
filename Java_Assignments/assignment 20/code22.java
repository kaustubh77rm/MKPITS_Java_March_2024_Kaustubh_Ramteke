//22. **Find the first string that starts with the letter 'A'.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code22 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(){{
            add("Baba"); add("Aaba");add("Kaka");add("Mama");add("Aappa");
        }};
        List<String> resultList = list.stream().filter(s -> s.startsWith("A")).limit(1).collect(Collectors.toList());
        System.out.println(resultList.get(0));
    }
}