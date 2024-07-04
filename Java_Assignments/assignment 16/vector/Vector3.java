//3. Vector Search: Develop a Java program that searches for a specific element
//within a vector using the Vector class.
//Implement algorithms like linear search or binary search to
//efficiently locate the element.
package assn_16.vector;
import java.util.*;

public class Vector3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>() {{
            add(4);
            add(1);
            add(3);
            add(5);
            add(2);
        }};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Original vector: " + vector);
            System.out.println("1. Binary search");
            System.out.println("2. Linear search");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter integer to search: ");
                    int binarySearchElement = scanner.nextInt();
                    Collections.sort(vector);
                    //binary search requires sorted vector
                    int binarySearchResult = binarySearch(vector, binarySearchElement);
                    if (binarySearchResult != -1) {
                        System.out.println("Element found at index: " + binarySearchResult);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter integer to search: ");
                    int linearSearchElement = scanner.nextInt();
                    int linearSearchResult = linearSearch(vector, linearSearchElement);
                    if (linearSearchResult != -1) {
                        System.out.println("Element found at index: " + linearSearchResult);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    scanner.close();
                    return;

                default:
                    System.out.println("please enter 1, 2, or 3");
                    break;
            }
        }
    }

    // linear search algorithm
    public static int linearSearch(Vector<Integer> vector, int element) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == element) {
                return i;
            }
        }
        return -1;
    }

    // binary search algorithm
    public static int binarySearch(Vector<Integer> vector, int element) {
        int left = 0;
        int right = vector.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (vector.get(mid) == element) {
                return mid;
            }

            if (vector.get(mid) < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}