//8. FlatMap:
//Create a list of lists of integers and use a stream to flatten the structure
// (i.e., merge all the lists into one) and then calculate the sum of all the integers.
package assignment_19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;

public class FlatmapCode {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>() {{
            add(1);add(2);add(3);
        }};
        ArrayList<Integer> arrayList2 = new ArrayList<>() {{
            add(4);add(5);add(6);
        }};
        ArrayList<Integer> arrayList3 = new ArrayList<>() {{
            add(7);add(8);add(9);
        }};

        List<Integer> combinedList = Stream.of(arrayList1, arrayList2, arrayList3).flatMap(List::stream).collect(Collectors.toList());
        int sum = combinedList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum:"+sum);
    }
}
