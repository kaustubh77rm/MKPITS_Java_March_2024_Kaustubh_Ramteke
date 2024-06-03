//### Problem 3: Sorted Unique Elements
//**Objective:** Develop a program that takes a list of integers from user input,
// removes duplicates, and sorts the remaining elements.
//**Requirements:**
//- Use `TreeSet` to store the integers in a sorted and unique manner.
//- Allow the user to input a list of integers (possibly with duplicates).
//- Print the elements of the `TreeSet` in ascending order.
package assn_17;
import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        int integer;
        Scanner s = new Scanner(System.in);
        TreeSet<Integer>treeSet=new TreeSet<>();
        while(true){
            try{
                System.out.print("(to exit write exit)\nadd:");
                integer=s.nextInt();
                treeSet.add(integer);
            }
            catch(Exception e){
                System.out.print(treeSet+" ");
            }
            String str=s.nextLine();
            if(str.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}