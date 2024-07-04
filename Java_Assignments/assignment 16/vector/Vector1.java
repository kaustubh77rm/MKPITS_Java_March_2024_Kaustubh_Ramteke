package assn_16.vector;

import java.util.Scanner;
import java.util.Vector;

public class Vector1 {
//1. Vector Operations: Implement a Java program that performs
// various operations on a vector, such as adding elements,
// removing elements, finding the size of the vector, and displaying its contents.
    public static void main(String[] args) {
        int input;
        Vector<Integer> vector = new Vector<>() {{
            add(11);
            add(32);
            add(24);
        }};
        System.out.println("Initial Vector: " + vector);
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add element");
            System.out.println("2. Delete element");
            System.out.println("3. Find size");
            System.out.println("4. Display elements");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            input = s.nextInt();

            switch (input) {
                case 1:
                    int addInt;
                    System.out.print("Enter integer to add: ");
                    addInt = s.nextInt();
                    vector.add(addInt);
                    System.out.println("Element added.");
                    break;

                case 2:
                    int delElement;
                    System.out.print("Enter integer to delete: ");
                    delElement = s.nextInt();
                    if (vector.remove(Integer.valueOf(delElement))) {
                        System.out.println("Element removed");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 3:
                    System.out.println("Size of vector: " + vector.size());
                    break;

                case 4:
                    System.out.println("Vector elements: " + vector);
                    break;

                case 5:
                    s.close();
                    return;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}