package assn_15;

import java.util.ArrayList;
import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(98);
        a.add(12);
        a.add(21);
        a.add(34);
        a.add(45);
        Scanner s = new Scanner(System.in);
        System.out.print("enter element to search: ");
        int search = s.nextInt();
        if(a.contains(search)){
            System.out.println("at index "+a.indexOf(search));
            System.out.println(a);
        }
        else{
            System.out.println("not in arraylist");
            System.out.println(a);
        }
    }
}