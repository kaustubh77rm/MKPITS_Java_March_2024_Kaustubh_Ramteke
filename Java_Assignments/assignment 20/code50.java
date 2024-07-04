//50. **Find the shortest string in a list.**
package assignment_20;
import java.util.ArrayList;
import java.util.Comparator;
public class code50 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>(){{
            add("ved");
            add("vedant");
            add("venkatesh");
        }};
        String shortestString = arrayList.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(shortestString);
    }
}