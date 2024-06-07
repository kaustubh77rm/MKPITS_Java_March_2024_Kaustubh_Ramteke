//33. **Filter out negative numbers from a list of integers.**
package assignment_20;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code33 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>(){{
            add(-1);add(51);add(16);add(7);add(1);add(-5);
        }};
        List<Integer>positiveNumbers = arrayList.stream()
                .filter(number->number>=0)
                .collect(Collectors.toList());

        System.out.println(positiveNumbers);
    }
}