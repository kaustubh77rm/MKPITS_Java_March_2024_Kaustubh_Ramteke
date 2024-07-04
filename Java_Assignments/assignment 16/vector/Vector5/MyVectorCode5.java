package assn_16.vector.Vector5;
import java.util.*;
import java.io.*;

public class MyVectorCode5 {
    public void serialize(Vector<Student> vector, String filenameString) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filenameString);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(vector);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserialize(String filenameString) {
        try (FileInputStream fileInputStream = new FileInputStream(filenameString);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Vector<Student> deserializedVector = (Vector<Student>) objectInputStream.readObject();
            System.out.println(deserializedVector);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Vector<Student> vector = new Vector<>();
        vector.add(new Student(21, "anshul"));
        vector.add(new Student(22, "bablu"));
        System.out.println("Original vector: " + vector);

        MyVectorCode5 m = new MyVectorCode5();
        m.serialize(vector, "C:\\TURBOC3\\BIN\\Java\\MyProject\\assn_16\\vector\\Vector5\\vectortext.txt");

        // Deserialize and display the contents
        m.deserialize("C:\\TURBOC3\\BIN\\Java\\MyProject\\assn_16\\vector\\Vector5\\vectortext.txt");
    }
}