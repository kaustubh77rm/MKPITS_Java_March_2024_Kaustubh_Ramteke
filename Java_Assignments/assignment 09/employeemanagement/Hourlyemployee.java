package employeemanagement;
import java.util.Scanner;

public class Hourlyemployee extends Employee{

    public Hourlyemployee(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter hourly salary:");
        int hourlysalary = s.nextInt();
        System.out.println("enter name:");
        String name1=s.next();
    }

    @Override
    public void calSalary() {
        super.calSalary();
        System.out.println("hourly salary:");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("name:");
    }
}