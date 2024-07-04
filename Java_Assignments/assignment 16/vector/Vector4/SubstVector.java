package assn_16.vector.Vector4;
import java.util.*;

public class SubstVector {
    public void minus(Vector<Integer> vector, Vector<Integer> vector2) {
        Vector<Integer>vector3=new Vector<Integer>();

        for (int i=0; i<vector.size(); i++) {
            vector3.add(vector.get(i)-vector2.get(i));
        }
        System.out.println(vector3);
    }

    public static void main(String[] args) {
        Vector<Integer> vector1=new Vector<Integer>();

        vector1.add(6);
        vector1.add(11);
        vector1.add(19);

        Vector<Integer> vector2=new Vector<Integer>();

        vector2.add(3);
        vector2.add(5);
        vector2.add(3);
        vector2.add(9);
        vector2.add(10);

        SubstVector s = new SubstVector();
        s.minus(vector1, vector2);
    }
}
