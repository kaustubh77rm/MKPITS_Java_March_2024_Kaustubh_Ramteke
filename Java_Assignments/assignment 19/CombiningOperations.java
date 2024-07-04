//4. Combining Operations:
//Create a list of integers and use a stream to filter out the even numbers,
//double each remaining number, and then find the sum of the doubled numbers.
package assignment_19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CombiningOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        List<Integer> evennumbers = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> oddnumbers = list.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
        List<Integer> doubledNumbers = oddnumbers.stream().map(number -> number * 2).collect(Collectors.toList());
        int sum = doubledNumbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Original list: " + list);
        System.out.println("Even numbers: "+evennumbers);
        System.out.println("Remaining odd numbers: " + oddnumbers);
        System.out.println("Doubled odd numbers: " + doubledNumbers);
        System.out.println("Sum of doubled odd numbers: " + sum);
    }
}