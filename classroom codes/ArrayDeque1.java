package stud;
import java.util.*;

public class ArrayDeque1 {

    public static void main(String[] args) {
        ArrayDeque1 arrayDeque1 = new ArrayDeque1();
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.add(7);
        arrayDeque.add(8);
        arrayDeque.add(9);
        System.out.println(arrayDeque);
        System.out.println("getFirst:"+arrayDeque.getFirst());
        System.out.println("getLast:"+arrayDeque.getLast());
        System.out.println("peek:"+arrayDeque.peek());
        System.out.println(arrayDeque.isEmpty());

        Iterator<Integer>iterator = arrayDeque.descendingIterator();
        while((iterator.hasNext())){
            System.out.print(iterator.next()+" ");
        }
    }
}