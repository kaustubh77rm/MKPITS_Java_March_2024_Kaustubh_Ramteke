package Student_Management;
import java.util.*;
public class Instructor
{
    private String instructorId;
    private String name;
    private List<Course> coursesTeaching;

    public Instructor(String instructorId, String name) {
        this.instructorId = instructorId;
        this.name = name;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getInstructorId() {
        return instructorId;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public List<Course> getCoursesTeaching() {
        return coursesTeaching;
    }
}