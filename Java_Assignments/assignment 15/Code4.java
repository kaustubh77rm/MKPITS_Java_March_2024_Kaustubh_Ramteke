package assn_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(20);
        arrayList.add(35);
        arrayList.add(62);
        arrayList.add(14);
        System.out.print("enter index:");
        int index= s.nextInt();
        System.out.println(arrayList.get(index));
        System.out.println(arrayList);
    }
}
