//12. **Find the longest string in the list.**
package assignment_20;
import java.util.ArrayList;
import java.util.Comparator;

public class code12 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
        add("a"); add("boy"); add("in"); add("the"); add("park");
        }};
        System.out.println(arrayList.stream().max(Comparator.comparingInt(String::length)).orElse(""));
    }
}