package stud;
import java.util.*;

public class CollectionDemoMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        arrayList.add(10);
        arrayList.add(76);
        arrayList.add(55);
       /* arrayList.add("rajesh koothrapali");
        String mts = "mutthuswami";
        arrayList.add(mts.toUpperCase());
        arrayList.add(55.55); */
        arrayList.set(0, 1);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
//        System.out.println(mts.toUpperCase());
//        System.out.println(arrayList.get(3).toString().toUpperCase());
        System.out.println(arrayList.indexOf(5));
        System.out.println(arrayList.size());
//        System.out.println(arrayList.contains("rajesh koothrapali"));
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.hashCode());
        System.out.println(arrayList.iterator());
        arrayList.add(2, 87);
        Collections.sort(arrayList);
        for (Object o : arrayList) {
            System.out.println(o);
        }

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Astronaut");
        arrayList1.add("Pilot");
        arrayList1.add("Driver");
        System.out.print("arrayList1: ");
        for (Object object : arrayList1) {
            System.out.print(object + " ");
        }

        LinkedList linkedList = new LinkedList();
        linkedList.add("Kaustubh");
        linkedList.add("Rahul");
        linkedList.add("Animesh");
        System.out.print("\nlinkedList: ");
        for (Object ob : linkedList) {
            System.out.print(ob + " ");
        }

        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(21);
        linkedList1.add(30);
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2.add(11);
        linkedList2.add(44);
        linkedList1.addAll(linkedList2);
        System.out.println("\n" + linkedList1);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print("ob:");
            for (Iterator it = iterator; it.hasNext(); ) {
                Object ob = it.next();
                System.out.print(" "+ob);
            }
        }

        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.addAll(linkedList1);
        System.out.print("\nset: "+set);
    }
}