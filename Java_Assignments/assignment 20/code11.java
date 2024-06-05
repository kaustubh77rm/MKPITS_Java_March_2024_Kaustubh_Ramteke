//11. **Filter out strings with length less than 5.**
package assignment_20;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class code11 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("Kaustubh");add("Tanay");add("Ashay");add("Anushree");add("Vedu");
        }};
        ArrayList<String> filteredList = arrayList.stream().filter(s->s.length()<5).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(filteredList);
    }
}