//31. **Sort a list of strings by their lengths.**
package assignment_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class code31 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(){{
            add("apple");add("banana");add("cake");add("sandwich");add("milkshake");
        }};
        Collections.sort(list, Comparator.comparingInt(String::length));

        // Print the sorted list with name and length
        for (String s:list) {
            System.out.println(s + ":" + s.length());
        }
    }
}
