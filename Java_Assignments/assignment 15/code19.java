package assn_15;
import java.util.*;

public class code19 {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        Vector<Integer>v=new Vector<>(a);
        System.out.println(""+v.capacity());
        System.out.println(""+v.size());
    }
}