package stud;
import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<>();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");
        System.out.print("stack elements: ");
        for(Object o:stack){
            System.out.print(o+" ");
        }

        stack.push("E");
        System.out.print("\nAfter push:");
        System.out.print(stack);

        stack.pop();
        System.out.print("\nAfter pop:");
        System.out.print(stack);

        stack.pop();
        System.out.print("\nAfter pop:");
        System.out.print(stack);

        System.out.println("\npeek:"+stack.peek());
        System.out.println(stack.empty());
    }
}