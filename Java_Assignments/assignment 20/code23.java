//23. **Convert a list of integers to an array.**
package assignment_20;
import java.util.ArrayList;
import java.util.List;

public class code23 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        int[] array = arrayList.stream().mapToInt(Integer::intValue).toArray();
        for (int num : array)
        {
            System.out.println(num);
        }
    }
}