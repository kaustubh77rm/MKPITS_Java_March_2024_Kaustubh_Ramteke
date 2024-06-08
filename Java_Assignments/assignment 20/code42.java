//42. **Filter out strings that are palindromes.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code42 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("pop");add("dad");add("papa");add("mom");
        }};

        List<String> filteredList = arrayList.stream()
                .filter(str -> !isPalindrome(str))
                .collect(Collectors.toList());

        System.out.println(filteredList);
    }
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}