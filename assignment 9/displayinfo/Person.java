package displayinfo;

    public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
/*
    Person p1 = new Student("kaustubh",23,7);
    p1.displayInfo();
    Person p2 = new Teacher("rajesh sir",50,1);
    p2.displayInfo();
 */