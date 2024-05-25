package stud;
public class MyClass
{
    private int value;

    // Default constructor
    public MyClass()
    {
        this.value = 1; // Default value
    }

    // Parameterized constructor
    public MyClass(int value)
    {
        this.value = value;
    }

    // Setter method for value
    public void setValue(int value)
    {
        this.value = value;
    }

    // Getter method for value
    public int getValue()
    {
        return value;
    }

    public static void main(String[] args)
    {
        // Creating objects using both constructors
        MyClass obj1 = new MyClass(); // Default constructor
        MyClass obj2 = new MyClass(10); // Parameterized constructor

        // Displaying values
        System.out.println("Value of obj1: " + obj1.getValue()); // Should output 0
        System.out.println("Value of obj2: " + obj2.getValue()); // Should output 10
    }
}