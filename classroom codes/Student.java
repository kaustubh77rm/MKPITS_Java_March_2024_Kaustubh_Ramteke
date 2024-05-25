package stud;

public class Student implements Comparable<Student>
{
    public String name;
    public int marks;

    public Student(String name, int marks)
    {
    this.name=name;
    this.marks=marks;
    }

    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return name.compareTo(((Student)o).name);
    }
}