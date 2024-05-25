package stud;

public abstract class Employee
{
    private String name;
    private String dept;
    private String title;
    private int id;
    private int age;

    public void setEmployeeDetails(String name, String dept, String title, int id, int age) {
        this.name = name;
        this.dept = dept;
        this.title = title;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateSalary();
}