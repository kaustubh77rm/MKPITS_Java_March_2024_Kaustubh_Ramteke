//17. **Find the second highest number in a list of integers.**
package assignment_20;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(14);add(122);add(35);add(453);add(122);
        }};

        List<Integer> sortedList = arrayList.stream().distinct().sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println("second highest number: " + sortedList.get(1));
    }
}
