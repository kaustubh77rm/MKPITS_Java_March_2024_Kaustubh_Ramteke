package assgn_14.arraylist;

public class StudentManagement implements Comparable<StudentManagement> {
    private int id;
    private String name;
    private int grade;

    public StudentManagement(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getters and setters for id, name, and grade
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(StudentManagement o) {
        return Integer.compare(this.grade, o.grade);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + '}';
    }
}