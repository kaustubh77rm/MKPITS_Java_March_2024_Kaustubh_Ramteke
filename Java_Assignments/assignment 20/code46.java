//46. **Filter out numbers greater than a specified value.**
package assignment_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class code46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(2); add(1); add(18); add(374); add(135); add(35);
        }};
        System.out.print("Enter the specified value:");
        int specifiedValue = scanner.nextInt();
        List<Integer> filteredList = arrayList.stream()
                .filter(k -> k <= specifiedValue)
                .collect(Collectors.toList());
        System.out.println("greater numbers filtered");
        System.out.println("filtered List: " + filteredList);
    }
}