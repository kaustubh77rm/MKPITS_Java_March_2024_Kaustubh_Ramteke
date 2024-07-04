package Student_Management;
import java.util.*;

class Student {
    private String studentId;
    private String name;
    private Map<Course, Integer> grades;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new HashMap<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course)
    {
        course.addStudent(this);
    }

    public void recordGrade(Course course, int grade)
    {
        if (grades.containsKey(course))
        {
            grades.replace(course, grade);
        }
        else
        {
            grades.put(course, grade);
        }
    }

    public int getGrade(Course course)
    {
        return grades.getOrDefault(course, -1);
    }

    public String generateTranscript()
        {
        StringBuilder transcript = new StringBuilder();
        transcript.append("Transcript for ").append(name).append(" (ID: ").append(studentId).append("):\n");
        for (Map.Entry<Course, Integer> entry : grades.entrySet())
        {
            transcript.append(entry.getKey().getCourseName()).append(": ").append(entry.getValue()).append("\n");
        }
        return transcript.toString();
    }
}