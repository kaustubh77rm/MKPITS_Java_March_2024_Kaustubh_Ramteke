//9. Parallel Stream:
//Modify one of the previous assignments to use
// a parallel stream and compare the performance with the sequential stream.
package assignment_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreams_9 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>() {{
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

        List<Integer> filteredList = list.stream().filter(predicate).collect(Collectors.toList());

        System.out.println(list.parallelStream().collect(Collectors.toSet()));
        System.out.println(list.stream().sequential().collect(Collectors.toSet()));
    }
}