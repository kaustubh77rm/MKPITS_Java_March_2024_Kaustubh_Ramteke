//32. **Calculate the total length of all strings in the list.**
package assignment_20;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class code32 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(){{
            add("amravati"); add("pune"); add("nagpur"); //8+4+6=18
        }};
        int totalLength = arrayList.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(totalLength);
    }
}