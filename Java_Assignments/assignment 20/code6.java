//6. **Get a list of unique numbers from a list with duplicates.
package assignment_20;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

public class code6 {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>(){{
            add(1);add(1);add(1);add(3);add(2);add(2);
        }};
        System.out.println(stack.stream().map(a -> a).distinct().collect(Collectors.toSet()));
    }
}