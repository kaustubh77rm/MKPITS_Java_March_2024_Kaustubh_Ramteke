//47. **Create a set of all uppercase strings from a list.**
package assignment_20;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class code47 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("popeye");add("sailorman");add("POPEYE");add("SAILORman");
        }};
        Set<String> uppercaseSet = arrayList.stream()
                .filter(k -> k.equals(k.toUpperCase()))
                .collect(Collectors.toSet());
        System.out.println(uppercaseSet);
    }
}