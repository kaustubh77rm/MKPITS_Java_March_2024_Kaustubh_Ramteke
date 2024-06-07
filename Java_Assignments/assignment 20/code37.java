//37. **Count how many strings in a list contain the letter 'e'.**
package assignment_20;
import java.util.ArrayList;

public class code37 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("once"); add("upon"); add("a"); add("time");
        }};
        long count = arrayList.stream()
                .filter(s -> s.contains("e"))
                .count();

        System.out.println(count);
    }
}