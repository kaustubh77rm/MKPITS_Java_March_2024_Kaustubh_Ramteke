package stud;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(4); linkedHashSet.add(2); linkedHashSet.add(3);
        linkedHashSet.add(3); linkedHashSet.add(1); linkedHashSet.add(1);

        for(Object o:linkedHashSet){
            System.out.print(o+" ");
        }
    }
}
