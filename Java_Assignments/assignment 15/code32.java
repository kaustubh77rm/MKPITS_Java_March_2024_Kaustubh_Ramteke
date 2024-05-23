package assn_15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class code32 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(10);
        linkedList.add(31);
        linkedList.add(10);
        linkedList.add(23);
        linkedList.add(44);
        Scanner s=new Scanner(System.in);
        System.out.print("enter element:");
        int element=s.nextInt();
        Iterator<Integer>iterator= linkedList.iterator();
        while(iterator.hasNext()){
            if(iterator.next()==element){
                System.out.println(linkedList.indexOf(iterator.next()));
            }
        }
    }
}
