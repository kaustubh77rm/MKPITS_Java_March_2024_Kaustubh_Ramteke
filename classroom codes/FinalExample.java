package stud;
public class FinalExample {

    public static final int max = 100;
    private final String name;

    public FinalExample(String name) {
        this.name = name;
    }

    // Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Max value: "+max);
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample("Kaustubh");
        example.display();
        // You can't change the value of max as it's declared final
        // MAX_VALUE = 200; // This will give a compile-time error
    }
}