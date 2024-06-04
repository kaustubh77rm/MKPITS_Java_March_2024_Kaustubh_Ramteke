//3. Sorting:
//Create a list of strings and use a stream to sort them in ascending order.
package assignment_19;
import java.util.ArrayList;
import java.util.List;

public class SortingUsingStream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(){{
            add("C");
            add("D");
            add("A");
            add("B");
        }};
        System.out.println(list);
        List<String>newlist=list.stream().sorted().toList();
        System.out.println(newlist);
    }
}
