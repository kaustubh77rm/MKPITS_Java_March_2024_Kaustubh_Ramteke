package stud;

import java.lang.*;
import java.util.*;

public class LinkedListMethod1{
    public static void main(String[] arguments) {
//        LinkedList<Integer> linkedList=new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        System.out.println(linkedList.peek());
//        System.out.println(linkedList.get(2));
//        System.out.println(linkedList.element());
//        System.out.println(linkedList.poll());
//        System.out.println(linkedList.peekFirst());



//        Queue<Integer>queue=new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        System.out.println(queue.offer(4));
//        queue.offer(5); //offer adds element at the last
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());  //false
//        System.out.println(queue.contains(1)); //true
//        System.out.println(queue.contains(6));  //false
//        queue.poll();
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        queue.offer(1);
//        System.out.println(queue);

        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(20);

//        Iterator<Integer>iterator= arrayList.iterator();
//        Collections.sort(arrayList);
//        while(iterator.hasNext()){ //printing using iterator interface
//            System.out.println(iterator);
//        }

        Collections.sort(arrayList);
        ListIterator listIterator= arrayList.listIterator();

        System.out.println("next method");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("previous method");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}