package stud;
import java.io.*;
import java.util.*;

public class Student3 implements Serializable {
    private String name;
    private int marks;

    public Student3(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] kalaignar) {
        String name, choice;
        int marks;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter Name: ");
                name = scanner.next();
                System.out.print("Enter Marks: ");
                marks = scanner.nextInt();
                Student3 student = new Student3(name, marks); // Create Student3 object with input data
                objectOutputStream.writeObject(student);
                System.out.println("Do you want to store another student info(Y/N)");
                choice = scanner.next();
            } while(choice.equalsIgnoreCase("y"));

            objectOutputStream.close(); // Close ObjectOutputStream

            // Read and display stored data
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
            System.out.println("stored information:");
            try {
                while (true) {
                    Student3 student = (Student3) objectInputStream.readObject();
                    System.out.println("name: " + student.getName() + ", marks: " + student.getMarks());
                }
            } catch (Exception e) {
                // Reached end of file
            }

            objectInputStream.close(); // Close the ObjectInputStream
        } catch (Exception e){
            System.out.println(e);
        }
    }
}