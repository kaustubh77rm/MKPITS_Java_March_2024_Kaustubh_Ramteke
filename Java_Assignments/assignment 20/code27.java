//27. **Find the string with the minimum length.**
package assignment_20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class code27 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(){{
            add("apple");add("baburao");add("hulk");
        }};
        String minLengthString = list.stream().min(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(minLengthString);
    }
}
