//Program 2
//Given five positive integers,
//find the minimum and maximum values that can be
//calculated by summing exactly four of the five integers.
//Then print the respective minimum and maximum values as a single line
//of two space-separated long integers.
//E.g. arr = [9,5,3,7,1]
//The minimum is 1+3+5+7 = 16 and the maximum is sum is 3+5+7+9 = 24.
//Then print 16 24
package assignment_21;
import java.util.ArrayList;
import java.util.Collections;

public class code2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(5);add(9);add(1);add(7);add(3);
        }};
        Collections.sort(arrayList);
        long minSum=0;
        for (int i=0; i<4; i++) {
            minSum += arrayList.get(i);
        }
        long maxSum = 0;
        for (int i=1; i<5; i++) {
            maxSum += arrayList.get(i);
        }
        System.out.println("min 4 sum: "+minSum + "\nmax 4 sum: " + maxSum);
    }
}