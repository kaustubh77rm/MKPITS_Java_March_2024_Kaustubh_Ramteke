//5. **Sort a list of strings alphabetically.
package assignment_20;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code5 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>(){{
            add("d");add("a");add("c");add("e");add("b");
        }};
        System.out.println(list.stream().sorted().map(l->l.toUpperCase()).collect(Collectors.toSet()));
    }
}