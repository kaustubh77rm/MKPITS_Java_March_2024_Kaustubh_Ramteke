package assn_16.vector.Vector4;

import java.util.*;

public class AdditionVector {
    public void sum(Vector<Integer> vector,Vector<Integer> vector2) {
        Vector<Integer>vector3=new Vector<Integer>();

        for (int i = 0; i < vector.size(); i++) {
            vector3.add(vector.get(i)+vector2.get(i));
        }
        System.out.println(vector3);
    }

    public static void main(String[] args) {
        Vector<Integer> vector1=new Vector<Integer>();

        vector1.add(1);
        vector1.add(2);
        vector1.add(3);

        Vector<Integer> vector2=new Vector<Integer>();

        vector2.add(6);
        vector2.add(7);
        vector2.add(8);
        vector2.add(9);
        vector2.add(10);

        AdditionVector a=new AdditionVector();
        a.sum(vector1, vector2);
    }
}