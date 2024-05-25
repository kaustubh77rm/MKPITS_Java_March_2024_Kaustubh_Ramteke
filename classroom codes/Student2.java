package stud;
import java.io.*;

public class Student2 implements Serializable {
    private String name;
    private int marks;

    public Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "\n" + name + "\n" + marks;
    }

    public static void writeStudentToFile(Student2 student, String filePath) {
        // to write object to file
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(student);
            System.out.println("Data written to the file.");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void readStudentFromFile(String filePath) {
        Student2 student;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            student = (Student2) objectInputStream.readObject();
            System.out.println("\nData reading from the file: " + student);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
    public void showResult(){
        if(marks>35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        Student2 student = new Student2("Ashay", 34);
        writeStudentToFile(student, "abc.txt");
        readStudentFromFile("abc.txt");
        student.showResult();
    }
}