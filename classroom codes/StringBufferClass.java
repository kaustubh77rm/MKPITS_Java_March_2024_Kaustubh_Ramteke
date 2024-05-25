package stud;
import java.io.*;

public class StringBufferClass {
    public void display(){
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter name: ");
            String name = b.readLine();
            System.out.print("Enter age: ");
            String age = b.readLine();

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        StringBufferClass s = new StringBufferClass();
        s.display();
    }
}