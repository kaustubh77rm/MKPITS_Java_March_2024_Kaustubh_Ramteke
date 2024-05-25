package stud;

import java.util.*;

public class CollectionDomain{

    public static void main(String[] args) {
        //initializing list using list return by aslist method of arrays class
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        //passing another collection to constructor of arraylist
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);
        //initializing arraylist using double braces (anonymous inner class)
        ArrayList<Integer>arrayList1= new ArrayList<Integer>() {{
            add(6);
            add(7);
        }};
        System.out.println(arrayList1);
        List<Integer> list1 = Arrays.asList(9,8,7,8,9);
        System.out.println(list1);
        //remove duplicates
        Set<Integer> set = new HashSet<>(list1);
        System.out.println(set);
        //sort using collections.sort
        Collections.sort(list1);
        System.out.print(list1+" ");

        ArrayList<Student>arrayList2= new ArrayList<>(){{

                add(new Student("kaustubh",78));
                add(new Student("tanay",88));
                add(new Student("rahul",77));
                add(new Student("akash",45));
            }};

        Collections.sort(arrayList2);
        System.out.println(arrayList2);
    }
}