package stud;

public class BinarySearch
{
    public int binarySearch(int arr[], int number)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right)
        {
            int mid = left + (right-left) / 2;

            // Check if the number is at the middle index
            if (arr[mid] == number)
            {
                return mid;
            }

            // If number is greater, ignore left half
            if (arr[mid] < number)
            {
                left = mid + 1;
            }
            // If number is smaller, ignore right half
            else
            {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if not found
    }
}

/*
        // Create an array to search
        int[] array = {1, 5, 9, 12, 15, 20};

        // Number to search for
        int searchNumber = 1;

        // Create an instance of the BinarySearch class
        BinarySearch search = new BinarySearch();

        // Call the binarySearch method
        int index = search.binarySearch(array, searchNumber);

        // Check if the number was found
        if (index != -1)
        {
            System.out.println("Number " + searchNumber + " found at index: " + index);
        }
        else
        {
            System.out.println("Number " + searchNumber + " not found in the array.");
        }
*/