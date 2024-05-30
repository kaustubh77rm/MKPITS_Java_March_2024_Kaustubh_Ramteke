package assn_16.arraydeque;
import java.util.*;

public class Arraydeque1 {
    public void palindromecheck(String string) {
        boolean result=true;
        ArrayDeque<Character> arrayDeque=new ArrayDeque<Character>();
        char[] c=string.toCharArray();
        for (char d : c) {
            arrayDeque.add(d);
        }
        while (!arrayDeque.isEmpty()) {
            Character firstCharacter=arrayDeque.pollFirst();
            Character lastCharacter=arrayDeque.pollLast();

            if (firstCharacter!=lastCharacter) {
                result=false;
                break;
            }
            else {
                continue;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Arraydeque1 myarraydequeue=new Arraydeque1();
        System.out.print("enter string:");
        String str = s.nextLine();
        myarraydequeue.palindromecheck(str);
    }
}