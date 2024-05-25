// Java Program to Demonstrate Working of Comparator Interface
package stud;
import java.lang.*;
import java.util.*;

// Class 1
class ComparableClass {

    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public ComparableClass(int rollno, String name, String address)
    {
        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    //print student details in main()
    public String toString()
    {
               return this.rollno + " " + this.name + " "
                + this.address;
    }
}

// Class 2
class Sortbyroll implements Comparator<ComparableClass> {
    // Sorting in ascending order of roll number
    public int compare(ComparableClass a, ComparableClass b)
    {
        return a.rollno - b.rollno;
    }
}

// Class 3
class Sortbyname implements Comparator<ComparableClass> {
    // Sorting in ascending order of name
    public int compare(ComparableClass a, ComparableClass b)
    {
        return a.name.compareTo(b.name);
    }
}

// Main class
class MainClass {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty ArrayList of Student type
        ArrayList<ComparableClass> ar = new ArrayList<ComparableClass>();


        ar.add(new ComparableClass(1, "David", "Nashik"));
        ar.add(new ComparableClass(3, "Akbar", "Jaipur"));
        ar.add(new ComparableClass(4, "Carlos", "Pune"));
        ar.add(new ComparableClass(2, "Baban", "Mumbai"));

        // Display message on console for better readability
        System.out.println("Unsorted:");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());

        // Display message on console for better readability
        System.out.println("\nSorted by rollno:");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());

        // Display message on console for better readability
        System.out.println("\nSorted by name:");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}