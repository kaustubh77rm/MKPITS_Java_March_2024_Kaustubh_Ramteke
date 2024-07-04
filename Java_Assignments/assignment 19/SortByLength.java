//5. Grouping and Counting:
//Create a list of strings and use a stream to group them
//by their length, and then count the number of strings in each group.

package assignment_19;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(){{
            add("Mutthuswami"); //11
            add("Karunanidhi"); //11
            add("Annaswami");   //9
            add("Jaykumar");    //8
        }};
        Map<Integer,Long> sortedlist=list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(sortedlist);
    }
}