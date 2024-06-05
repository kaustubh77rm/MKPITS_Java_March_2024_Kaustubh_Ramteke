//13. **Group a list of strings by their length.**
package assignment_20;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class code13 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("Dhokla");add("Paratha");add("Naan");add("South Indian");
        }};
        Map<Integer, List<String>> groupedByLength = arrayList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
    }
}