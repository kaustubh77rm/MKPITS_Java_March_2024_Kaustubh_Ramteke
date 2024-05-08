package Student_Management;
import java.util.*;

public class Course
{
    private String courseId;
    private String courseName;
    private int capacity;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName, int capacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
        } else {
            System.out.println("Course is already full.");
        }
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
/*
                Student student1 = new Student("01", "Tanay");
                Student student2 = new Student("02", "Ashay");

                Course mathCourse = new Course("C1", "Math", 20);
                Course scienceCourse = new Course("C2", "Science", 15);

                student1.enrollCourse(mathCourse);
                student1.enrollCourse(scienceCourse);
                student2.enrollCourse(mathCourse);
                student2.enrollCourse(scienceCourse);

                student1.recordGrade(mathCourse, 90);
                student1.recordGrade(scienceCourse,79);
                student2.recordGrade(mathCourse, 85);
                student2.recordGrade(scienceCourse, 88);

                System.out.println(student1.generateTranscript());
                System.out.println(student2.generateTranscript());

 */