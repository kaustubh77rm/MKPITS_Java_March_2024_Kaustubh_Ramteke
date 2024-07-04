package assgn_14.arraylist;
import stud.Student;

import java.util.*;

public class StudentManagement1 {
    private ArrayList<StudentManagement> students;

    public StudentManagement1() {
        this.students = new ArrayList<>();
    }

    // add a student
    public void addStudent(StudentManagement student) {
        students.add(student);
    }

    // remove a student by ID
    public boolean removeStudent(int id) {
        for (StudentManagement student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    // search for a student by ID
    public StudentManagement searchStudent(int id) {
        for (StudentManagement student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // display all students
    public void displayAllStudents() {
        for (StudentManagement student : students) {
            System.out.println(student);
        }
    }

    // display students sorted by grades
    public void displayStudentsSortedByGrades() {
        Collections.sort(students, Comparator.comparingDouble(StudentManagement::getGrade));
        displayAllStudents();
    }

    // main method to test the functionality
    public static void main(String[] args) {

        StudentManagement1 sms = new StudentManagement1();

        sms.addStudent(new StudentManagement(3, "tanay", 88));
        sms.addStudent(new StudentManagement(1, "ashay", 91));
        sms.addStudent(new StudentManagement(2, "rahul", 85));

        System.out.println("All students:");
        sms.displayAllStudents();

        System.out.println("\nStudent with ID 1:");
        System.out.println(sms.searchStudent(1));

        System.out.println("\nRemoving student with ID 1:");
        sms.removeStudent(1);
        sms.displayAllStudents();

        System.out.println("\nStudents sorted by grades:");
        sms.displayStudentsSortedByGrades();
    }
}