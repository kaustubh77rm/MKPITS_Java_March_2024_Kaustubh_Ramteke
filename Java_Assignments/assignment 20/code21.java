//**Create a map from a list of strings with the string as the key
// and its length as the value.**
package assignment_20;
import java.util.*;
import java.util.stream.Collectors;

public class code21 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date");
        Map<String, Integer> stringLengthMap = stringList.stream().collect(Collectors.toMap(str->str, str->str.length()));
        stringLengthMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
