package stud;
import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer>vector= new Vector<>(1,3);
        vector.add(10);
        vector.add(12);
        vector.add(11);
        vector.add(9);
        vector.add(13);

        System.out.println("size: "+vector.size());
        System.out.println("capacity: "+vector.capacity()); // n+n/2+1

        Collections.sort(vector);
        System.out.println("for each loop");
        for(Object o:vector){  //using for each loop
            System.out.print(o+" ");
        }
        System.out.println("\nfor loop");
        for(int i=0;i< vector.size();i++){ //for loop
            System.out.print(vector.get(i)+" ");
        }
        System.out.println("\niterator");
        Iterator<Integer>iterator= vector.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println(vector.clone());

        vector.remove(4);
        System.out.println(vector);
    }
}