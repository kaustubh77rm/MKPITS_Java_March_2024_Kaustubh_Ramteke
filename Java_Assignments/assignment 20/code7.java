//7. **Count the number of elements in a list.
package assignment_20;

import java.util.LinkedList;
import java.util.Queue;

public class code7 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>(){{
            add(1);add(6);add(8);add(7);add(9);add(3);add(4);add(5);add(2);
        }};
        System.out.println(linkedList.stream().map(a -> a).count());
    }
}
