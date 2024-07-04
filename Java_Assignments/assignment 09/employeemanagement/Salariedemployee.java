package employeemanagement;

public class Salariedemployee extends Employee{
    private int yearlysalary;
    private String name2;

    public Salariedemployee(int yearlysalary, String name2) {
        this.yearlysalary=yearlysalary;
        this.name2=name2;
    }

    @Override
    public void calSalary() {
        super.calSalary();
    }
}