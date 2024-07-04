//48. **Calculate the sum of squares of a list of integers.**
package assignment_20;
import java.util.ArrayList;
public class code48 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(1);add(2);add(3);add(4);
        }};
        int squares = arrayList.stream()
                .mapToInt(k->k*k)
                .sum();
        System.out.println(squares);
    }
}