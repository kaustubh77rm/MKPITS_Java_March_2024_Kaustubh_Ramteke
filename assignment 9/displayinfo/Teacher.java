package displayinfo;

public class Teacher extends Person {
    private int employeeId;

    public Teacher(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
}