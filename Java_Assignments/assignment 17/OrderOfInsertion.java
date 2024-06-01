//### Problem 2: Order of Insertion Preservation
//**Objective:** Create a program that reads a sequence of integers from user input and
// stores them in the order they were entered, ensuring no duplicates.
//**Requirements:**
//- Use `LinkedHashSet` to maintain the insertion order while storing unique integers.
//- Allow the user to input integers one by one and add them to the set.
//- Print the elements of the `LinkedHashSet` in the order they were entered.
package assn_17;

import java.util.*;

public class OrderOfInsertion {
    public static void main(String[] args) {
        LinkedHashSet<Integer> uniqueIntegers = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers one by one (type 'exit' to stop):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                uniqueIntegers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();

        System.out.println("Unique integers in the order they were entered:");
        for (int number : uniqueIntegers) {
            System.out.println(number);
        }
    }
}