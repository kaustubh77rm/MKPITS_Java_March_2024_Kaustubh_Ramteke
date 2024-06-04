//7. Using Predicates:
//Create a list of integers
//and use a stream to filter out numbers greater than 10 using a custom predicate.
package assignment_19;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates1 {
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(1);
            add(2);
            add(11);
            add(3);
            add(12);
            add(10);
        }};

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 10;
            }
        };

        List<Integer> filteredList = arrayList.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}