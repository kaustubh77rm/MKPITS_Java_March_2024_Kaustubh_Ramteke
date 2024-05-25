package stud;
import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(35);
        priorityQueue.add(25);
        priorityQueue.add(30);
        priorityQueue.add(40);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        
    }
}