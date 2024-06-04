//6. Finding Max and Min:
//Create a list of objects (e.g., custom objects with attributes like name and age)
//and use a stream to
//find the oldest and youngest objects based on a certain attribute (e.g., age).
package assignment_19;

public class MarksAgeClassforMaxMin {
    String name;
    int age;

    @Override
    public String toString() {
        return "MarksAgeClassforMaxMin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MarksAgeClassforMaxMin(String name, int age) {
        this.name = name;
        this.age = age;
    }
}