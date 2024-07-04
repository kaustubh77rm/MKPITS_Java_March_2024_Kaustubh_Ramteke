//26. **Remove null elements from a list.**
 package assignment_20;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class code26 {
    public static void main(String[] args) {
    List<String>list=new ArrayList<>(){{
    add(null);add("apple");add(null);add("cat");
    }};
        List<String> filteredList = list.stream().filter(k->k!=null).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}