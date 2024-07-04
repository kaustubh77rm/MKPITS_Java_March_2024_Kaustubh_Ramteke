//Partition a list of integers into even and odd.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class code14 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(1);add(2);add(3);add(4);add(5);add(6);
        }};

        Map<Boolean, List<Integer>> partitioned = arrayList.stream().collect(Collectors.partitioningBy(k->k%2==0));

        System.out.println("even numbers: " + partitioned.get(true));
        System.out.println("odd numbers: " + partitioned.get(false));
    }
}