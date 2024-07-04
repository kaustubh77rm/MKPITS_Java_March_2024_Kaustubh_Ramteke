//2. Vector Sorting: Write a Java program that sorts
// a vector of integers in ascending order using the Vector class.
// Implement sorting algorithms such as bubble sort,
// selection sort, or insertion sort.
package assn_16.vector;
import java.util.*;

public class Vector2 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>() {{
            add(12);
            add(34);
            add(22);
            add(6);
        }};

        System.out.println("Original Vector: " + vector);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bubbleSort(vector);
                System.out.println("Sorted Vector (Bubble Sort): \n" + vector);
                break;
            case 2:
                selectionSort(vector);
                System.out.println("Sorted Vector (Selection Sort): \n" + vector);
                break;
            case 3:
                insertionSort(vector);
                System.out.println("Sorted Vector (Insertion Sort): \n" + vector);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                break;
        }

        scanner.close();
    }

    // Bubble sort algorithm
    public static void bubbleSort(Vector<Integer> vector) {
        int n = vector.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector.get(j) > vector.get(j + 1)) {
                    // Swap vector[j] and vector[j + 1]
                    int temp = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, temp);
                }
            }
        }
    }

    // Selection sort algorithm
    public static void selectionSort(Vector<Integer> vector) {
        int n = vector.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vector.get(j) < vector.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap vector[i] and vector[minIndex]
            int temp = vector.get(minIndex);
            vector.set(minIndex, vector.get(i));
            vector.set(i, temp);
        }
    }

    // Insertion sort algorithm
    public static void insertionSort(Vector<Integer> vector) {
        int n = vector.size();
        for (int i = 1; i < n; ++i) {
            int key = vector.get(i);
            int j = i - 1;

            // Move elements of vector[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && vector.get(j) > key) {
                vector.set(j + 1, vector.get(j));
                j = j - 1;
            }
            vector.set(j + 1, key);
        }
    }
}