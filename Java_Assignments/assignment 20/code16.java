//16. **Remove the first element from a list using streams.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code16 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>(){{
            add(146);add(435);add(35);add(15);add(12);
        }};
        List<Integer> modifiedList = arrayList.stream().skip(1).collect(Collectors.toList());
        System.out.println(modifiedList);
    }
}
