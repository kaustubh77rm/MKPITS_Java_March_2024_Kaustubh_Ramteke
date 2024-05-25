package stud;
import java.io.*;
import java.util.Scanner;

public class Student4 implements Serializable {
    private String name;
    private int marks;

    public Student4(String name, int marks) {
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

    public static void main(String[] args) {
        String name, choice, searchName;
        int marks;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter Name: ");
                name = scanner.next();
                System.out.print("Enter Marks: ");
                marks = scanner.nextInt();
                Student4 student = new Student4(name, marks); // Create Student4 object with input data
                objectOutputStream.writeObject(student);
                System.out.println("Do you want to store another student info(Y/N)");
                choice = scanner.next();
            } while(choice.equalsIgnoreCase("y"));
            objectOutputStream.close(); // Close ObjectOutputStream

            // Open ObjectInputStream to read from the file
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
            System.out.println("Student data stored:");
            try {
                while (true){
                    Student4 student = (Student4) objectInputStream.readObject();
                    System.out.println("Name: " + student.getName() + ", Marks: " + student.getMarks());
                }
            } catch (EOFException e) {
                // End of file reached
            }
            objectInputStream.close(); // Close ObjectInputStream

            // Search for data
            System.out.print("\nEnter the name to search: ");
            searchName = scanner.next();
            ObjectInputStream searchInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
            boolean found = false;
            try {
                while (true) {
                    Student4 student = (Student4) searchInputStream.readObject();
                    if (student.getName().equalsIgnoreCase(searchName)) {
                        System.out.println("Found: \nName: " + student.getName() + ", Marks: " + student.getMarks());
                        found = true;
                    }
                }
            } catch (Exception e){
                // End of file
            }
            searchInputStream.close(); // Close search ObjectInputStream
            if (!found) {
                System.out.println("not found");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}