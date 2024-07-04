//44. **Find the string with the most occurrences of the letter 'a'.**
package assignment_20;
import java.util.ArrayList;
import java.util.Comparator;

public class code44 {
    public static int countA(String str) {
        return (int) str.chars().filter(ch->ch=='a'||ch=='A').count();
    }
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("Gajanan"); add("Banana"); add("ananas");
            add("orange"); add("mango"); add("grapes");
        }};
        String maxAString = arrayList.stream()
                .max(Comparator.comparingInt(code44::countA))
                .orElse(null);
        System.out.println(maxAString);
    }
}