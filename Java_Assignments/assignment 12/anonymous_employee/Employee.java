package anonymous_employee;

public interface Employee {
public double calculateSalary();
public void displayDetails();

    public static void main(String[] args) {
        Employee fullTimeEmployee = new Employee() {
            private String name = "Kaustubh";
            private double salary = 5000.0;

            @Override
            public double calculateSalary() {
                return salary;
            }

            @Override
            public void displayDetails() {
                System.out.println("Full-time Employee");
                System.out.print("Name: " + name+",");
                System.out.print(" Salary: ₹" + calculateSalary());
            }
        };

        // Part-time Employee
        Employee partTimeEmployee = new Employee() {
            private String name = "Tanay";
            private double hourlyRate = 55;
            private int hoursWorked = 20;

            @Override
            public double calculateSalary() {
                return hourlyRate * hoursWorked;
            }

            @Override
            public void displayDetails() {
                System.out.println("Part-time Employee");
                System.out.print("Name: " + name+",");
                System.out.print(" Salary: ₹" + calculateSalary());
            }
        };

        // Contract-based Employee
        Employee contractEmployee = new Employee() {
            private String name = "Rahul";
            private double contractAmount = 1000.0;

            @Override
            public double calculateSalary() {
                return contractAmount;
            }

            @Override
            public void displayDetails() {
                System.out.println("Contract-based Employee");
                System.out.print("Name: " + name+",");
                System.out.print(" Salary: ₹" + calculateSalary());
            }
        };

        // Display details of each employee
        fullTimeEmployee.displayDetails();
        System.out.println();
        partTimeEmployee.displayDetails();
        System.out.println();
        contractEmployee.displayDetails();
    }
}